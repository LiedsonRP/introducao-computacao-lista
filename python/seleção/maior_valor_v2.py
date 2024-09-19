bigger = 0 #maior valor digitado

print("---------------------MAIOR VALOR V2----------------------\n")

value1 = float(input("Digite o 1º valor: "))
value2 = float(input("Digite o 2º valor: "))

print("---------------------------------------")

if value1 > value2:
    print(f"O maior valor digitado é igual a {value1}")
elif value1 == value2:
    print(f"Os valores digitados são iguais!")
else:
    print(f"O maior valor digitado é igual a {value2}")
