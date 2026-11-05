dinero_inicial = 60.0
precio_balon = float(input("¿Cuanto cuesta el balon? "))
descuento = float(input("¿Que descuento tiene (en %)? "))

precio_final = precio_balon*(1-descuento/100)
dinero_sobrante = dinero_inicial-precio_final

print(f"El balon cuesta {precio_final:.1f}€ despues del descuento")
print(f"Te quedan {dinero_sobrante:.1f}€.")