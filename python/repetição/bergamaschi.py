print("---------------------SEQUÊNCIA DE BERGAMASCHI----------------------\n")

before1 = 0
before2 = 0
actual = 1
step = 0

for i in range(21):
    print(actual, end=" ")
    
    step = actual
    
    if before1 != 0 and before2 != 0:
        actual+= before1 + before2
        
    before2 = before1
    before1 = step