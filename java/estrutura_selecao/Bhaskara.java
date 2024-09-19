package estrutura_selecao;
import java.util.Scanner;
import libraries.*;
import java.lang.Math;

public class Bhaskara {

    /**
     * Calcula o valor de delta
     * 
     * @param ax2 Double contendo o valor de a
     * @param bx Double contendo o valor de b
     * @param c Double contendo o valor de c
     * @return Double contendo o resultado final de Delta
     */
    public static double calcDelta(double ax2, double bx, double c) {
        return (bx * bx) -4 * ax2 * c;
    }

    /**
     * Faz o calculo da formula de bhaskara
     * 
     * @param ax2 Double contendo o valor de a
     * @param bx Double contendo o valor de b
     * @param c Double contendo o valor de c
     * @param delta Double contendo o valor de Delta
     * @return Um Array de duas posições contendo as duas raizes possíveis da formula: {x1, x2}
     */
    public static double[] calcBaskhara (double ax2, double bx, double c, double delta) {
        
        double x1 = ((bx * -1) - Math.sqrt(delta)) / (2 * ax2);
        double x2 = ((bx * -1) + Math.sqrt(delta)) / (2 * ax2);

        double roots[] = {x1, x2};
        
        return roots;
    }

    public static void main(String[] args) {

        double ax2 = 0;
        double bx = 0;
        double c = 0;
        double delta = 0;
        double roots[] = new double[2];

        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();
        Validation validation = new Validation();

        //inicio do programa
        terminal.writeProgramTitle("CALCULADORA DE BHASKARA");

        System.out.print("\nInforme o valor de a em ax2: ");
        ax2 = input.nextDouble(); 

        System.out.print("\nInforme o valor de b em bx: ");
        bx = input.nextDouble();
        
        System.out.print("\nInforme o valor de c: ");    
        c = input.nextDouble();

        delta = calcDelta(ax2, bx, c);
        
        System.out.println("---------------------------------------------------\n");

        if (delta < 0) {
            System.out.println("Delta negativo - nenhuma raiz");
        } else if (delta == 0) {
            System.out.println("Duas raizes iguais!");
            roots = calcBaskhara(ax2, bx, c, delta);

            System.out.println("O modulo do valor encontrado foi: " + Math.abs(roots[0]));
        } else {
            System.out.println("Duas raizes");
            roots = calcBaskhara(ax2, bx, c, delta);

            System.out.println("As raizes encontradas foram: \nx1:" + roots[0] + "\nx2: " + roots[1]);

        }
    }
}
