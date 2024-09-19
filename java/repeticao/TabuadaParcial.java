package repeticao;

import libraries.TerminalFormating;
import libraries.Validation;
import java.util.Scanner;

public class TabuadaParcial {
     public static void main(String[] args) {
        
        int tab_number = 0;
        int interval_begin = 0;
        int interval_end = 0;

        TerminalFormating terminal = new TerminalFormating();
        Scanner input = new Scanner(System.in);
        Validation validation = new Validation();
        
        //inicio do programa
        terminal.writeProgramTitle("TABUADA PARCIAL DE NÚMEROS POSITIVOS");

        System.out.print("\nDigite o número que você deseja ver a tabuada: ");
        tab_number = input.nextInt();

        while(validation.checkIfNumberIsnegative(tab_number)) {
            terminal.errorMessage("O programa apenas aceita números positivos!");
            System.out.print("\nDigite o número que você deseja ver a tabuada: ");
            tab_number = input.nextInt();
        }

        System.out.println("\n------------------------------\nAgora precisamos saber o intervalo da tabuada\n------------------------------");
        
        System.out.print("\nInicio do intervalo: ");
        interval_begin = input.nextInt();

        while (validation.checkIfNumberIsnegative(interval_begin) || validation.checkIfNumberEqualsZero(interval_begin)) {
            terminal.errorMessage("O número do intervalo não pode ser um número negativo ou 0!");
            System.out.print("\nInicio do intervalo: ");
            interval_begin = input.nextInt();
        }

        System.out.print("\nFinal do intervalo: ");
        interval_end = input.nextInt();

        while (interval_end < interval_begin) {
            terminal.errorMessage("O final do intervalo deve ser maior que o início!");
            System.out.print("\nFinal do intervalo: ");
            interval_end = input.nextInt();
        }

        System.out.println("\n-------------------------TABUADA DE " + tab_number + "-------------------------");

        for (int i = interval_begin; i <= interval_end; i++) {
            System.out.println(tab_number + " X " + i + " = " + tab_number * i);
        }
    } 
}
