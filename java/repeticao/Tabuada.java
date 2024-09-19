package repeticao;
import libraries.*;
import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        
        int tab_number = 0;

        TerminalFormating terminal = new TerminalFormating();
        Scanner input = new Scanner(System.in);
        Validation validation = new Validation();
        
        //inicio do programa
        terminal.writeProgramTitle("TABUADA DE NÚMEROS POSITIVOS");

        System.out.print("\nDigite o número que você deseja ver a tabuada: ");
        tab_number = input.nextInt();

        while(validation.checkIfNumberIsnegative(tab_number)) {
            terminal.errorMessage("O programa apenas aceita números positivos!");
            System.out.print("\nDigite o número que você deseja ver a tabuada: ");
            tab_number = input.nextInt();
        }

        System.out.println("\n-------------------------TABUADA DE " + tab_number + "-------------------------");

        for (int i = 1; i <= 10; i++) {
            System.out.println(tab_number + " X " + i + " = " + tab_number * i);
        }
    }   
}

