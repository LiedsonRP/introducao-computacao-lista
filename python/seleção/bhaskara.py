import math

def calcDelta(ax, bx, c):
    return (bx * bx) -4 * ax * c;

def calcBhaskara(ax, bx, c, delta):
     x1 = ((bx * -1) - math.sqrt(delta)) / (2 * ax)
     x2 = ((bx * -1) + math.sqrt(delta)) / (2 * ax)
     
     return (x1, x2)

print("---------------------VOLUME DA ESFERA----------------------\n")

a = float(input("Informe o valor de a: "))
b = float(input("Informe o valor de b: "))
c = float(input("Informe o valor de c: "))

delta = calcDelta(a, b, c)

print("---------------------------------------")
if delta < 0:
    print("Delta Negativo - nenhuma raiz")
elif delta == 0:
    print("Duas raizes iguais!")
    roots = calcBhaskara(a, b, c, delta)
    
    print(f"O módulo das raizes é igual a {math.fabs(roots[0])}")
else:
    print("Duas raizes iguais")
    roots = calcBhaskara(a, b, c, delta)
    
    print(f"As raizes encontradas foram: \nx1:{roots[0]} \nx2:{roots[1]}")
