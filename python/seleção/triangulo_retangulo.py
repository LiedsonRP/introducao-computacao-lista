
def checkIfIsTriangleRectangle(cathet1, cathet2, hypotenuse):
    return (hypotenuse * hypotenuse) == (cathet1 * cathet1) + (cathet2 * cathet2)

print("---------------------TRIÂNGULO RETÂNGULO----------------------\n")

cathet1 = float(input("Digite a medida do 1º cateto: "))
cathet2 = float(input("Digite a medida do 2º cateto: "))
hypotenuse = float(input("Digite a medida da hipotenusa: "))

print("---------------------------------------")
if (checkIfIsTriangleRectangle(cathet1, cathet2, hypotenuse)):
    print("As medidas passadas formam um triângulo retângulo")
else:
    print("As medidas passadas não formam um triângulo retângulo")