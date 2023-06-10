package tiposProdutos;

import base.Produto;

public class Fumo extends Produto {

    public Fumo(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImpoosto() {

        throw new UnsupportedOperationException("Unimplemented method 'calcularImpoosto'");
    }

}
