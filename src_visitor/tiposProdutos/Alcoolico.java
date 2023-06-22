package tiposProdutos;

import base.ImpostoVisitor;
import base.Produto;

public class Alcoolico extends Produto {

    public Alcoolico(String nome, double preco) {
        super(nome, preco);
    }

    @Override
    public double calcularImposto(ImpostoVisitor visitor) {
        return visitor.visitAlcoolico(this);

    }
}