package libraries;


public class TerminalFormating {

     /**
      * Criar o título do programa com uma formatação padrão no terminal
      * @param title String contendo o título do programa
      */
     public void writeProgramTitle(String title) {
        final String ANSI_RESET = "\u001B[0m";
            final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
            final String ANSI_BLACK = "\u001B[301m";
            
            System.out.println(ANSI_GREEN_BACKGROUND + ANSI_BLACK + "\n" + title + ANSI_RESET);
    }

    /**
     * Criar uma mensagem de erro no terminal
     * @param message String contendo a mensagem do erro
     */
    public void errorMessage(String message) {
        
	    final String ANSI_RESET = "\u001B[0m";
        final String ANSI_RED_BACKGROUND = "\u001B[41m";
        
        System.out.println(ANSI_RED_BACKGROUND + "ERRO!! " + message + ANSI_RESET);
    }

}
