
print("---------------------SEXO M OU F----------------------\n")

gender = input("Qual o gênero da pessoa [M/F]? ").upper()

while gender not in ["M", "F"]:
    print("ERRO! No sistema são aceitos apenas os gêneros biológicos Masculino - M e Feminino - F!!!")
    gender = input("Qual o gênero da pessoa [M/F]? ").upper()
    
print("FIM DO PROGRAMA")