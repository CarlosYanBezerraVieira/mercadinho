package ferramentas;

import java.util.ArrayList;
import java.util.List;

import base.Produto;

public class Carinho {

    List<Produto> items = new ArrayList<Produto>();

    public Carinho(List<Produto> items) {
        this.items = items;
    }

    public List<Produto> getItems() {
        return items;
    }

    public double valorBruto() {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getPreco();
        }
        return total;
    }

}
