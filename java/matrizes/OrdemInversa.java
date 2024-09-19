package matrizes;

import java.util.Scanner;

import libraries.TerminalFormating;
import libraries.Validation;

public class OrdemInversa {

    public static void main(String[] args) {

        int[] values = new int[10];

        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();

        //inicio do programa
        terminal.writeProgramTitle("ORDEM INVERSA!");

        for (int i = 0; i < 10; i++) {
            System.out.print("\nDigite o " + (i + 1)  + "º valor: ");
            values[i] = input.nextInt();
        }

        System.out.println("\n---------------------------------------\n");
        for(int i = values.length - 1; i >= 0; i--) {
            System.out.print(values[i] + " ");
        }
    }
}
