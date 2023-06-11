package base;

import tiposProdutos.Alcoolico;
import tiposProdutos.Alimento;
import tiposProdutos.Fumo;

public class CalculadoraImpostoVisitor extends ImpostoVisitor {
    private double impostoTotal;

    public double getImpostoTotal() {
        return impostoTotal;
    }

    @Override
    public void visit(Alcoolico alcoolico) {
        impostoTotal += alcoolico.calcularImposto();
    }

    @Override
    public void visit(Alimento alimento) {
        impostoTotal += alimento.calcularImposto();
    }

    @Override
    public void visit(Fumo fumo) {
        impostoTotal += fumo.calcularImposto();
    }
}
