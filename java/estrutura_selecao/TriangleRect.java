package estrutura_selecao;
import java.util.Scanner;
import libraries.*;

public class TriangleRect {

    /**
     * Confere se as medidas passadas formam um triângulo retangulo usando como base o teorema de Pitágoras
     * 
     * @param cathet1 Double contendo o comprimento do 1º cateto
     * @param cathet2 Double contendo o comprimento do 1º cateto
     * @param hypotenuse Double contendo o comprimento do 1º cateto
     * @return Boolean true caso as medidas formem um triângulo retângulo e False caso não
     */
    public static boolean checkIfIsTriangleRectangle(double cathet1, double cathet2, double hypotenuse) {
        return (hypotenuse * hypotenuse) == (cathet1 * cathet1) + (cathet2 * cathet2);
    }

    public static void main(String[] args) {

        double cathet1 = 0;
        double cathet2 = 0;
        double hypotenuse = 0;

        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();
        Validation validation = new Validation();

        //inicio do programa
        
        terminal.writeProgramTitle("VERIFICADOR DE TRIÂNGULO RETÂNGULO");
        
        System.out.print("\nDigite o comprimento do 1º cateto (m): ");
        cathet1 = input.nextDouble();

        while(validation.checkIfNumberIsnegative(cathet1) || validation.checkIfNumberEqualsZero(cathet1)) {
            terminal.errorMessage("O comprimento não pode ser um número negativo ou 0");
            System.out.print("\nDigite o comprimento do 1º cateto (m): ");
            cathet1 = input.nextDouble();
        }

        System.out.print("\nDigite o comprimento do 2º cateto (m): ");
        cathet2 = input.nextDouble();

        while(validation.checkIfNumberIsnegative(cathet2) || validation.checkIfNumberEqualsZero(cathet2)) {
            terminal.errorMessage("O comprimento não pode ser um número negativo ou 0");
            System.out.print("\nDigite o comprimento do 2º cateto (m): ");
            cathet2 = input.nextDouble();
        }

        System.out.print("\nDigite o comprimento da hipotenusa (m): ");
        hypotenuse = input.nextDouble();

        while(validation.checkIfNumberIsnegative(hypotenuse) || validation.checkIfNumberEqualsZero(hypotenuse)) {
            terminal.errorMessage("O comprimento não pode ser um número negativo ou 0");
            System.out.print("\nDigite o comprimento da hipotenusa (m): ");
            hypotenuse = input.nextDouble();
        }

        System.out.println("------------------------------------------");

        if (checkIfIsTriangleRectangle(cathet1, cathet2, hypotenuse)) {
            System.out.println("As medidas passadas formam um triângulo retângulo!");
        } else {
            System.out.println("As medidas passadas não formam um triângulo retângulo!");
        }
    }
}
