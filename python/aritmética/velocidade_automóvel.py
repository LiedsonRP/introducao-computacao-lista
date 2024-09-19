
VELOCITY_CONVERSION_VALUE = 3.6

print("---------------------VELOCIDADE AUTOMÓVEL----------------------\n")

initial_velocity = float(input("Qual a velocidade inicial do veículo (m/s)? "))

while initial_velocity < 0:
        print("ERRO! a medida não pode ser um valor negativo!!!")
        initial_velocity = float(input("\nQual a velocidade inicial do veículo (m/s)? "))

acceleration = float(input("Qual a aceleração do veiculo durante o percuso (m/s2)? "))

time = int (input("Por quanto tempo o veículo se deslocou (s)? "))

while time < 0:
    print("ERRO! a medida não pode ser um valor negativo!!!")
    time = int (input("\nPor quanto tempo o veículo se deslocou (s)? "))

final_velocity = (initial_velocity + acceleration * time) * VELOCITY_CONVERSION_VALUE

if final_velocity <= 0: 
    final_velocity = 0

print("---------------------------------------")
print(f"O veículo no cenário passado apresenta velocidade de {final_velocity}Km/h")

