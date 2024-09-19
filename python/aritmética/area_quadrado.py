print("---------------------ÁREA DO QUADRADO-V1----------------------\n")

aresta = float(input("\nDigite a medida da aresta (m): "))

while aresta < 0:
    print("ERRO! a medida não pode ser um valor negativo!!!")
    aresta = float(input("\nDigite a medida da aresta (m): "))

area = aresta * aresta

print("------------------------------------")
print(f"A área do quadrado é igual a {area}m2")