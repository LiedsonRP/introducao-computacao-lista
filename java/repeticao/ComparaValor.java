package repeticao;
import libraries.TerminalFormating;
import java.util.Scanner;

public class ComparaValor {
    
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;

        TerminalFormating terminal = new TerminalFormating();
        Scanner input = new Scanner(System.in);

        //inicio do programa
        terminal.writeProgramTitle("COMPARA VALORES");

        System.out.print("\nDigite o primeiro valor: ");
        num1 = input.nextInt();

        System.out.print("\nDigite um segundo valor maior que " + num1 + ": ");
        num2 = input.nextInt();

        while (num2 < num1) {
            terminal.errorMessage("Digite um número maior que " + num1);
            System.out.print("\nDigite um segundo valor maior que " + num1 + ": ");
            num2 = input.nextInt();
        }

        System.out.println("FIM DO PROGRAMA");
    }
}
