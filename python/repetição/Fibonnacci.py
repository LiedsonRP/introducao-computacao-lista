print("---------------------SEQUÊNCIA DE FIBONNACCI----------------------\n")

before = 1
step = 0
actual = 0

for i in range(31):
    print(actual, end=" ")
    step = actual
    actual = before + actual
    before = step