package estrutura_selecao;
import java.util.Scanner;
import libraries.*;
import java.text.DecimalFormat;


public class PesoIdeal2 {

    /**
     * Verifica em que parte da tabela masculina o imc se encaixa
     * 
     * @param imc
     * @return
     */
    public static String manTable (double imc) {
        if (imc < 20) {
		    return "Abaixo do peso";
		} else if (imc >= 25) {
		    return "Acima do peso";
		} else {
		    return "Peso ideal";
		}
    }

    /**
     * Verifica em que parte da tabela feminina o imc se encaixa
     * 
     * @param imc Double contendo o IMC
     * @return Uma String contendo a categoria da tabela
     */
    public static String womanTable (double imc) {
        if (imc < 19) {
		    return "Abaixo do peso";
		} else if (imc >= 24) {
		    return "Acima do peso";
		} else {
		    return "Peso ideal";
		}
    }
    
    public static void main(String[] args) {
        double weight = 0;
	    double heigth = 0;
        String gender = "";  
	    double imc = 0;
	    String situation = "";
	    
	    Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();
        Validation validation = new Validation();
        DecimalFormat formatador = new DecimalFormat("#.00");

	    
	    //inicio do programa
	    terminal.writeProgramTitle("CALCULADORA DE IMC POR GÊNERO");

        System.out.print("\nQual o gênero biológico da pessoa? [M/F] ");
		gender = input.nextLine().toUpperCase();

        while(!gender.equals("M") && !gender.equals("F")) {
            terminal.errorMessage("O gênero listado não foi adicionado no sistema, apenas M - masculino e F - Feminino");
            System.out.print("\nQual o gênero biológico da pessoa? [M/F] ");
		    gender = input.nextLine().toUpperCase();
        }
	    
		System.out.print("\nDigite o peso da pessoa (kg): ");
		weight = input.nextDouble();

        while(validation.checkIfNumberIsnegative(weight) || validation.checkIfNumberEqualsZero(weight)) {
            terminal.errorMessage("O valor do peso não pode ser um número negativo ou igual a 0");
            System.out.print("\nDigite o peso da pessoa (kg): ");
		    weight = input.nextDouble();
        }
		
		System.out.print("\nDigite a altura da pessoa (m): ");
		heigth = input.nextDouble();

        while (validation.checkIfNumberIsnegative(heigth) || validation.checkIfNumberEqualsZero(heigth)) {
            terminal.errorMessage("O valor do peso não pode ser um número negativo ou igual a 0");
            System.out.print("\nDigite a altura da pessoa (m): ");
		    heigth = input.nextDouble();
        }
	
		imc = weight / (heigth * heigth);

        if (gender.equals("M")) {
            situation = manTable(imc);
        } else {
            situation = womanTable(imc);
        }
		
		System.out.println("--------------------------------------\n");
		
		System.out.println("IMC: " + formatador.format(imc));
		System.out.println("Situação: " + situation);
    }
}
