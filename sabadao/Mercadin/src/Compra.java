import java.util.ArrayList;

public class Compra {
  ArrayList<Produto> produtos = new ArrayList<>();

  public double valorGasto() {
    double soma = 0;

    for (Produto el : produtos) {
      soma += el.getPreco();
    }

    return soma;
  }

  public void imprimeItens() {
    for (Produto el : produtos) {
      System.out.println(el.getNome() + ",");
    }
  }
}
