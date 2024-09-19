package repeticao;
import libraries.TerminalFormating;

public class Soma1A100 {

    public static void main(String[] args) {

        int sum = 0;
        TerminalFormating terminal = new TerminalFormating();

        //inicio do programa

        terminal.writeProgramTitle("SOMA DOS NÚMEROS DE 1 A 100");

        for (int i = 1; i <= 100; i++) {
            sum+=i;
        }    

        System.out.println("\nA soma dos números de 1 a 100 é igual a " + sum);
    }
}
