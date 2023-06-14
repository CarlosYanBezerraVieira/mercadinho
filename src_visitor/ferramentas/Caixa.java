package ferramentas;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

import base.CalculadoraImpostoVisitorBR;
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
        ImpostoVisitor visitor = new CalculadoraImpostoVisitorBR();
        carinho.accept(visitor);
        double impostoTotal = ((CalculadoraImpostoVisitorBR) visitor).getImpostoTotal();

        double total = valorBruto - valorDesconto + impostoTotal;

        // arredondando
        valorBruto = formatNumber(valorBruto);
        valorDesconto = formatNumber(valorDesconto);
        impostoTotal = formatNumber(impostoTotal);
        total = formatNumber(total);

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

    private double formatNumber(double valor) {

        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        symbols.setDecimalSeparator('.');
        symbols.setGroupingSeparator(',');

        DecimalFormat df = new DecimalFormat("#.00", symbols);
        df.setRoundingMode(java.math.RoundingMode.DOWN);
        String valorFormatado = df.format(valor);
        System.out.println(valorFormatado);
        double valorArredondado = Double.parseDouble(valorFormatado);
        return valorArredondado;
    }

}
