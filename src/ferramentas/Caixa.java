package ferramentas;

import base.Desconto;
import enums.TiposPagamento;
import tiposDesconto.DescontoPorDia;
import tiposDesconto.DescontoPorPagamentoAVista;
import tiposDesconto.SemDesconto;

public class Caixa {
    protected TiposPagamento formaPagamento;
    protected Carinho carinho;

    public Caixa(TiposPagamento formaPagamento, Carinho carrinho) {
        this.carinho = carrinho;
        this.formaPagamento = formaPagamento;
    }

    public void totalDaCompra() {
        double valorBruto = carinho.valorBruto();
        double valorDesconto = calcularDesconto(valorBruto);
        double valorTotal = valorBruto - valorDesconto;
        System.out.println("O total é de: " + valorTotal);

    }

    private double calcularDesconto(double valorBruto) {
        Desconto desconto = new DescontoPorPagamentoAVista(new DescontoPorDia(new SemDesconto()));
        return desconto.calcularDesconto(carinho, formaPagamento);

    }

}
