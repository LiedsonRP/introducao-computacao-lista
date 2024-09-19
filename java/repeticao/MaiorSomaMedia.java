package repeticao;

import java.util.Scanner;

import libraries.TerminalFormating;
import libraries.Validation;

public class MaiorSomaMedia {
    public static void main(String[] args) {

        double sum = 0;
        double average = 0;
        double max_value = 0;
        double value = 0;
        
        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();
        Validation validation = new Validation();

        //inicio do programa

        terminal.writeProgramTitle("MAIOR, SOMA E MÉDIA");

        System.out.print("Digite o 1º valor: " );
        value = input.nextDouble();

        while(validation.checkIfNumberIsnegative(value)) {
            terminal.errorMessage("O valor não pode ser negativo!");
            System.out.print("Digite o 1º valor: " );
            value = input.nextDouble();
        }

        max_value = value;
		sum+=value;

        for (int i = 2; i <= 10; i++) {
            System.out.print("Digite o " + i + "º valor: " );
            value = input.nextDouble();

            while(validation.checkIfNumberIsnegative(value)) {
                terminal.errorMessage("O valor não pode ser negativo!");
                System.out.print("Digite o " + i + "º valor: " );
                value = input.nextDouble();
            }

            if (value > max_value) {
                max_value = value;
            }

            sum+= value;
        }

        average = sum / 10;

        System.out.println("O maior valor digitado foi " + max_value);
        System.out.println("A soma dos valores é igual a " + sum);
        System.out.println("A média aritmética dos valores é igual a " + average);
    }
}
