package estrutura_selecao;
import java.util.Scanner;
import libraries.*;

public class SituacaoMedia {

    public static void main(String[] args) {

        double note1 = 0;
        double note2 = 0;
        double average = 0;
        final double MIN_NOTE = 5;

        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();
        Validation validation = new Validation();

        terminal.writeProgramTitle("SITUAÇÃO DE ALUNO");

        System.out.print("\nDigite o valor da 1º nota: ");
        note1 = input.nextDouble();

        while(validation.checkIfNumberIsnegative(note1)) {
            terminal.errorMessage("A nota não pode ser um número negativo!");
            System.out.print("\nDigite o valor da 1º nota: ");
            note1 = input.nextDouble();
        }

        System.out.print("\nDigite o valor da 2º nota: ");
        note2 = input.nextDouble();

        while(validation.checkIfNumberIsnegative(note2)) {
            terminal.errorMessage("A nota não pode ser um número negativo!");
            System.out.print("\nDigite o valor da 2º nota: ");
            note2 = input.nextDouble();
        }

        average = (note1 + 2 * note2) / 3;

        System.out.println("-----------------------------------\n");

        if (average >= MIN_NOTE) {
            System.out.println("Situação do aluno: Aprovado");
        } else {
            System.out.println("Situação do aluno: Reprovado");
        }
    }
    
}
