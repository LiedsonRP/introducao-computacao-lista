print("---------------------DESAFIO: TOMADAS----------------------\n")

values_isOk = False

while not values_isOk:
    
    print("--------------------------------------------------")

    rules_list_not_filtered = list(input("Digite o número de tomadas de cada uma das 4 reguas: "))
    rules_list_filtered = list()

    for i in range(len(rules_list_not_filtered)):
        try:
            socket_numbers = int(rules_list_not_filtered[i])
            
            #Verifica se o número de tomadas de cada valor está correto
            if socket_numbers < 2 or socket_numbers > 6:
                print("O número de tomadas não pode ser menor que 2 e nem exceder 6!!!")
                break
            
            # Caso não seja a ultima regua, faz a correção da extensão
            if i != len(rules_list_not_filtered)-1:
                socket_numbers-=1
                
            #Caso tudo esteja certo adiciona o valor a nova lista
            rules_list_filtered.append(socket_numbers)
                
        #tratamentos de espaços e caracteres que não podem ser convertidos em números
        except TypeError:
            pass
        except ValueError:
            pass
    
    #Validação do números de elementos na listai
    if len(rules_list_filtered) != 4:
        print("Devem ser digitados 4 números de tomadas!")
    else: #Caso passe pela ultima validação indica como True, pois todos os valores estão agora correntos
        values_isOk = True

#finalização do programa
print("----------------------------------------------------------\n")
print(sum(rules_list_filtered))
