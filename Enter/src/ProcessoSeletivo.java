
import java.util.Scanner;


public class ProcessoSeletivo extends Exception {
    public ProcessoSeletivo(String message) {
        super(message);
    }
}

    public static void main(String[] args) {
        Scanner terminal = new Scanner(System.in);
        System.out.println("Digit o primeiro parametro:");
        int parametroUm = terminal.nextInt();
        System.out.println("Digit o segundo parametro:");
        int parametroDois = terminal.nextInt();

        try {
            // Chamando o método contend a logic de contagem
            contar(parametroUm, parametroDois);
        }
        catch (ParametrosInvalidosException exception) {
            // Imprimir a message: O segundo parametro deve ser maior que o primeiro
            System.out.println(exception.getMessage());
        }
    }
