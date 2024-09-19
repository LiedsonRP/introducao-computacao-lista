print("---------------------SEQUÊNCIA DE NÚMEROS-V1----------------------\n")

INIT_INTERVAL = 3
INTERVAL_REASON = 2
an = 2;
n = 0;
su = 0;

n = int(input("\nQuais os 'n' primeiros valores você quer consultar? "))

while n <= 0 or n > 100:
    print("ERRO!!! O intervalo não pode ser um número negativo, maior que 100 ou igual 0")
    n = int(input("\nQuais os 'n' primeiros valores você quer consultar? "))

for i in range(1, n+1):
    print(an, end=" ")
    su+=an
    an = INIT_INTERVAL + INTERVAL_REASON * (i-1) + an

print("\n-----------------------------------------")
print(f"A soma dos valores é igual a {su}")
    