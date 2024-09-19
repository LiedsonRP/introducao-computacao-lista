
def mansTable(imc):
    if imc < 20:
        return "Abaixo do peso"
    elif imc >= 25:
        return "Acima do peso"
    else:
        return "Peso ideal"
    
def womansTable(imc):
    if imc < 19:
        return "Abaixo do peso"
    elif imc >= 24:
        return "Acima do peso"
    else:
        return "Peso ideal"
    
situation = "" #Classificação atual de acordo com o IMC
    
print("---------------------PESO IDEAL-V2----------------------\n")

gender = input("Qual o gênero da pessoa [M/F]? ").upper()

while gender not in ["M", "F"]:
    print("ERRO! No sistema são aceitos apenas os gêneros biológicos Masculino - M e Feminino - F!!!")
    gender = input("Qual o gênero da pessoa [M/F]? ").upper()
    
weight = float(input("Digite o peso da pessoa: "))
heigth = float(input("Digite a altura da pessoa: "))

imc = weight / (heigth * heigth);


match gender:
    case "F":
        situation = womansTable(imc)
    case "M":
        situation = mansTable(imc)
        
print("---------------------------------------")
print(f"\nIMC: {imc} \nSituação: {situation}")