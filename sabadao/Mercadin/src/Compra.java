import java.util.ArrayList;

public class Compra {
  ArrayList<Produto> produtos = new ArrayList<>();
  /* Cria um ArrayList de items do tipo Produto
   ArrayList = Uma classe para coleções, você
   criar seus objetos e os agrupa dentro da ArrayList,
   assim podendo realizar varias operações neles como:
   adicionar/retirar elementos, ordena-los, retirar ele
   mentos, etc
  */
  public double valorGasto() {
    double soma = 0;

    for (Produto el : produtos) {
      soma += el.getPreco();
    }
    // (for)para cada elemento do tipo Produto dentro do arrayList Produtos
    // adicione seu preço para a variavel soma.

    return soma;
  }

  public void imprimeItens() {
    for (Produto el : produtos) {
      System.out.println(el.getNome() + ",");
    }

    // para cada elemento do tipo Produto dentro do array produtos
    // printe no console o nome do elemento + ','
  }
}
