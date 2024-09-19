package matrizes;

import java.util.Arrays;
import java.util.Scanner;

import libraries.TerminalFormating;

public class OrdemAlfabetica {
    
    public static void main(String[] args) {
        final int REGISTER_NUMBER = 20;

        String[] name = new String[REGISTER_NUMBER];

        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();

        //inicio do programa
        terminal.writeProgramTitle("ORDEM ALFABÉTICA");

        for(int i = 1; i <= REGISTER_NUMBER; i++) {
            System.out.print("\nDigite o " + i + "º nome: ");
            name[i-1] = input.next();
        }
        
        Arrays.sort(name);

        System.out.println("-----------------------------------");
        for (int i = 0 ; i < REGISTER_NUMBER; i++) {
            System.out.print(name[i] + ", ");
        }
    }
}
