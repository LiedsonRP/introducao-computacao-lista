print("---------------------ÁREA DO QUADRADO-V2----------------------\n")

diagonal = float(input("\nQual a medida da diagonal do quadrado (m): "))

while diagonal <= 0:
    print("ERRO! a medida não pode ser um valor negativo!!!")
    diagonal = float(input("\nQual a medida da diagonal do quadrado (m): "))
    
area = (2 * (diagonal * diagonal)) / 4

print("---------------------------------------")
print(f"A área da diagonal é igual a {area}m2")
