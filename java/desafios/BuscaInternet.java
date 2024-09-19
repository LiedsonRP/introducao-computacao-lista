package desafios;

import java.util.Scanner;
import libraries.TerminalFormating;

public class BuscaInternet {
    public static void main(String[] args) {
        int quant_click_3_click = 0;
        int quant_click_1_click = 0;

        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();

        terminal.writeProgramTitle("Estimativa de Busca na Internet");

        System.out.println("Quantos cliques o 3º link recebeu?");
        quant_click_3_click = input.nextInt();

        while (quant_click_3_click > 1000 || quant_click_3_click < 1) {
            terminal.errorMessage("O número de cliques deve estar entre 1 e 1000");
            System.out.println("Quantos cliques o 3º link recebeu?");
            quant_click_3_click = input.nextInt();
        }

        quant_click_1_click = quant_click_3_click * 4;

        System.out.println("------------------------------------------------------------");
        System.out.println(quant_click_1_click);

    }
}
