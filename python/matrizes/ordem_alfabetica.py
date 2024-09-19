print("---------------------ORDEM ALFABETICA----------------------\n")

list_peoples = []

for i in range(5):
    name = input(f"Digite o {i+1}º nome: ").capitalize()
    list_peoples.append(name)

list_peoples.sort()

print("--------------------------------")

for people in list_peoples:
    print(people)