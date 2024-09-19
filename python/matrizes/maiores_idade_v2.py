
def sortPeopleByAge(people_list):
    
    list_filtered = []
    ages = dict()
    
    #cria um dicionario com das idades
    for index in range(0, len(people_list)):
         ages[index] = people_list[index][1]
    
    #ordena os elementos do dicionario de acordo com a idade e usa para criar uma nova lista
    for index in sorted(ages, key = ages.get, reverse=True):
        list_filtered.append(people_list[index])
        
    return list_filtered

print("---------------------LISTANDO MULHERES----------------------\n")

name = ''
age = 0
gender = ''

people_list = []
filtered_list = []

#cadastra as pessoas na lista
for i in range(4):
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
filtered_list = sortPeopleByAge(people_list)
percent_people_on_filter = (len(filtered_list)/len(people_list)) * 100

for i in filtered_list:
    print(f"Nome: {i[0]}")
    print(f"Idade: {i[1]}")
    print(f"Sexo: {i[2]}")
    
    print("---------------------------------")




        

