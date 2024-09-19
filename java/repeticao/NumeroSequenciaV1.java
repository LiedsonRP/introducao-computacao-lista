package repeticao;

import java.util.Scanner;
import libraries.*;

public class NumeroSequenciaV1 {
    public static void main(String[] args) {
        
        final int INIT_INTERVAL = 3;
        final int INTERVAL_REASON = 2;
        int an = 2;
        int n = 0;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();
        Validation validation = new Validation();

        //inicio do programa

        terminal.writeProgramTitle("SEQUÊNCIA V1");

        System.out.print("\nQuais os N primeiros valores você quer consultar? ");
        n = input.nextInt();

        while (validation.checkIfNumberIsnegative(n) || validation.checkIfNumberEqualsZero(n) || n > 100) {
            terminal.errorMessage("O intervalo não pode ser um número negativo, maior que 100 ou igual 0!");
            System.out.print("\nQuais os N primeiros valores você quer consultar? ");
            n = input.nextInt()	;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print(an + " ");
            sum+=an;
            an = INIT_INTERVAL + INTERVAL_REASON * (i-1) + an; 
        }

        System.out.println("\n--------------------------------------");
        System.out.println("\nA soma dos valores é igual a " + sum);

    }
}
