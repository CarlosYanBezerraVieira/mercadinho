package base;

import tiposProdutos.Alcoolico;
import tiposProdutos.Alimento;
import tiposProdutos.Fumo;

public abstract class ImpostoVisitor {
    public abstract void visit(Alcoolico alcoolico);
    public abstract void visit(Alimento alimento);
    public abstract void visit(Fumo fumo);
}
