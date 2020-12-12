import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

public class Utilities {
  ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Sophie", "Damares", "Marco", "Joanna", "Rafa", "Roberta",
      "Jonathan", "Nathalie", "Júnior", "Guilherme", "Victória", "Pedro", "Mayra", "Audrey", "JM"));

  Random rand = new Random();

  public String geraNome() {
    return nomes.get(rand.nextInt(15));
  }

  public Compra geraCompra(ArrayList<Produto> produtos) {
    Compra compra = new Compra();
    for (Produto el : produtos) {
      if (rand.nextInt(2) == 1) {
        compra.produtos.add(el);
      }
    }
    return compra;
  }
}
