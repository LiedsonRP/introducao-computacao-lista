package matrizes;

import java.util.Scanner;

import libraries.TerminalFormating;
import libraries.Validation;

public class ListaMulheres {
    
    public static void main(String[] args) {

        final int REGISTER_NUMBERS = 20;

        String[] nome = new String[REGISTER_NUMBERS];
        String[] sexo = new String[REGISTER_NUMBERS];
        int[] idade = new int[REGISTER_NUMBERS];

        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();
        Validation validation = new Validation();

        //inicio do programa

        terminal.writeProgramTitle("LISTA DE MULHERES CADASTRADAS");

        for (int i = 0; i < 20; i++) {
            System.out.println("--------------------------------------------");
            System.out.print("Pessoa " + (i + 1));
            
            System.out.print("\n\nNome: ");
            nome[i] = input.next();

            System.out.print("sexo [M/F]: ");
            sexo[i] = input.next().toUpperCase();

            while(!sexo[i].equals("F") && !sexo[i].equals("M")) {
                terminal.errorMessage("Sexo invalido! Apenas disponíveis M - Masculino e F - Feminino!");
                System.out.print("\nsexo [M/F]: ");
                sexo[i] = input.next().toUpperCase();
            }

            System.out.print("Idade: ");
            idade[i] = input.nextInt();

            while (validation.checkIfNumberIsnegative(idade[i])) {
                terminal.errorMessage("A idade não pode ser negativa!");
                System.out.print("\nIdade: ");
                idade[i] = input.nextInt();
            }
        }

        System.out.println("----------------------------------------------");
        for (int i = 0; i < REGISTER_NUMBERS; i++) {
            if (sexo[i].equals("F")) {
                System.out.println("Nome: " + nome[i]);
                System.out.println("Sexo: " + sexo[i]);
                System.out.println("Idade: " + idade[i]);

                System.out.println("\n-----------------------------------");
            }
        }

    }
}
