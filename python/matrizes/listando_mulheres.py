
def searchPeopleByGender(gender, people_list):
    
    list_filtered = []
    
    for people in people_list:
        if people[2] == gender:
            list_filtered.append(people)
        
    return list_filtered

print("---------------------LISTANDO MULHERES----------------------\n")

name = ''
age = 0
gender = ''

people_list = []
filtered_list = []

#cadastra as pessoas na lista
for i in range(20):
    name = input("Nome: ")
    age = int(input("idade: "))
    
    while age <= 0:
        print("ERRO!!! A idade deve ser um valor positivo!")
        age = int(input("\nidade: "))
        
    gender = input("Qual o sexo biológico [M/F]? ").upper()
    
    while gender not in ["M", "F"]:
        print("ERRO!!! O sistema apenas aceitas os gêneros biológicos M-Masculino e F-feminino")
        gender = input("\nQual o sexo biológico [M/F]? ").upper()
    
    people_list.append([name, age, gender])
    
    print("---------------------------------------------")

print("****************************************")
        
#Pesquisa as pessoas de gênero feminino e as mostra na tela
filtered_list = searchPeopleByGender("F", people_list)

for i in filtered_list:
    print(f"Nome: {i[0]}")
    print(f"Idade: {i[1]}")
    print(f"Sexo: {i[2]}")
    
    print("---------------------------------")




        