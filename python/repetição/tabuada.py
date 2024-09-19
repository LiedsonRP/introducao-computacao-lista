print("---------------------TABUADA----------------------\n")

number = int(input("Qual número você quer saber a tabuada: "))

while number <= 0:
    print("ERROR!!! O número pode apenas ser positivo!!!")
    number = int(input("\nQual número você quer saber a tabuada: "))

for i in range(1,11):
    print(f"{number} X {i} = {number * i}\n")
