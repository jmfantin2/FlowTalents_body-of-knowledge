import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Utilities utils = new Utilities();
        Scanner in = new Scanner(System.in);

        Prateleira prat = new Prateleira();

        String opt = "";
        while (!opt.equals("X")) {
            System.out.println("(P) Cadastrar produto\n(S) Executar simulação\n(X) Encerrar");
            opt = in.next().toUpperCase();

            if (opt.equals("P")) {

                System.out.println("Informe o nome do produto:\n");
                String nome = in.next();

                System.out.println("Informe o preço do produto:\n");
                String preco = in.next();

                Produto prod = new Produto(nome, Double.valueOf(preco));
                prat.adicionarProduto(prod);

            } else if (opt.equals("S")) {
                Cliente cli = new Cliente(utils.geraNome());
                System.out.println("\n\n" + cli.getNome());
            }
        }
        in.close();
    }
}
