package ferramentas;

import base.ImpostoVisitor;
import base.Produto;

import java.util.List;

public class Carinho {

    private List<Produto> items;

    public Carinho(List<Produto> items) {
        this.items = items;
    }

    public List<Produto> getItems() {
        return items;
    }

    public double valorBruto() {
        double total = 0;
        for (Produto produto : items) {
            total += produto.getPreco();
        }
        return total;
    }

    public void accept(ImpostoVisitor visitor) {
        for (Produto produto : items) {
            produto.accept(visitor);
        }
    }

    public Produto[] getProdutos() {
        return items.toArray(new Produto[0]);
    }

}
