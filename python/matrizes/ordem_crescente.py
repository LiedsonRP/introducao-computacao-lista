print("---------------------ORDEM CRESCENTE----------------------\n")

list_numbers = []

for i in range(20):
    value = int(input(f"Digite o {i+1}º valor: "))
    list_numbers.append(value)

list_numbers.sort()

print("----------------------------------------------")
print("OS NÚMEROS DIGITADOS FORAM")

for element in list_numbers:
    print(element, end=" ")
