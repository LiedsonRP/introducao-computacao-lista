print("---------------------PRODUTO MATRIZ-V2----------------------\n")

list_numbers = []
list_numbers_multiplyed = []

for i in range(20):
    value = int(input(f"Digite o {i+1}º valor: "))
    list_numbers.append(value)
    
multiply = int(input("\nConstante Multiplicativa: "))
    
for index in range(0, len(list_numbers)):
    list_numbers_multiplyed.append(list_numbers[index] * multiply)
    
print("-----------------------------------------------")

print("\nVALORES DIGITADOS")
for element in list_numbers:
    print(element, end=" ")


print("\nVALORES MULTIPLICADOS")
for element in list_numbers_multiplyed:
    print(element, end=" ")
