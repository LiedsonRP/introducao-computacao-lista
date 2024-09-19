print("---------------------CALCULO DE FATORIAL----------------------\n")

number = 0;
fatorial_result = 1

number = int(input("\nQual o número que deseja calcular o fatorial? "))

while number <= 0:
        print("ERROR!!! O número não pode ser negativou ou igual a 0!!!")
        number = int(input("\nQual o número que deseja calcular o fatorial? "))

for i in range(number, 1, -1):
    fatorial_result*=i
    
print("-----------------------------------------------")
print(f"O fatorial de {number} é igual a {fatorial_result}")

