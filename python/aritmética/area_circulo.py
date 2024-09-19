import math

print("---------------------ÁREA CIRCULO----------------------\n")

PI = math.pi

radius = float(input("Digite a medida do raio do circulo (m): "))

while radius < 0:
    print("ERRO! a medida não pode ser um valor negativo!!!")
    radius = float(input("Digite a medida do raio do circulo (m) "))
    
area = PI * (radius * radius)

print("---------------------------------------")
print(f"A área do circulo é igual a {area}m2")

