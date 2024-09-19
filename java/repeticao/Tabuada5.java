package repeticao;
import libraries.TerminalFormating;

public class Tabuada5 {
    public static void main(String[] args) {

        final int TAB_NUMBER = 5;
        TerminalFormating terminal = new TerminalFormating();
        
        //inicio do programa
        terminal.writeProgramTitle("TABUADA DE 5");

        for (int i = 1; i <= 10; i++) {
            System.out.println(TAB_NUMBER + " X " + i + " = " + TAB_NUMBER * i);
        }
    }
}
