package matrizes;

import java.util.Scanner;

import libraries.TerminalFormating;
import libraries.Validation;

public class ProdutoDaMatrizV1 {

    public static void main(String[] args) {
        
        int[] values = new int[20];
        int multiply = 0;

        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();

        terminal.writeProgramTitle("ORDEM INVERSA!");

        for (int i = 0; i < values.length; i++) {
            System.out.print("\nDigite o " + (i + 1)  + "º valor: ");
            values[i] = input.nextInt();
        }

        System.out.print("\nQual o valor para ser a constante multiplicativa: ");
        multiply = input.nextInt();

        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] * multiply;
        }

        System.out.println("\n----------------------------------------\n");

        for (int i = 0; i < values.length; i++) {
            System.out.print(values[i] + " ");
        }

    }
}
