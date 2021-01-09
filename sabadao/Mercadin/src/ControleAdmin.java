import java.util.Scanner;

import jdk.jshell.execution.Util;

public class ControleAdmin {

  public void run() {
    Scanner in = new Scanner(System.in);

    Utilities utils = new Utilities();
    Estoque stock = new Estoque();

    String opt = "";
    while (!opt.equals("X")) {
      System.out.println("(P) Cadastrar produto\n(S) Executar simulação\n(X) Sair");

      opt = in.next().toUpperCase();

      if (opt.equals("P")) {

        System.out.println("Informe o nome do produto:\n");
        String nome = in.next();

        System.out.println("Informe o preço do produto:\n");
        String preco = in.next();

        Produto prod = new Produto(nome, Double.valueOf(preco));
        stock.adicionarProduto(prod);

      } else if (opt.equals("S")) {

        Cliente cli = new Cliente(utils.geraNome(), utils.geraCompra(stock.produtos));

        System.out.println("\n\n" + cli.getNome() + " comprou: ");
        cli.getCompra().imprimeItens();

        System.out.println("por " + cli.getCompra().valorGasto() + "\n");
      }
    }
  }
}
