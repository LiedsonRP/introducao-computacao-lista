package desafios;

import libraries.TerminalFormating;
import java.util.Scanner;

public class JogoVelha {

    /**
     * Cria o tabuleiro no terminal
     */
    public static void buildBoard(String board[][]) {
        System.out.println("Colunas 1, 2, 3 | linhas 1, 2 ,3");
        for (String line[] : board) {
            System.out.println("\n");
            for (String column : line) {
                System.out.print("  " + column + "  ");
            }
        }
    }

    /*
     * Verifica se a posição no jogo da velha está livre
     */
    public static boolean thePositionAreEmpty(int column, int line, String board[][]) {
        return !"X".equals(board[line][column]) && !"O".equals(board[line][column]);
    }

    /*
     * Faz a jogada no jogo da velha
     */
    public static boolean play(int column, int line, String symbol, String board[][]) {
        if (thePositionAreEmpty(column, line, board)) {
            board[line][column] = symbol;
            return true;
        } else {
            return false;
        }
    }

    /*
     * Checa de o player fez velha na diagonal
     */
    public static boolean checkIfPlayerWinInDiagonal(String symbol, String board[][]) {
        if (symbol.equals(board[0][0]) && symbol.equals(board[1][1]) && symbol.equals(board[2][2])) {
            return true;
        } else if (symbol.equals(board[0][2]) && symbol.equals(board[1][1]) && symbol.equals(board[2][0])) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Verifica se o player ganhou na coluna
     */
    public static boolean checkIfPlayerWinInColumn(String symbol, String board[][]) {
        if (symbol.equals(board[0][0]) && symbol.equals(board[1][0]) && symbol.equals(board[2][0])) {
            return true;
        } else if (symbol.equals(board[0][1]) && symbol.equals(board[1][1]) && symbol.equals(board[2][1])) {
            return true;
        } else if (symbol.equals(board[0][2]) && symbol.equals(board[1][2]) && symbol.equals(board[2][2])) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * Verifica se o player ganhou na linha
     */
    public static boolean checkIfPlayerWinInLine(String symbol, String board[][]) {
        for (String[] line : board) {
            if (symbol.equals(line[0]) && symbol.equals(line[1]) && symbol.equals(line[2])) {
                return true;
            }
        }

        return false;
    }

    /*
     * Checa se o player venceu o jogo em alguma das combinações válidas
     */
    public static boolean checkIfPlayerWin(String Symbol, String[][] board) {
        return checkIfPlayerWinInColumn(Symbol, board) || checkIfPlayerWinInDiagonal(Symbol, board) || checkIfPlayerWinInLine(Symbol, board);
    }

    /*
     * Muda o player que irá jogar
     */
    public static int changePlayer(int actual_player) {
        return (actual_player == 1) ? 0 : 1;

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        TerminalFormating terminal = new TerminalFormating();

        terminal.writeProgramTitle("Jogo da velha!");
        
        while (true) {

            String board[][] = {{".",".","."}, {".",".","."}, {".",".","."}}; //tabuleiro do jogo da velha
            String symbols[] = {"X", "O"}; //simbolos do jogo nas posições referentes aos jogadores
            int actual_player = 0; //Jogador atual podendo ser 0 - jogador 1 / 1 - jogador 2
            boolean have_winner = false; //Indica se um dos jogadores ganhou
            int column = 0;
            int line = 0;
            boolean play_result = false; //verifica se a jogada deu certo ou não
            int num_plays = 0; //número de jogadas feitas
            String player_winner = ""; //armazena o nome do jogador que venceu
            String play_again = "S";

            final int MAX_NUM_PLAYS = 9; //Configura o número máximo de jogadas antes de ser considerado empate
            final String DRAW_INFO = "NONE"; //Define a configuração que faz o jogo empatar

            String player1 = "";
            String player2 = "";

            System.out.print("Nome player 1: ");
            player1 = input.nextLine();

            System.out.print("Nome player 2: ");
            player2 = input.nextLine();

            do {
                buildBoard(board);
                System.out.println("\nJogador: " + symbols[actual_player]);

                //pede a coluna para jogar
                System.out.println("Coluna: ");
                column = input.nextInt();

                while (column < 1 || column > 3) {
                    terminal.errorMessage("Digite uma coluna válida!!!");
                    System.out.println("Coluna: ");
                    column = input.nextInt();
                }

                //Pede a linha para jogar
                System.out.println("Linha: ");
                line = input.nextInt();

                while (line < 1 || line > 3) {
                    terminal.errorMessage("Digite uma linha válida!!!");
                    System.out.println("Coluna: ");
                    line = input.nextInt();
                }

                play_result = play(column-1, line-1, symbols[actual_player], board);
                num_plays++;

                if (play_result) {
                    
                    have_winner = checkIfPlayerWin(symbols[actual_player], board);

                    if (have_winner) {
                        if (symbols[actual_player].equals("X")) {
                            player_winner = player1;
                        } else {
                            player_winner = player2;
                        }

                        break;
                    } else if (num_plays >= MAX_NUM_PLAYS) {
                        player_winner = DRAW_INFO;
                        break;
                    } else {
                        actual_player = changePlayer(actual_player);
                    }

                } else {
                    System.out.println("---------------------------------------------");
                    terminal.errorMessage("A posição já está ocupada!!!");
                }

            } while (!play_again.equals("N"));

            buildBoard(board);
            
            if(DRAW_INFO.equals(player_winner)) {
                System.out.println("\nEMPATE!!!");
            } else {
                System.out.println("\nJogador vencedor: " + player_winner);
            }

            System.out.println("Deseja jogar novamente? [S/N] ");
            play_again = input.next().toUpperCase();

            while (!play_again.equals("N") && !play_again.equals("S")) {
                terminal.errorMessage("O sistema apenas aceita respostas de S-Sim ou N-Não!");
                System.out.println("Deseja cadastrar uma nova pontuação? [S/N]");
                play_again = input.next().toUpperCase();
            }

            if("N".equals(play_again)) {
                break;
            }
        }

        System.out.println("FIM DE JOGO!");

    }
}
