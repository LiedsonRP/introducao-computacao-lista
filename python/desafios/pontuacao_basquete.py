print("---------------------PONTUACAO_BASQUETE----------------------\n")

matches_list = list() #lista de pontos
match_point = 0 #pontos feitos numa partida N
count = 1 #Número do partida
resp = "" #armazena a resposta se o jogador gostaria de cadastrar mais uma partida
record_match_point = 0 #Record do jogador
repeat_record_number = 0 #Número de vezes que o record se repetiu
repeat_bigger_pontuation = 0 #Número de vezes que ele ultrapassou o record
worst_match = 0 #Pior partida N

while True:
    
    match_point = int(input(f"Pontuação da {count}º partida: "))
    
    while match_point < 0:
        print("ERRO! A pontuação no pode ser um número negativo!")
        match_point = int(input(f"\nPontuação do {count}º jogo: "))

    count+=1
    
    matches_list.append(match_point)
    
    #verifica o record do jogador a parti do número de pontos que mais se repete
    if matches_list.count(match_point) > repeat_record_number:
        record_match_point = match_point
        repeat_record_number = matches_list.count(match_point)
    
    #Verifica se o jogador cadastrar + uma partida
    resp = input("Gostaria de cadastrar mais uma partida? [S/N]").upper()
    
    while resp not in ["S", "N"]:
        print("ERRO!!! O sistema apenas aceita valores S - Sim ou N - Não!!!")
        resp = input("\nGostaria de cadastrar mais uma partida? [S/N]").upper()

    if resp == "N":
        break
    
    print("\n")
    
for match in matches_list:
    
    if match > record_match_point:
        repeat_bigger_pontuation+=1
        
worst_match = matches_list.index(min(matches_list)) + 1

print(f"{repeat_bigger_pontuation} {worst_match}")
