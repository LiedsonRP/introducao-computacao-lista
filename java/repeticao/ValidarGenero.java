package repeticao;
import libraries.TerminalFormating;
import java.util.Scanner;

public class ValidarGenero {
    
    public static void main(String[] args) {

        String gender = "";

        TerminalFormating terminal = new TerminalFormating();
        Scanner input = new Scanner(System.in);

        //inicio do programa
        terminal.writeProgramTitle("VALIDADOR DE GÊNERO");

        System.out.print("\nDigite o seu gênero biológico: ");
        gender = input.nextLine().toUpperCase();

        while(!gender.equals("M") && !gender.equals("F")) {
            terminal.errorMessage("O gênero listado não foi adicionado no sistema, apenas M - masculino e F - Feminino");
            System.out.print("\nDigite o seu gênero biológico? [M/F] ");
		    gender = input.nextLine().toUpperCase();
        }

        System.out.println("FIM DO PROGRAMA");
    }
}
