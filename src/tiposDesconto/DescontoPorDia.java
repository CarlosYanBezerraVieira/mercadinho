package tiposDesconto;

import base.Desconto;
import enums.TiposPagamento;
import ferramentas.Carinho;
import java.util.Calendar;

public class DescontoPorDia extends Desconto {

    public DescontoPorDia(Desconto proximo) {
        super(proximo);
    }

    @Override
    public double calcularDesconto(Carinho carinhoDeCompras, TiposPagamento formaDePagamento) {
        Calendar calendar = Calendar.getInstance();
        int diaSemana = calendar.get(Calendar.DAY_OF_WEEK);

        switch (diaSemana) {
            case Calendar.WEDNESDAY:
                return carinhoDeCompras.valorBruto() * 0.10;

            case Calendar.SATURDAY:
                return carinhoDeCompras.valorBruto() * 0.10;
            default:
                return proximo.calcularDesconto(carinhoDeCompras, formaDePagamento);
        }

    }

}
