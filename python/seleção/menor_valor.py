smaller = 0 #menor valor digitado

print("---------------------MENOR VALOR----------------------\n")

value1 = float(input("Digite o 1º valor: "))
value2 = float(input("Digite o 2º valor: "))

if value1 > value2:
    smaller = value2
else:
    smaller = value1
    
print("---------------------------------------")
print(f"O menor valor é igual a {smaller}")