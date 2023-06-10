package tiposDesconto;

import base.Desconto;
import enums.TiposPagamento;
import ferramentas.Carinho;

public class DescontoPorPagamentoAVista extends Desconto {

    public DescontoPorPagamentoAVista(Desconto proximo) {
        super(proximo);
    }

    @Override
    public double calcularDesconto(Carinho carinhoDeCompras, TiposPagamento formaDePagamento) {

        if (formaDePagamento == TiposPagamento.DINHEIRO
                || formaDePagamento == TiposPagamento.PIX) {
            return carinhoDeCompras.valorBruto() * 0.10;
        }
        return proximo.calcularDesconto(carinhoDeCompras, formaDePagamento);
    }

}
