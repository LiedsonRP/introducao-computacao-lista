print("---------------------MILHAS VS KM----------------------\n")

CONVERSION_VALUE_MILES_TO_QUILOMETERS = 1.852

nautical_miles = float(input("\nDigite a quantidade em milhas: "))

while nautical_miles < 0:
        print("ERRO! a medida não pode ser um valor negativo!!!")
        nautical_miles = float(input("\nDigite a quantidade em milhas: "))

quilometers = nautical_miles * CONVERSION_VALUE_MILES_TO_QUILOMETERS

print("---------------------------------------")
print(f"O valor passado é equivalente a {quilometers}km")

