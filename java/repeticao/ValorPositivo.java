package repeticao;
import libraries.*;
import java.util.Scanner;

public class ValorPositivo {
    
    public static void main(String[] args) {
        
        int num = 0;

        TerminalFormating terminal = new TerminalFormating();
        Validation validation = new Validation();
        Scanner input = new Scanner(System.in);

        //inicio do programa

        terminal.writeProgramTitle("TESTE: ACEITE APENAS VALORES POSITIVOS");

        System.out.println("\nDigite um número positivo: ");
        num = input.nextInt();

        while (validation.checkIfNumberIsnegative(num)) {
            terminal.errorMessage("Digite um número positivo!");
            System.out.println("\nDigite um número positivo: ");
            num = input.nextInt();
        }

        System.out.println("FIM DO PROGRAMA");
    }
}
