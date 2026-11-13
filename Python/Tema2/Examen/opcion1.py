codigo_secreto = 2580
print("=== CAJA FUERTE ===")
codigo_resuelto = False

for intentos_restantes in range(2, -1, -1):
  while True:
    try:
        codigoIntroducido = int(input("Introduce el código de 4 dígitos: "))

        if len(str(codigoIntroducido)) != 4:
            print("Error: Debes introducir exactamente 4 números enteros.")
            continue
        if codigoIntroducido == codigo_secreto:
            codigo_resuelto = True
        break 
    except ValueError:
        print("El codigo introducido no es un valor numérico")
  if codigo_resuelto:
    print("Caja fuerte abierta.")
    break
  elif intentos_restantes == 0:
    print("Caja fuerte bloqueada.")
  else:
    print(f"Código incorrecto. Intentos restantes: {intentos_restantes}")