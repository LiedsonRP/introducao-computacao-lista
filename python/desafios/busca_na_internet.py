print("---------------------BUSCA NA INTERNET----------------------\n")

quant_click_3_link = int(input("Nº de cliques no 3º link: "))

while quant_click_3_link > 1000 or quant_click_3_link < 1:
    print("A quantidade de cliques não pode ser menor que 1 ou maior que 1000")
    quant_click_3_link = int(input("Nº de cliques no 3º link: "))
    

quant_click_1_link = quant_click_3_link * 4;

print(quant_click_1_link)

