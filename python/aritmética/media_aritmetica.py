print("---------------------MÉDIA ARITMÉTICA----------------------\n")

NUM_VALUES = 4
soma = 0

for n in range(1,NUM_VALUES+1):
    soma+= float(input(f"Digite o {n}º valor: "))

average = soma / NUM_VALUES

print("---------------------------------------")
print(f"A média aritmética dos valores é igual a {average}")