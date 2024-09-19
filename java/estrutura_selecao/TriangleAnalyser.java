package estrutura_selecao;
import java.util.Scanner;
import libraries.*;

public class TriangleAnalyser 
{

    /**
     * Verifica se as medidas passadas podem formar um triângulo
     * 
     * Regra de existência: Um lado do triângulo deve ser menor que a soma dos mesmos ->  c < a + b
     * 
     * @param length_side1 Double com o comprimento do lado 1
     * @param length_side2 Double com o comprimento do lado 2
     * @param length_side3 Double com o comprimento do lado 3
     * @return True caso as medidas gerem um triângulo e False caso não
     */
    public static boolean checkIfIsATriangle(double length_side1, double length_side2, double length_side3) {

        if (length_side1 < (length_side2 + length_side3)) {
            if (length_side2 < (length_side1 + length_side3)) {
                if (length_side3 < (length_side2 + length_side1)) {
                    return true;
                }
            }
        }

        return false;
    }

    /**
     * Retorna o tipo de triângulo formado de acordo com as medidas passadas
     * @param length_side1 Double com o comprimento do lado 1
     * @param length_side2 Double com o comprimento do lado 2
     * @param length_side3 Double com o comprimento do lado 3
     * @return
     */
    public static String analyseTriangleType(double length_side1, double length_side2, double length_side3) {
        
        if (length_side1 == length_side2 && length_side2 == length_side3) {
            return "Equilátero";
        } else if (length_side1 != length_side2 && length_side2 != length_side3) {
            return "Escaleno";
        } else {
            return "Isosceles";
        }
    }

    public static void main(String args[]) {

        double length_side1 = 0;
        double length_side2 = 0;
        double length_side3 = 0;

        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();
        Validation validation = new Validation();

        //inicio do programa

        terminal.writeProgramTitle("ANALISADOR DE TRIÂNGULOS");

        System.out.print("\nDigite o comprimento do 1º lado: ");
        length_side1 = input.nextDouble();

        while(validation.checkIfNumberIsnegative(length_side1) || validation.checkIfNumberEqualsZero(length_side1)) {
            terminal.errorMessage("O Comprimento do triângulo não pode ser um número negativo e nem 0m");
            System.out.print("\nDigite o comprimento do 1º lado: ");
            length_side1 = input.nextDouble();
        }

        System.out.print("\nDigite o comprimento do 2º lado: ");
        length_side2 = input.nextDouble();

        while(validation.checkIfNumberIsnegative(length_side2) || validation.checkIfNumberEqualsZero(length_side2)) {
            terminal.errorMessage("O Comprimento do triângulo não pode ser um número negativo e nem 0m");
            System.out.print("\nDigite o comprimento do 2º lado: ");
            length_side2 = input.nextDouble();
        }

        System.out.print("\nDigite o comprimento do 3º lado: ");
        length_side3 = input.nextDouble();

        while(validation.checkIfNumberIsnegative(length_side3) || validation.checkIfNumberEqualsZero(length_side3)) {
            terminal.errorMessage("O Comprimento do triângulo não pode ser um número negativo e nem 0m");
            System.out.print("\nDigite o comprimento do 3º lado: ");
            length_side3 = input.nextDouble();
        }

        System.out.println("--------------------------------------------------");

        if (checkIfIsATriangle(length_side1, length_side2, length_side3)) {
            System.out.println("As medidas digitadas formam um triângulo: " + analyseTriangleType(length_side1, length_side2, length_side3));
        } else {
            System.out.println("Os valores digitados não formam um triângulo!");
        }
    }
}