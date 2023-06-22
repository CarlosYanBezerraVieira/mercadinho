import java.util.ArrayList;
import java.util.List;

import base.Produto;
import enums.TiposPagamento;
import ferramentas.Caixa;
import ferramentas.Carinho;
import tiposProdutos.Alcoolico;
import tiposProdutos.Alimento;
import tiposProdutos.Fumo;

public class App {
    public static void main(String[] args) throws Exception {

        Alimento arroz = new Alimento("Arroz", 7);
        Alcoolico cerveja = new Alcoolico("cerveja", 6);
        Fumo cigarro = new Fumo("cigarro", 4);

        List<Produto> produtos = new ArrayList<Produto>();

        produtos.add(arroz);
        produtos.add(cerveja);
        produtos.add(cigarro);

        Carinho carrinho = new Carinho(produtos);

        Caixa caixa = new Caixa(TiposPagamento.PIX, carrinho);

        caixa.totalDaCompra();

    }
}
