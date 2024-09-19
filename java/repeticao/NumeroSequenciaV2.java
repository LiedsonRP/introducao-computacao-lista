package repeticao;

import java.util.Scanner;

import libraries.TerminalFormating;
import libraries.Validation;

public class NumeroSequenciaV2 {
    
    public static void main(String[] args) {
        
        int n = 0;
        double numerador = 1;
        double denominador = 2;
        double sum = 0;

        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();
        Validation validation = new Validation();

        //inicio do programa

        terminal.writeProgramTitle("SEQUÊNCIA V2");

        System.out.print("\nDigite o N valores: ");
        n = input.nextInt();

        while (validation.checkIfNumberEqualsZero(n) || validation.checkIfNumberIsnegative(n) || n > 50) {
            terminal.errorMessage("O intervalo não pode ser um número negativo, maior que 50 ou igual 0!");
            System.out.print("\nDigite o N valores: ");
            n = input.nextInt();

        }

        for (int i = 0; i < n; i++) {
            sum+= (numerador / denominador);
            numerador+=1;
            denominador+=1;
        }

        System.out.println("\n-------------------------------------\nA soma de todos os valores é igual a " + sum);
    }
}
