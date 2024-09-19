package repeticao;

import java.util.Scanner;

import libraries.TerminalFormating;
import libraries.Validation;

public class Fatorial {
    public static void main(String[] args) {

        int number = 0;
        int fatorial_result = 1;

        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();
        Validation validation = new Validation();

        //inicio do programa

        terminal.writeProgramTitle("CALCULO DE FATORIAL!");

        System.out.print("\nValor para calcular o fatorial: ");
        number = input.nextInt();

        while(validation.checkIfNumberIsnegative(number) || validation.checkIfNumberEqualsZero(number)) {
            terminal.errorMessage("O valor não pode ser negativo ou igual a 0");
            System.out.print("\nValor para calcular o fatorial: ");
            number = input.nextInt();
        }

        System.out.println("\n-----------------------------------------");

        for (int i = number; i != 1; i-- ) {
            System.out.print(i + " ");
            fatorial_result*=i;
        }

        System.out.println("\nFatorial Final: " + fatorial_result);
    }
}
