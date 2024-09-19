package desafios;

import java.util.Scanner;
import libraries.TerminalFormating;

public class tomadas {

    public static void main(String[] args) {

        boolean values_isOk = false;
        int rules_list[] = new int[4];
        int socket = 0;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();

        terminal.writeProgramTitle("Tomadas");

        while (!values_isOk) {
            System.out.println("Digite a quantidade de tomadas de cada uma das 4 reguas separado por espaço: ");
            String[] info = input.nextLine().split(" ");
            
            if (info.length != 4) {
                terminal.errorMessage("Deve ter 4 valores!");
                break;
            }

            try {
                for (int i = 0; i < 4; i++){
                    socket = Integer.parseInt(info[i]);
    
                    if (socket < 2 || socket > 6) {
                        terminal.errorMessage("O número de tomadas não pode ser menor 2 ou exceder 6!!!");
                        break;
                    }

                    if (i != 3) {
                        rules_list[i] = socket-1;
                    } else {
                        rules_list[i] = socket;
                    }
                }
        
            } catch(NumberFormatException ex) {
                terminal.errorMessage("O número não pode ser quebrado!");
                continue;
            }

            values_isOk = true;
        }

        for(int rule : rules_list) {
            sum+=rule;
        }

        System.out.println("----------------------------------");
        System.out.println(sum);
    }
}

  
