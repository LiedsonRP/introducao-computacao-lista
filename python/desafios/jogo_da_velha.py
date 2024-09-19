import time

"""
Cria o tabuleiro do jogo da velha
"""
def buildBoard():
    print("Colunas: 1,2,3 | linhas 1,2,3")
    for line in board:
        print("\n")
        for column in line:
            print(f"  {column}  ", end=" ")

"""
Muda a vez do jogador através da mudança de time
"""
def changePlayer(actual_player):
    if actual_player == 0:
        actual_player = 1
    else:
        actual_player = 0
    
    return actual_player
        
"""
Verifica se a posição do tabuleiro está liberada
"""
def thePositionAreEmpty(column, line):	
    return board[line][column] not in ["X", "O"]

"""
Faz jogada do jogador da vez
"""
def play(column, line, symbol):
    if thePositionAreEmpty(column, line):
        board[line][column] = symbol
        return True
    else:
        return False
    
"""
Verifica se um dos players venceu através das linhas
"""
def checkIfPlayerWinInLine(symbol, board):
    for line in board:
        if line[0] == symbol and line[1] == symbol and line[2] == symbol:
            return True
    
    return False
     
     
"""
Verifica se um dos players venceu através das Colunas
"""
def checkIfPlayerWinInColumn(symbol, board):
    
    if board[0][0] == symbol and board[1][0] == symbol and board[2][0] == symbol:
        return True
    elif board[0][1] == symbol and board[1][1] == symbol and board[2][1] == symbol:
        return True
    elif board[0][2] == symbol and board[1][2] == symbol and board[2][2] == symbol:
        return True
    else:
        return False
    
    
"""
Verifica se um dos players venceu através das diagonais
"""
def checkIfPlayerWinInDiagonal(symbol, board):
    
    if board[0][0] == symbol and board[1][1] == symbol and board[2][2] == symbol:
        return True
    elif board[0][2] == symbol and board[1][1] == symbol and board[2][0] == symbol:
        return True
    else:
        return False
    
"""
Checa as posições do tabuleiro do jogo da velha e para ver se um dos players venceu
"""
def checkIfPlayerWin(symbol, board):
    return checkIfPlayerWinInLine(symbol, board) or checkIfPlayerWinInColumn(symbol, board) or checkIfPlayerWinInDiagonal(symbol, board)  
 
print("---------------------JOGO DA VELHA----------------------\n")

while True:
    
    board = [[".",".","."], [".",".","."], [".",".","."]] #tabuleiro do jogo da velha
    symbols = ["X", "O"] #simbolos do jogo nas posições referentes aos jogadores
    actual_player = 0 #Jogador atual podendo ser 0 - jogador 1 / 1 - jogador 2
    have_winner = False #Indica se um dos jogadores ganhou
    column = 0
    line = 0
    play_result = False #verifica se a jogada deu certo ou não
    num_plays = 0 #número de jogadas feitas
    player_winner = '' #armazena o nome do jogador que venceu	
    play_again = "S"

    MAX_NUM_PLAYS = 9 #Configura o número máximo de jogadas antes de ser considerado empate
    DRAW_INFO = "NONE" #Define a configuração que faz o jogo empatar
    
    #Inicio do jogo
    player1 = input("Nome do jogador 1 (X): ")
    player2 = input("\nNome do jogador 2 (O): ")

    while not have_winner:
        print("-------------------------------------\n")
        buildBoard()
        
        print(f"\n\nJogador: {symbols[actual_player]}")
        
        #pede o número da coluna
        column = int(input("Coluna do tabuleiro: "))
        
        while column < 1 or column > 3:
            print("Digite uma coluna válida!!!")
            column = int(input("\nColuna do tabuleiro: "))
        
        #pede o número da linha
        line = int(input("Linha do tabuleiro: "))
        
        while line < 1 or line > 3:
            print("Digite uma linha valida!!!")
            line = int(input("\nLinha do tabuleiro: "))
        
        play_result = play(column-1, line-1, symbols[actual_player])
        num_plays+=1
        
        if play_result:
            have_winner = checkIfPlayerWin(symbols[actual_player], board)
            
            if have_winner:
                if symbols[actual_player] == "X":
                    player_winner = player1
                else:
                    player_winner = player2
                    
                break
            elif num_plays >= MAX_NUM_PLAYS:
                player_winner = DRAW_INFO
                break
            else:
                actual_player = changePlayer(actual_player)
        else:
            print("-------------------------------------\n")
            print("\nA posição já está ocupada!!!")
            time.sleep(2)

    #fim do jogo-------------------------------
    buildBoard()

    if player_winner in DRAW_INFO:
        print("\n\nEmpate!!!")
    else:
        print(f"\n\nJogador vencedor: {player_winner}")
        
    play_again = input("Deseja jogar novamente? [S/N]").upper()
    
    while play_again not in ["N", "S"]:
        print("ERRO!!! Apenas respostas Sim (S) ou Não (N)")
        play_again = input("\nDeseja jogar novamente? [S/N]").upper()
        
    #finaliza o jogo
    if play_again == "N":
        break
    
    print("---------------------------------------------------")


print("FIM DE JOGO")