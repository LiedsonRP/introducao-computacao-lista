
print("---------------ÁREA DO TERRENO------------------\n")

largura = float(input("\nDigite a largura do retângulo: "))

while largura <= 0:
    print("ERRO! a medida não pode ser um valor negativo ou igual a 0!!!")
    largura = float(input("\nDigite a largura do retângulo: "))
    
altura = float(input("\nDigite a altura do retângulo: "))

while altura <= 0:
    print("ERRO! a medida não pode ser um valor negativo ou igual a 0!!!")
    altura = float(input("\nDigite a altura do retângulo: "))



area = largura * altura

print("---------------------------------------")
print(f"A area total é igual a {area}m2")

if area > 100:
    print("Terreno Grande!")
