package tiposProdutos;

import base.ImpostoVisitor;
import base.Produto;

public class Fumo extends Produto {

    public Fumo(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto() {
        return getPreco() * 0.07; // Imposto de 5% para produtos alcoólicos
    }

    @Override
    public void accept(ImpostoVisitor visitor) {
        visitor.visit(this);
    }
}
