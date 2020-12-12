import java.util.ArrayList;

public class Prateleira {
  public ArrayList<Produto> produtos = new ArrayList<>();

  /**
   * a classe já tá implementando isso sem vc ver :) public Prateleira(){ produtos
   * = null; }
   */

  public void adicionarProduto(Produto p) {
    produtos.add(p);
    System.out.println("\nProduto adicionado!");
    for (Produto el : produtos) {
      System.out.println(el.getNome() + ": " + el.getPreco());
    }
    System.out.println();
  }

}
