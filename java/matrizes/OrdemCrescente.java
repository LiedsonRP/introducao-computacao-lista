package matrizes;

import java.util.Scanner;
import java.util.Arrays;

import libraries.TerminalFormating;

public class OrdemCrescente {
    
    public static void main(String[] args) {

        final int REGISTER_NUMBER = 20;

        int[] value = new int[REGISTER_NUMBER];

        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();

        //inicio do programa
        terminal.writeProgramTitle("ORDEM CRESCENTE");

        for(int i = 1; i <= REGISTER_NUMBER; i++) {
            System.out.print("\nDigite o " + i + "º valor: ");
            value[i-1] = input.nextInt();
        }
        
        Arrays.sort(value);

        System.out.println("-----------------------------------");
        for (int i = 0 ; i < REGISTER_NUMBER; i++) {
            System.out.print(value[i] + " ");
        }
    }
}
