print("---------------------ORDEM INVERSA----------------------\n")

list_numbers = []

for i in range(10):
    value = int(input(f"Digite o {i+1}º valor: "))
    list_numbers.append(value)
    
print("----------------------------------------------")
print("OS NÚMEROS DIGITADOS FORAM")

for element in range(len(list_numbers), 0, -1):
    print(element, end=" ")