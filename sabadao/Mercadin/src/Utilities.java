import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Utilities {
  ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Sophie", "Damares", "Marco", "Joanna", "Rafa", "Roberta",
      "Jonathan", "Nathalie", "Júnior", "Guilherme", "Victória", "Pedro", "Mayra", "Audrey", "JM"));
  /* Cria um ArrayList de items do tipo String, e
  imediatamente o popula com os nomes dos integrantes
  do FlowTalents
  */

  Random rand = new Random();
  //Instancia classe que gera uma sequencia de numeros aleatorios

  public String geraNome() {
    return nomes.get(rand.nextInt(15));
  }
  //Aleatoriamente pega um dos strings contidos
  // dentro do ArrayList nomes


  public Compra geraCompra(ArrayList<Produto> produtos) {
    Compra compra = new Compra();
    for (Produto el : produtos) {
      if (rand.nextInt(2) == 1) {
        compra.produtos.add(el);
      }
    }

    /* metodo que aceita como parametro um ArrayList com
    items do tipo Produto. executa um laço que: 
    (for)para cada elemento do tipo Produto dentro de produtos
    (if)se o numero aleatorio gerado entre 1 e 0 for 1 
    ele adiciona este elemento ao ArrayList produtos dentro de compra.
    */

    return compra;
  }
}
