print("---------------------TABUADA PARCIAL DE NÚMERO POSITIVO----------------------\n")

number = int(input("Qual número você quer saber a tabuada: "))

while number <= 0:
    print("ERROR!!! O número pode apenas ser positivo!!!")
    number = int(input("\nQual número você quer saber a tabuada: "))
    
print("--------------------------\nAGORA VAMOS DEFINIR O INTERVALO DA TABUADA:")

init_range = int(input("\nDigite o inicio do intervalo: "))

while init_range < 0:
    print("ERROR!!! O número pode apenas ser positivo!!!")
    init_range = int(input("\nDigite o inicio do intervalo: "))

final_range = int(input("\nDigite o final do intervalo: "))

while final_range < 0:
    print("ERROR!!! O número pode apenas ser positivo!!!")
    final_range = int(input("\nDigite o final do intervalo: "))
    
print("--------------------------------------------------")

for i in range(final_range,init_range-1, -1):
    print(f"{number} X {i} = {number * i}\n")