import math

print("---------------------CALCULADORA TRIGONOMÊTRICA----------------------\n")

angle_rad = math.radians(float(input("Digite o ângulo em graus (°): "))) #pega um ângulo digitado pelo usuário e converte para radianos

sen = math.sin(angle_rad)
cos = math.cos(angle_rad)
tan = math.tan(angle_rad)
sec = 1 / cos

print("---------------------------------------")
print(f"\nSeno: {sen}rad \nCosseno: {cos}rad \nTangente: {tan}rad \nSecante: {sec}rad")