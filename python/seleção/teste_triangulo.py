
def checkIfIsTriangle(lenght_side1, length_side2, lenght_side3):
    
    if lenght_side1 < length_side2 + lenght_side3:
            if length_side2 < lenght_side1 + lenght_side3:
                    if lenght_side3 < length_side2 + lenght_side1:
                        return True
    return False


def analyseTriangleType(length_side1, length_side2, length_side3):
    
    if length_side1 == length_side2 and length_side2 == length_side3:
        return "Equilatero"
    elif length_side1 != length_side2 and length_side2 != length_side3:
        return "Escaleno"
    else:
        return "Isosceles"


#inicio do programa
print("---------------------ANALISADOR DE TRIÂNGULO----------------------\n")

length_side1 = float(input("Digite o comprimento do 1º lado: "))

while length_side1 <= 0:
    print("ERRO! a medida não pode ser um valor negativo o igual a 0!!!")
    length_side1 = float(input("\nDigite o comprimento do 1º lado: "))

length_side2 = float(input("Digite o comprimento do 2º lado: "))

while length_side2 <= 0:
    print("ERRO! a medida não pode ser um valor negativo o igual a 0!!!")
    length_side2 = float(input("\nDigite o comprimento do 2º lado: "))

length_side3 = float(input("Digite o comprimento do 3º lado: "))

while length_side3 <= 0
    print("ERRO! a medida não pode ser um valor negativo o igual a 0!!!")
    length_side3 = float(input("Digite o comprimento do 3º lado: "))

print("---------------------------------------")

if checkIfIsTriangle(length_side1, length_side2, length_side3):
    triangleType = analyseTriangleType(length_side1, length_side2, length_side3)
    print(f"As medidas digitadas formam um triângulo {triangleType}")
else:
    print("Os valores digitados não forma um triângulo!")            

