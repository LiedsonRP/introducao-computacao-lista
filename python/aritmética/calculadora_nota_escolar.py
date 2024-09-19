print("---------------------CALCULADORA DE NOTA ESCOLAR----------------------\n")

note1 = float(input("Digite a 1º nota: "))

while note1 < 0:
    print("ERRO! a medida não pode ser um valor negativo!!!")
    note1 = float(input("\nDigite a 1º nota: "))

note2 = (15 - nota1) / 2 #formula modificada para nota 5

print("---------------------------------------")
print(f"Para este aluno passar é preciso que tire nota: {note2}")

