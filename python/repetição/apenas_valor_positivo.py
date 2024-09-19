print("---------------------APENAS VALOR POSITIVO----------------------\n")

value = int(input("Digite um número inteiro positivo: "))

while value < 0:
    print("ERRO! a medida não pode ser um valor negativo!!!")
    value = int(input("\nDigite um número inteiro positivo: "))
    
print("FIM DO PROGRAMA")


