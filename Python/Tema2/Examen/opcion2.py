codigo_secreto = "2580"  # Guardarlo como texto permite códigos como "0580"
intentos = 3

print("=== CAJA FUERTE ===")

while intentos > 0:
  entrada = input("Introduce el código de 4 dígitos: ")

  # 1. Validación sin gastar intentos
  if len(entrada) != 4 or not entrada.isdigit():
    print("Error: Debes introducir exactamente 4 números.")
    continue  # Vuelve arriba sin restar intentos

  # 2. Comprobación del código
  if entrada == codigo_secreto:
    print("Caja fuerte abierta.")
    break  # Corta el bucle y evita que se ejecute el 'else' final

  # 3. Si falla, restamos un intento
  intentos -= 1
  if intentos > 0:
    print(f"Código incorrecto. Intentos restantes: {intentos}")

else:
  # Solo entra aquí si intentos llegó a 0 (nunca hubo break)
  print("Caja fuerte bloqueada.")