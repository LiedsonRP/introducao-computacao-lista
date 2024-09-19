package matrizes;

import java.util.Scanner;

import libraries.TerminalFormating;
import libraries.Validation;

public class ListaMaior18V1 {
    public static void main(String[] args) {
        final int REGISTER_NUMBERS = 20;

        String[] nome = new String[REGISTER_NUMBERS];
        String[] sexo = new String[REGISTER_NUMBERS];
        int[] idade = new int[REGISTER_NUMBERS];
        int peopleListed18 = 0; //número de pessoas com +18 anos listadas

        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();
        Validation validation = new Validation();

        //inicio do programa

        terminal.writeProgramTitle("LISTA DE PESSOAS +18 CADASTRADAS");

        for (int i = 0; i < REGISTER_NUMBERS; i++) {
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

        System.out.println("---------------LISTA DE PESSOAS CADASTRADAS +18--------------------\n\n");
        for (int i = 0; i < REGISTER_NUMBERS; i++) {
            if (idade[i] > 18) {
                System.out.println("Nome: " + nome[i]);
                System.out.println("Sexo: " + sexo[i]);
                System.out.println("Idade: " + idade[i]);

                peopleListed18+=1;

                System.out.println("\n-----------------------------------");
            }
        }

        System.out.println("Foram cadastradas " + peopleListed18 + " pessoas com +18 anos.");
    }
}
