package tiposProdutos;

import base.ImpostoVisitor;
import base.Produto;

public class Fumo extends Produto {

    public Fumo(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto(ImpostoVisitor visitor) {
        return visitor.visitFumo(this);
    }
}
