# & (AND) - Establece cada bit en 1 si ambos bits son 1
print(6 & 3)  # 2

# | (OR) - Establece cada bit en 1 si al menos uno de los dos bits es 1
print(6 | 3)  # 7

# ^ (XOR) - Establece cada bit en 1 si solo uno de los dos bits es 1
print(6 ^ 3)  # 5

# ~ (NOT) - Invierte todos los bits (C3: ~x = -(x + 1))
print(~6)  # -7

# << (Zero fill left shift) - Desplaza los bits a la izquierda agregando ceros
print(6 << 2)  # 24

# >> (Signed right shift) - Desplaza los bits a la derecha desechando los de la derecha
print(6 >> 2)  # 1