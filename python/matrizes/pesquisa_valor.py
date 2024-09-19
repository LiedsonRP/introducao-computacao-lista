
print("---------------------PESQUISA DE VALOR----------------------\n")

list_numbers = []
resp = "S"

quant_numbers = int(input("Quantos número gostaria de digitar? Max.20: "))

while quant_numbers > 20 or quant_numbers <= 0:
    print("ERROR! A quantidade de números deve estar na faixa entre 1 e 20!!!")
    quant_numbers = int(input("\nQuantos número gostaria de digitar? Max.20: "))


for i in range(quant_numbers):
    value = int(input(f"Digite o {i+1}º valor: "))
    list_numbers.append(value)
    
while resp != "N":
    searched_number = int(input("Qual número gostaria de pesquisar? "))
    
    if searched_number not in list_numbers:
        print("Valor não encontrado!")
    else:
        index = list_numbers.index(searched_number)
        print(f"O número procurado se encontra na posição {index} da lista.")
        
    resp = input("\nVocê gostaria de pesquisar novamente? [S/N] ").upper()
    
    while resp not in ["S", "N"]:
        print("ERRO! O sistema apenas aceita S - Sim e N - Não!")
        resp = input("\nVocê gostaria de pesquisar novamente? [S/N] ").upper()

    