import math

PI = math.pi

print("---------------------VOLUME CUBO INSCRITO NA ESFERA----------------------\n")

radius = float(input("Digite o comprimento do raio (m): "))

while radius < 0:
    print("ERRO! a medida não pode ser um valor negativo ou igual a 0!!!")
    radius = float(input("\nDigite o comprimento do raio (m): "))

aresta = float(input("Digite o comprimento da aresta (m): "))

while aresta < 0:
    print("ERRO! a medida não pode ser um valor negativo ou igual a 0!!!")
    aresta = float(input("\nDigite o comprimento da aresta (m): "))

volume_cube = aresta ** 3;
volume_sphere = (4 * PI * radius ** 3) / 3 #volume da esfera

free_space = volume_cube - volume_sphere

print("---------------------------------------")

if free_space <= 0:
    print("Não há espaço livre!")
else:
    print(f"Existem {free_space}m3 de espaço livre")
