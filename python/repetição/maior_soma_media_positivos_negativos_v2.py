print("---------------------MAIOR, SOMA, MÉDIA, POSITIVOS E NEGATIVOS-V2----------------------\n")

resp = "S"

while resp != "N":
    
    su = 0
    average = 0
    max_value = 0
    value = 0
    percent_positive_values = 0
    percent_negative_values = 0
    count_positives_values = 0
    count_negative_values = 0
    num_values = 0

    num_values = int(input("\nQuantos valores você quer digitar? "))
    
    while num_values <= 0:
       print("ERROR!!! O número pode apenas ser positivo!!!")
       num_values = int(input("\nQuantos valores você quer digitar? "))

    #Pegar o 1º valor
    value = int(input("\nDigite o 1º valor: "))

    max_value = value
    su+=value

    #verifica se o número é positivo ou negativo desconsiderando o 0
    if value > 0:
        count_positives_values+=1
    elif value < 0:
        count_negative_values+=1

    #pegando o restante dos valores
    for i in range(2, num_values+1):
        
        value = int(input(f"\nDigite o {i} valor: "))
            
        #verifica se o valor digitado é o maior
        if value > max_value:
            max_value = value
            
        #verifica se o número é positivo ou negativo desconsiderando o 0
        if value > 0:
            count_positives_values+=1
        elif value < 0:
            count_negative_values+=1
        
        #soma os valores
        su+=value

    print(count_positives_values)
    average = su / num_values
    percent_positive_values = float(count_positives_values / num_values) * 100
    percent_negative_values = float(count_negative_values / num_values) * 100

    print("---------------------------------------------------")
    print(f"O maior valor digitado foi {max_value}")
    print(f"A soma dos valores é igual a {su}")
    print(f"A média aritmética dos valores é igual a {average}")
    print(f"Porcentagem de valores positivos: {percent_positive_values}%")
    print(f"Porcentagem de valores negativos: {percent_negative_values}%")
    print("---------------------------------------------------\n\n")
    
    resp = input("\nVocê deseja rodar novamente o programa? [S/N] ").upper()
    
    while resp not in ["S", "N"]:
        print("ERROR!!! O sistema apenas aceita S - Sim ou N - Não!!!")
        resp = input("\nVocê deseja rodar novamente o programa? [S/N] ").upper()
        
print("FIM DO PROGRAMA!")