
MIN_NOTE = 3

print("---------------------ALUNO APROVADO----------------------\n")

note1 = float(input("Digite o valor da 1º nota: "))

while note1 < 0:
    print("ERRO! A nota não pode ser um valor negativo!!!")
    note1 = float(input("\nDigite o valor da 1º nota: "))

note2 = float(input("Digite o valor da 2º nota: "))

while note2 < 0:
    print("ERRO! A nota não pode ser um valor negativo!!!")
    note2 = float(input("Digite o valor da 2º nota: "))
    
average = (note1 + 2 * note2) / 3

print("---------------------------------------")
if average >= MIN_NOTE:
    print("Situação do aluno: Aprovado")
else:
    print("Situação do aluno: Reprovado")





