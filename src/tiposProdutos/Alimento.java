package tiposProdutos;

import base.Produto;

public class Alimento extends Produto {

    public Alimento(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImpoosto() {

        throw new UnsupportedOperationException("Unimplemented method 'calcularImpoosto'");
    }

}
