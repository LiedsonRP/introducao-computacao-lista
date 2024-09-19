print("---------------------SEQUÊNCIA DE NÚMEROS-V3----------------------\n")

n = 0
va = 2 #valor do primeiro termo da Pa
numerador = 0
denominador = 1
su = 0

"""
Após análise foi constatado que o numerador segue o sistema de uma PA de 2º nível, portanto
foi-se reduzido a uma formula para facilitar o calculo dos valores
"""
a1 = 3 #Termo inicial da PA de 2º nível da sequência especificada
r = 2


n = int(input("\nQuais os 'n' primeiros valores você quer consultar? "))

while n <= 0 or n > 50:
    print("ERRO!!! O intervalo não pode ser um número negativo, maior que 50 ou igual 0")
    n = int(input("\nQuais os 'n' primeiros valores você quer consultar? "))

for i in range(0, n+1):
    
    numerador = va + (i * (a1 + (a1 + (i-1) * r))) / 2
    print(numerador)
    denominador = (i + 1) ** 3
    
    su+= (numerador / denominador)

print("--------------------------------------------")
print(f"A soma de todos os valores é igual a {su:.2f}")