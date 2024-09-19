print("---------------------ÁREA DO TRIÂNGULO----------------------\n")

base = float(input("\nQual a medida da base do triângulo (m): "))

while base <= 0:
    print("ERRO! a medida não pode ser um valor negativo ou igual a 0!!!")
    base = float(input("\nQual a medida da base do triângulo (m): "))

heigth = float(input("\nQual a medida da altura do triângulo (m): "))

while heigth <= 0:
    print("ERRO! a medida não pode ser um valor negativo ou igual a 0!!!")
    heigth = float(input("\nQual a medida da altura do triângulo (m): "))

area = (base * heigth) / 2

print("---------------------------------------")
print(f"A área do triângulo é igual a {area}m2")