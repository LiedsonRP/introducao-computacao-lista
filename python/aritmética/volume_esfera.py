import math

print("---------------------VOLUME DA ESFERA----------------------\n")

PI = math.pi
radius = float(input("\nDigite a medida da esfera (m): "))

while radius < 0:
    print("ERRO! a medida não pode ser um valor negativo!!!")
    radius = float(input("\nDigite a medida da esfera (m): "))

volume = (4 * PI * radius ** 3) / 3 #volume da esfera

print("---------------------------------------")
print(f"O volume da esfera é igual a {volume}m3")
