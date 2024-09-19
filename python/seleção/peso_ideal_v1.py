
situation = 0 #classificação do peso de acordo com o IMC

print("---------------------PESO IDEAL-V1----------------------\n")

weight = float(input("Digite o peso da pessoa: "))

while weight <= 0:
        print("ERRO! a medida não pode ser um valor negativo ou igual a 0!!!")
        weight = float(input("\nDigite o peso da pessoa: "))

height = float(input("Digite a altura da pessoa: "))

while height <= 0:
        print("ERRO! a medida não pode ser um valor negativo ou igual a 0!!!")
        height = float(input("\nDigite a altura da pessoa: "))

imc = weight / (height * height)

if imc < 20:
    situation = "abaixo do peso"
elif imc >=25:
    situation = "Acima do peso"
else:
    situation = "Peso ideal"
    
print("---------------------------------------")
print(f"\nIMC: {imc}")
print(f"\nSituação: {situation}")