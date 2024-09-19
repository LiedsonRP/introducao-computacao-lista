package aritmetica;
import java.util.Scanner;
import java.text.DecimalFormat;
import libraries.*;

public class VelocidadeAutomóvel {
    
    public static void main(String[] args) {

        double velocidade_inicial = 0;
	    double aceleração = 0;
	    double tempo_deslocamento = 0;
	    double velocidade_final = 0; // V = V° + a.t 

	    final double VALOR_CONVERSÃO_VELOCIDADE = 3.6;
	    
	    Scanner input = new Scanner (System.in);
	    DecimalFormat formatador = new DecimalFormat("0.00");
        TerminalFormating terminal = new TerminalFormating();
        Validation validation = new Validation();

	    //inicio do programa
	    terminal.writeProgramTitle("PROGRAMA PARA PREVISÃO DE VELOCIDADE");
	    
		System.out.print("\nQual a velocidade inicial do veículo? (m/s - metros por segundo) ");
		velocidade_inicial = input.nextDouble();
		
		while(validation.checkIfNumberIsnegative(velocidade_inicial)) {
		    terminal.errorMessage("medidas não podem ser números negativos!");
            System.out.print("\nQual a velocidade inicial do veículo? (m/s - metros por segundo) ");
		    velocidade_inicial = input.nextDouble();
		}
		
		System.out.print("\nQual a aceleração desempenhada pelo veiculo? (m/s2 - metros por segundo ao quadrado) ");
		aceleração = input.nextDouble();
		
		System.out.print("\nPor quanto tempo ele se deslocou? (s - segundo) ");
		tempo_deslocamento = input.nextDouble();
		
		while(validation.checkIfNumberIsnegative(tempo_deslocamento)) {
		    terminal.errorMessage("medidas não podem ser números negativos!");
            System.out.print("\nPor quanto tempo ele se deslocou? (s - segundo) ");
		    tempo_deslocamento = input.nextDouble();
		}
		
		velocidade_final = (velocidade_inicial + aceleração * tempo_deslocamento) * VALOR_CONVERSÃO_VELOCIDADE; // Calcula a velocidade e faz a conversão para km/h
        
        if (velocidade_final <= 0) {
            velocidade_final = 0.0;
        }
        
        System.out.println("----------------------------\nO veículo no cenário passado está com uma velocidade de " + formatador.format(velocidade_final) + "km/h");
    }
}
