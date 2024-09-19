package matrizes;

import java.util.Scanner;

import libraries.TerminalFormating;
import libraries.Validation;

public class PesquisaValor {

    public static int searchNumberPositonInVect(int[] value, int number) {
        
        for(int i = 0; i < value.length; i++) {
            if (value[i] == number) {
                return i;
            }
        }

        return -1;
    }

     public static void main(String[] args) {
        
        int n = 0;
        int[] value = new int[20];
        int search = 0;
        int position = 0;

        String repeat_program = "";

        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();
        Validation validation = new Validation();

        //inicio do programa

        terminal.writeProgramTitle("PESQUISA DE VALOR");

        System.out.print("\nQuantos valores você quer armazenar (max 20)? ");
        n = input.nextInt();

        while (validation.checkIfNumberIsnegative(n) || validation.checkIfNumberEqualsZero(n) || n > 20) {

            if (validation.checkIfNumberIsnegative(n)) {
                terminal.errorMessage("A quantidade valores não pode ser um número negativo!");
            } else if (validation.checkIfNumberEqualsZero(n)) {
                terminal.errorMessage("A quantidade de valores não pode ser igual 0!");
            } else if (n > 20) {
                terminal.errorMessage("O número máximo de valores é 20!");
            }

            System.out.print("\nQuantos valores você quer armazenar (max 20)? ");
            n = input.nextInt();
        }

        for (int i = 1; i <= n; i++) {
            System.out.print("\nDigite o " + i + "º valor: ");
            value[i-1] = input.nextInt();
        }

        do {

            System.out.println("\n----------------------------------------");

            System.out.print("\nQual valor você quer buscar? ");
            search = input.nextInt();

            position = searchNumberPositonInVect(value, search);

            if ( position != -1) {
                System.out.println("O valor se encontra na posição: " + position);
            } else {
                System.out.println("Valor não encontrado!");
            }

            System.out.println("\n-----------------------------------------\n");

            System.out.print("\nGostaria de pesquisar novamente [S/N]? ");
            repeat_program = input.nextLine().toUpperCase();

            while(!repeat_program.equals("S") && !repeat_program.equals("N")) {
                terminal.errorMessage("Resposta invalida! Apenas aceita S-Sim e N-Não");

                System.out.print("\nGostaria de pesquisar novamente [S/N]? ");
                repeat_program = input.nextLine().toUpperCase();
            }

        } while (!repeat_program.equals("N"));

        System.out.println("FIM DO PROGRAMA!");
     }
}
