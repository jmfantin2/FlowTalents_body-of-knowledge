import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Utilities utils = new Utilities();

        Scanner in = new Scanner(System.in);
        // criando um scanner, que observa o teclado

        Prateleira prat = new Prateleira();

        String opt = "";

        // rode enquanto opt não for igual a "X" / for diferente de "X"
        while (!opt.equals("X")) {
            System.out.println("(P) Cadastrar produto\n(S) Executar simulação\n(X) Encerrar");

            opt = in.next().toUpperCase();
            // receba a proxima coisa que o teclado enviar
            // em letras maiusculas


            // se opt for P
            if (opt.equals("P")) {

                System.out.println("Informe o nome do produto:\n");
                String nome = in.next();

                System.out.println("Informe o preço do produto:\n");
                String preco = in.next();

                Produto prod = new Produto(nome, Double.valueOf(preco));
                prat.adicionarProduto(prod);

                /* printa mensagens pedindo para informar nome, preço
                armazena em variaveis do tipo string as respostas enviadas
                pelo teclado, cria um novo produto utilizando o nome e o 
                preço enviados(converte o preço para o tipo Double),
                adiciona o produto a prateleira
                */
            } else if (opt.equals("S")) {
                // se opt for S


                Cliente cli = new Cliente(utils.geraNome(), utils.geraCompra(prat.produtos));

                System.out.println("\n\n" + cli.getNome() + " comprou: ");

                cli.getCompra().imprimeItens();

                System.out.println("por " + cli.getCompra().valorGasto() + "\n");

                /* cria um novo cliente, utilizando os metodos dentro do utils
                para gerar nome e as compras(com os produtos da prateleira)
                printa que cliente de tal nome comprou:
                dai vem a loucura -> chama o metodo getCompra dentro do cliente,
                que retorna a Compra e chama o metodo imprimeItens da Compra, 
                para imprimir os itens no console.
                finalmente imprime no console "por + (chama metodo getCompra que
                retorna a Compra e dai chama o metodo valorGasto)"
                */
            }
        }
        in.close();
        // diz pro scanner para de observar o teclado
    }
}
