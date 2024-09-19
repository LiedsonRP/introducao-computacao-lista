bigger = 0 #maior valor digitado

print("---------------------MAIOR VALOR V1----------------------\n")

value1 = float(input("Digite o 1º valor: "))
value2 = float(input("Digite o 2º valor: "))

if value1 > value2:
    bigger = value1
else:
    bigger = value2
    
print("---------------------------------------")
print(f"O maior valor é igual a {bigger}")