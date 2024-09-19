package repeticao;
import libraries.TerminalFormating;

public class Fibonnacci {

    public static void main(String[] args) {

        int before = 1;
        int step = 0;
        int actual = 0;

        TerminalFormating terminal = new TerminalFormating();

        //inicio do programa

        terminal.writeProgramTitle("SEQUÊNCIA DE FIBONACCI");

        System.out.println("------------------------------");

        for (int i = 0; i < 30; i++) {
            System.out.print(actual + " ");
            step = actual;
            actual = before + actual;
            before = step;
            
        }
        
    }
}
