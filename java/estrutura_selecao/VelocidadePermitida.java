package estrutura_selecao;
import java.util.Scanner;
import libraries.*;
import java.text.DecimalFormat;

public class VelocidadePermitida {

    /**
     * Calcula a velocidade do veículo
     * 
     * @param initial_velocity Double contendo a velocidade inicial
     * @param acceleration Double contendo o valor da aceleração
     * @param time Double contendo a o tempo percorrido
     * @return Double contendo a velocidade final
     */
    public static double calcVelocity (double initial_velocity, double acceleration, double time) {
        return initial_velocity + acceleration * time;
    }

    /**
     * Checa em qual categoria a velocidade do veículo está
     * 
     * @param velocity Double contendo a velocidade
     * @return Double contendo a categoria da velocidade
     */
    public static String checkVelocityType (double velocity) {
       
        if (velocity <= 40) {
            return "Veículo muito lento!";
        } else if (40 < velocity && velocity <= 60) {
            return "Velocidade permitida!";
        } else if (60 < velocity && velocity <= 80) {
            return "Velocidade de cruzeiro!";
        } else if (80 < velocity && velocity <= 120) {
            return "Veículo rápido!";
        }
        
        return "Veículo muito rápido!";

    }
    
    public static void main(String[] args) {
        
        double initial_velocity = 0;
	    double acceleration = 0;
	    double time = 0;
	    double final_velocity = 0; // V = V° + a.t 

	    final double VALOR_CONVERSÃO_VELOCIDADE = 3.6;
	    
	    Scanner input = new Scanner (System.in);
	    DecimalFormat formatador = new DecimalFormat("0.00");
        TerminalFormating terminal = new TerminalFormating();
        Validation validation = new Validation();

	    //inicio do programa
	    terminal.writeProgramTitle("PROGRAMA PARA PREVISÃO DE VELOCIDADE");
	    
		System.out.print("\nQual a velocidade inicial do veículo? (m/s - metros por segundo) ");
		initial_velocity = input.nextDouble();
		
		while(validation.checkIfNumberIsnegative(initial_velocity)) {
		    terminal.errorMessage("medidas não podem ser números negativos!");
            System.out.print("\nQual a velocidade inicial do veículo? (m/s - metros por segundo) ");
		    initial_velocity = input.nextDouble();
		}
		
		System.out.print("\nQual a acceleration desempenhada pelo veiculo? (m/s2 - metros por segundo ao quadrado) ");
		acceleration = input.nextDouble();
		
		System.out.print("\nPor quanto tempo ele se deslocou? (s - segundo) ");
		time = input.nextDouble();
		
		while(validation.checkIfNumberIsnegative(time)) {
		    terminal.errorMessage("medidas não podem ser números negativos!");
            System.out.print("\nPor quanto tempo ele se deslocou? (s - segundo) ");
		    time = input.nextDouble();
		}
		
		final_velocity = calcVelocity(initial_velocity, acceleration, time) * VALOR_CONVERSÃO_VELOCIDADE; // Calcula a velocidade e faz a conversão para km/h
        
        if (final_velocity <= 0) {
            final_velocity = 0.0;
        }
        
        System.out.println("----------------------------\nO veículo no cenário passado está com uma velocidade de " + formatador.format(final_velocity) + "km/h");
        System.out.println("Situação: " + checkVelocityType(final_velocity));
    }
}
