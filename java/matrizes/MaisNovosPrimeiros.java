package matrizes;

import java.util.Scanner;
import java.util.Arrays;
import java.util.Collections;

import libraries.TerminalFormating;
import libraries.Validation;

public class MaisNovosPrimeiros {

    private static int[] getPeoplePositionByOrderedAge (int[] age_list) {
        
        int[] positions = new int[age_list.length];
        int[] age_list_clone = age_list.clone();

        int bigger_position = 0;
        int bigger_age = 0;

        //Implementação de um selection sort
        for (int n = 0; n < positions.length; n++) {

            for (int i = 0; i < age_list_clone.length; i++) {
                if (bigger_age < age_list_clone[i]) {
                    
                    bigger_position = i;
                    bigger_age = age_list_clone[i];
                    
                }
            }
            
            positions[n] = bigger_position;
            age_list_clone[bigger_position] = 0;
            bigger_age = 0;

        }

        return positions;
    }
    
    public static void main(String[] args) {

        final int REGISTER_NUMBERS = 4;

        String[] nome = new String[REGISTER_NUMBERS];
        String[] sexo = new String[REGISTER_NUMBERS];
        int[] idade = new int[REGISTER_NUMBERS];
        int[] positions = new int[REGISTER_NUMBERS];

        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();
        Validation validation = new Validation();

        //inicio do programa

        terminal.writeProgramTitle("LISTA DE MULHERES CADASTRADAS");

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

        positions = getPeoplePositionByOrderedAge(idade);

        System.out.println("----------------------------------------------");
        for (int i = 0; i < positions.length; i++) {

            System.out.println("Nome: " + nome[positions[i]]);
            System.out.println("Sexo: " + sexo[positions[i]]);
            System.out.println("Idade: " + idade[positions[i]]);

            System.out.println("\n-----------------------------------");
        }

    }
}