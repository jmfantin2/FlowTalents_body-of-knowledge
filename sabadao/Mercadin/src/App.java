import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        ControleAdmin cAdmin = new ControleAdmin();
        String tipo = "";

        while (!tipo.equals("X")) {
            System.out.println("(C) Comprador\n(A) Administrador\n(X) Encerrar");
            tipo = in.next().toUpperCase();
            if (tipo.equals("C")) {
                // cComprador.run()
            } else if (tipo.equals("A")) {
                cAdmin.run();
            } else {
                break;
            }
        }
        in.close();
    }
}
