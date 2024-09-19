print("---------------------SEQUÊNCIA DE NÚMEROS-V2----------------------\n")

n = 0
numerador = 1
denominador = 2
su = 0

n = int(input("\nQuais os 'n' primeiros valores você quer consultar? "))

while n <= 0 or n > 50:
    print("ERRO!!! O intervalo não pode ser um número negativo, maior que 50 ou igual 0")
    n = int(input("\nQuais os 'n' primeiros valores você quer consultar? "))

for i in range(1, n+1):
    su+=(numerador/denominador)
    numerador+=1
    denominador+=1
    
print("--------------------------------------------")
print(f"A soma de todos os valores é igual a {su}")