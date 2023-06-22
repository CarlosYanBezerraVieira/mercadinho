package tiposDesconto;

import base.Desconto;
import enums.TiposPagamento;
import ferramentas.Carinho;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);

    }

    @Override
    public double calcularDesconto(Carinho carinhoDeCompras, TiposPagamento formaPagamento) {
        return 0;
    }

}
