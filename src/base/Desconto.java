package base;

import enums.TiposPagamento;
import ferramentas.Carinho;

public abstract class Desconto {
    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public abstract double calcularDesconto(Carinho carinhoDeCompras, TiposPagamento formaPagamento);
}
