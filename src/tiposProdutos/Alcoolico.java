package tiposProdutos;

import base.Produto;

public class Alcoolico extends Produto {

    public Alcoolico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImpoosto() {

        throw new UnsupportedOperationException("Unimplemented method 'calcularImpoosto'");
    }

}
