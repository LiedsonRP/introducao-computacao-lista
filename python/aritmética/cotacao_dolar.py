print("---------------------COTAÇÃO DOLAR----------------------\n")

dollar_quote = float(input("Qual a cotação do dolar em reais (R$)? "))

while dollar_quote <= 0:
    print("ERRO! a medida não pode ser um valor negativo ou igual a 0!!!")
    dollar_quote = float(input("\nQual a cotação do dolar em reais (R$)? "))

dollar = float(input("Qual o valor em dolar ($)? "))

while dollar < 0:
    print("ERRO! a medida não pode ser um valor negativo!!!")
    dollar = float(input("\nQual o valor em dolar ($)? "))

brazillian_coin = dollar * dollar_quote

print("---------------------------------------")
print(f"O valor convertido é igual a R$ {brazillian_coin}")