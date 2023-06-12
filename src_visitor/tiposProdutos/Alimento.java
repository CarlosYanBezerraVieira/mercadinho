package tiposProdutos;

import base.ImpostoVisitor;
import base.Produto;

public class Alimento extends Produto {

    public Alimento(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto(ImpostoVisitor visitor) {
        return visitor.visit(this);
    }
}