import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner in = new Scanner(System.in);
        String opt = "";
        while (!opt.equals("X")) {
            System.out.println("(P) Cadastrar produto\n(S) Executar simulação\n(X) Encerrar");
            opt = in.next().toUpperCase();
            if (opt.equals("P")) {
                System.out.println("Vc escolheu P meus prbns");
            } else if (opt.equals("S")) {
                System.out.println("Vc escolheu S meus prbns");
            }
        }
        in.close();
    }
}
