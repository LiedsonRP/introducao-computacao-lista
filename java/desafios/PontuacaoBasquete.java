package desafios;

import java.util.Scanner;
import libraries.TerminalFormating;
import libraries.Validation;

import java.util.ArrayList;

public class PontuacaoBasquete {

    /*
     * Retorna a quantidade de vezes que um dado valor aparece na lista
     */
    private static int count_value_on_list(int value, ArrayList<Integer> value_list) {

        int count = 0;

        for (Integer item : value_list) {
            if (item.equals(value)) {
                count++;
            }
        }

        return count;
    }

    /*
     * Retorna o record do jogador baseado no valor da pontuação que mais se repete
     */
    public static int getPlayerRecord(ArrayList<Integer> matcher_list) {

        int repeat_point_number = 0; //número de vezes que um dado valor se repetiu
        int repeat_record_number = 0; //Número de vezes que o record se repetiu
        int record_match_point = 0; //Record do jogador

        for (int i = 0; i < matcher_list.size(); i++) {

            repeat_point_number = count_value_on_list((int) matcher_list.get(i), matcher_list); 

            if (repeat_point_number > repeat_record_number) {
                repeat_record_number = repeat_point_number;
                record_match_point = (int) matcher_list.get(i); 
            }
        }

        return record_match_point;
    }

    /**
     * Retorna o número de vezes que ele quebrou um record
     *
     */
    public static int getNumberOfRecordsBroken(int record, ArrayList<Integer> match_list) {

        int count = 0;

        for (Integer point : match_list) {
            if (point > record) {
                count++;
            }
        }

        return count;
    }

    /**
     * Retorna qual foi a pior partida do jogador
     * 
     */
    public static int getWorstMatch(ArrayList<Integer> match_list) {
        
        int worst_match_point = match_list.get(0);
        int match = 0;

        for (int i = 1; i < match_list.size(); i++) {
            if (worst_match_point > match_list.get(i)) {
               worst_match_point = match_list.get(i);
               match = i+1;
            }
        }

        return match;
    }

    
    public static void main(String[] args) {
         
        int match_point = 0; //pontos feitos numa partida N
        int count = 1; //Número do partida
        int record_match_point = 0; //Record do jogador
        int repeat_bigger_pontuation = 0; //Número de vezes que ele ultrapassou o record
        int worst_match = 0; //Pior partida N


        ArrayList matcher_list = new ArrayList<Integer>(); //lista de pontos de cada partida
        String resp = ""; //armazena a resposta se o jogador gostaria de cadastrar mais uma partida

        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();
        Validation validation = new Validation();

        do {
            
            System.out.print("Quanto pontos foram feitos na " + count + "º partida? ");
            match_point = input.nextInt();
            
            //verifica se o número é negativo
            if (validation.checkIfNumberIsnegative(match_point)) {
                terminal.errorMessage("A pontuação não pode ser um número negativo!!!");
                System.out.println("Quanto pontos foram feitos na " + count);
                match_point = input.nextInt();
            }

            count++;

            matcher_list.add(match_point); //adiciona o valor na lista
            record_match_point = getPlayerRecord(matcher_list); //Verifica se a pontuação não passou a ser o novo record

            System.out.print("Deseja cadastrar uma nova pontuação? [S/N]");
            resp = input.nextLine().toUpperCase();

            while (!resp.equals("N") && !resp.equals("S")) {
                terminal.errorMessage("O sistema apenas aceita respostas de S-Sim ou N-Não!");
                System.out.println("Deseja cadastrar uma nova pontuação? [S/N]");
                resp = input.nextLine().toUpperCase();
            }

        } while(!resp.equals("N"));

        System.out.println("------------------------------------------------");
        System.out.println(getNumberOfRecordsBroken(record_match_point, matcher_list) + " | " + getWorstMatch(matcher_list));
        System.out.println("FIM DO PROGRAMA");
    }
}
