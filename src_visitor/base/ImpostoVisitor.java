package base;

import tiposProdutos.Alcoolico;
import tiposProdutos.Alimento;
import tiposProdutos.Fumo;

public abstract class ImpostoVisitor {
    public abstract double visitAlcoolico(Alcoolico alcoolico);

    public abstract double visitAlimento(Alimento alimento);

    public abstract double visitFumo(Fumo fumo);
}
