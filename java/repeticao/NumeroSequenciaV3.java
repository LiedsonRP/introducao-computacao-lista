package repeticao;

import java.util.Scanner;

import libraries.TerminalFormating;
import libraries.Validation;

import java.text.DecimalFormat;

public class NumeroSequenciaV3 {
	
	public static void main(String args[]) {
		
		int n = 0;
		int va = 2;
        double numerador = 0;
        double denominador = 1;
        double sum = 0;
		int a1 = 3;
		int r = 2;

        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();
        Validation validation = new Validation();
		DecimalFormat formatador = new DecimalFormat("0.00");
		
		//inicio do programa

        terminal.writeProgramTitle("SEQUÊNCIA V3");
		
		System.out.print("Quais os 'N' primeiros valores que você quer? ");
		n = input.nextInt();

		while (validation.checkIfNumberIsnegative(sum) || n > 50) {
			System.out.print("Quais os 'N' primeiros valores que você quer? ");
			n = input.nextInt();
		}

		for (int i = 0; i < n; i++) {
			numerador = va + (i * (a1 + (a1 + (i - 1) * r))) / 2;
			denominador = (i + 1) * (i + 1) * (i + 1);
			
			sum+= (numerador / denominador);
		}

		System.out.println("--------------------------------------------");
		System.out.println("A soma de todos o valores é igual a " + formatador.format(sum));

	}
}