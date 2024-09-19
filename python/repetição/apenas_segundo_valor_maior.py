print("---------------------APENAS SEGUNDO VALOR MAIOR----------------------\n")

value1 = int(input("Digite o 1º valor: "))
value2 = int(input("Digite o 2º valor (deve ser maior que o primeiro): "))

while value2 < value1:
    print("ERRO! O segundo valor deve ser maior que o primeiro!!!")
    value2 = int(input("\nDigite o 2º valor (deve ser maior que o primeiro): "))
    
print("FIM DO PROGRAMA")

