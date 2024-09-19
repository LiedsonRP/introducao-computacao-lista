import math

PI =  math.pi

print("---------------------VOLUME DO CONE----------------------\n")

radius = float(input("Qual a medida do raio da base (m): "))

while radius <= 0:
    print("ERRO! a medida não pode ser um valor negativo ou igual a 0!!!")
    radius = float(input("\nQual a medida do raio da base (m): "))


heigth = float(input("Qual a medida da altura do cone (m): "))

while heigth <= 0:
    print("ERRO! a medida não pode ser um valor negativo ou igual a 0!!!")
    heigth = float(input("\nQual a medida da altura do cone (m): "))
    
volume = (PI * (radius * radius) * heigth) / 3

print("---------------------------------------")
print(f"O volume do cone especificado é igual a {volume}m3")
