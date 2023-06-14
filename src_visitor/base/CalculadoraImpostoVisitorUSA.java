package base;

import tiposProdutos.Alcoolico;
import tiposProdutos.Alimento;
import tiposProdutos.Fumo;

public class CalculadoraImpostoVisitorUSA extends ImpostoVisitor {
    private double impostoTotal;

    public double getImpostoTotal() {
        return impostoTotal;
    }

    @Override
    public double visitAlcoolico(Alcoolico alcoolico) {
        double impostoAlcoolico = alcoolico.getPreco() * 0.1; // Imposto de 5% para produtos alcoólicos
        impostoTotal += impostoAlcoolico;
        return impostoAlcoolico;
    }

    @Override
    public double visitAlimento(Alimento alimento) {
        double impostoAlimento = alimento.getPreco() * 0.01; // Imposto de 5% para produtos alcoólicos
        impostoTotal += impostoAlimento;
        return impostoAlimento;

    }

    @Override
    public double visitFumo(Fumo fumo) {
        double impostoFumo = fumo.getPreco() * 0.9; // Imposto de 5% para produtos alcoólicos
        impostoTotal += impostoFumo;
        return impostoFumo;
    }
}
