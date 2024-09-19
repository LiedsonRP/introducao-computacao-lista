
NUM_VALUES = 5
total = 0
payment = 0
change = 0

print("---------------------COMPRA E TROCO----------------------\n")

for i in range(1, NUM_VALUES+1):
    value = float(input(f"Digite o valor do {i} valor R$ "))
    
    while value <= 0:
        print("O valor do produto não pode ser negativo ou igual a R$ 0.00")
        value = float(input(f"\nDigite o valor do {i} valor R$ "))

    total+=value
    
print("---------------------------------------\n")
print(f"Total dos produtos R$ {total}")
print("---------------------------------------\n")

payment = float(input("Quanto foi pago? "))

while payment < 0 or payment < total:
    print("O valor do pagamento não pode ser negativo, igual a R$ 0.00 ou menor que o total dos produtos")
    payment = float(input("\nQuanto foi pago? "))
    
change = payment - total

print(f"\nTroco R$ {change}")
