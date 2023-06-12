package base;

import tiposProdutos.Alcoolico;
import tiposProdutos.Alimento;
import tiposProdutos.Fumo;

public abstract class ImpostoVisitor {
    public abstract double visit(Alcoolico alcoolico);

    public abstract double visit(Alimento alimento);

    public abstract double visit(Fumo fumo);
}
