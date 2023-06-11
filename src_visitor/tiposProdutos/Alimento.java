package tiposProdutos;

import base.ImpostoVisitor;
import base.Produto;

public class Alimento extends Produto {

    public Alimento(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        return getPreco() * 0.03; // Imposto de 5% para produtos alcoólicos
    }

    @Override
    public void accept(ImpostoVisitor visitor) {
        visitor.visit(this);
    }
}