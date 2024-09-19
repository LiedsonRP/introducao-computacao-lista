package repeticao;

import java.text.DecimalFormat;
import java.util.Scanner;

import libraries.TerminalFormating;
import libraries.Validation;

public class MaiorSomaMédiaPositivoNegativoV2 {
    
    public static void main(String[] args) {

        String repeat_program = ""; //Variável que guarda a resposta se o programa deve rodar novamente

        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();
        Validation validation = new Validation();
        DecimalFormat formatador = new DecimalFormat("0.00");

        //inicio do programa
        do {

            //inicializa as variáveis
            double sum = 0;
            double average = 0;
            double max_value = 0;
            double value = 0;
            double percent_positive_values = 0;
            double percent_negative_values = 0;
            double count_positives_values = 0;
            double count_negative_values = 0;
            
            int num_values = 0;
            
            //inicio da execução principal
            terminal.writeProgramTitle("MAIOR, SOMA E MÉDIA DE NÚMEROS POSITIVOS E NEGATIVOS");

            System.out.print("\nQuantos valores você quer digitar? " );
            num_values = input.nextInt();

            while(validation.checkIfNumberIsnegative(num_values) || validation.checkIfNumberEqualsZero(num_values) || num_values > 20) {
                terminal.errorMessage("O número de valores não pode ser negativo,  maior que 20 ou igual 0!");
                System.out.print("\nQuantos valores você quer digitar? " );
                num_values = input.nextInt();
            }

            max_value = value;

            for (int i = 1; i <= num_values; i++) {
                System.out.print("\nDigite o " + i + "º valor: " );
                value = input.nextDouble();

                if (value > max_value) {
                    max_value = value;
                }

                if (value > 0) {
                    count_positives_values+=1;
                } else if (value < 0) {
                    count_negative_values+=1;
                }

                sum+= value;
            }

            average = sum / num_values;
            percent_positive_values = (count_positives_values / num_values) * 100;
            percent_negative_values = (count_negative_values / num_values) * 100;

            System.out.println("\n----------------------------------------------");
            System.out.println("O maior valor digitado foi " + max_value);
            System.out.println("A soma dos valores é igual a " + sum);
            System.out.println("A média aritmética dos valores é igual a " + average);
            System.out.println("Porcentagem de valores positivos: " + formatador.format(percent_positive_values) + "%");
            System.out.println("Porcentagem de valores negativos: " + formatador.format(percent_negative_values) + "%");

            //pergunta se o código deve retornar novamente!
            System.out.println("\n----------------------------------------------\n\n");

            System.out.println("Gostaria de rodar o programa novamente [S/N]? ");
            repeat_program = input.nextLine().toUpperCase();

            while (!repeat_program.equals("S") && !repeat_program.equals("N")) {
                terminal.errorMessage("Resposta invalida! Digite apenas S (sim) ou N (não).");
                System.out.println("Gostaria de rodar o programa novamente [S/N]? ");
                repeat_program = input.nextLine().toUpperCase();    
            }

        } while(!repeat_program.equals("N"));

        System.out.println("PROGRAMA FINALIZADO!");
    }
}
