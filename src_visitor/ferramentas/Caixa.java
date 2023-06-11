package ferramentas;

import base.CalculadoraImpostoVisitor;
import base.Desconto;
import base.ImpostoVisitor;
import base.Produto;
import enums.TiposPagamento;
import tiposDesconto.DescontoPorDia;
import tiposDesconto.DescontoPorPagamentoAVista;
import tiposDesconto.SemDesconto;

public class Caixa {
    protected TiposPagamento formaPagamento;
    protected Carinho carinho;

    public Caixa(TiposPagamento formaPagamento, Carinho carinho) {
        this.carinho = carinho;
        this.formaPagamento = formaPagamento;
    }

    public void totalDaCompra() {
        double valorBruto = carinho.valorBruto();
        double valorDesconto = calcularDescontoDisponiveis(valorBruto);

        // cálculo imposto
        ImpostoVisitor visitor = new CalculadoraImpostoVisitor();
        carinho.accept(visitor);
        double impostoTotal = ((CalculadoraImpostoVisitor) visitor).getImpostoTotal();

        double total = valorBruto - valorDesconto + impostoTotal;

        // arredondando
        valorBruto = Math.round(valorBruto * 100.0) / 100.0;
        valorDesconto = Math.round(valorDesconto * 100.0) / 100.0;
        impostoTotal = Math.round(impostoTotal * 100.0) / 100.0;
        total = Math.round(total * 100.0) / 100.0;

        System.out.println("Produtos:");
        for (Produto produto : carinho.getProdutos()) {
            System.out.println(produto.getNome());
        }
        System.out.println();
        System.out.println("Subtotal: R$" + valorBruto);
        System.out.println("Desconto: R$" + valorDesconto);
        System.out.println("Imposto total: R$" + impostoTotal);
        System.out.println("Total: R$" + total);
    }

    private double calcularDescontoDisponiveis(double valorBruto) {
        Desconto desconto = new DescontoPorPagamentoAVista(new DescontoPorDia(new SemDesconto()));
        return desconto.calcularDesconto(carinho, formaPagamento);
    }
}
