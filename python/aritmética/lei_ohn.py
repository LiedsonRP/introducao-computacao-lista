print("---------------------LEI DE OHM----------------------\n")

current = float(input("Digite o valor da corrente no circuito: "))

while current < 0:
    print("ERRO! a medida não pode ser um valor negativo!!!")
    current = float(input("\nDigite o valor da corrente no circuito: "))

resistence = float(input("Digite o valor da resistência no circuito: "))

while resistence < 0:
    print("ERRO! a medida não pode ser um valor negativo!!!")
    resistence = float(input("Digite o valor da resistência no circuito: "))

voltage = current * resistence

print("---------------------------------------")
print(f"A tensão presente no circuito é agora a {voltage}V")