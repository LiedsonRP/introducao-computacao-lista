print("---------------------PRODUTO MATRIZ----------------------\n")

list_numbers = []

for i in range(20):
    value = int(input(f"Digite o {i+1}º valor: "))
    list_numbers.append(value)
    
multiply = int(input("\nConstante Multiplicativa: "))
    
for index in range(0, len(list_numbers)):
    list_numbers[index] = list_numbers[index] * multiply
    
print("-----------------------------------------------")
print("VALORES MULTIPLICADOS")
for element in list_numbers:
    print(element, end=" ")