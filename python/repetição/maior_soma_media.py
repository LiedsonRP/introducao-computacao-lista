print("---------------------MAIOR, SOMA, MÉDIA----------------------\n")

su = 0
average = 0
max_value = 0
value = 0

value = int(input("\nDigite o 1º valor: "))

while value < 0:
    print("ERROR!!! O número pode apenas ser positivo!!!")
    value = int(input("\nDigite o 1º valor: "))

max_value = value
su+=value

for i in range(2, 11):
    
    value = int(input(f"\nDigite o {i} valor: "))
    
    while num_values <= 0:
       print("ERROR!!! O número pode apenas ser positivo!!!")
       num_values = int(input("\nQuantos valores você quer digitar? "))

    while value < 0:
        print("ERROR!!! O número pode apenas ser positivo!!!")
        value = int(input("\nDigite o {i} valor: "))
        
    if value > max_value:
        max_value = value
    
    su+=value

average = su / 10;

print("------------------------------------------------------")
print(f"O maior valor digitado foi {max_value}")
print(f"A soma dos valores é igual a {su}")
print(f"A média aritmética dos valores é igual a {average}")
  
