print('Su nombre es "Juan"')

parrafo = """Lorem ipsum dolor sit amet,
consectetur adipiscing elit,
sed do eiusmod tempor incididunt
ut labore et dolore magna aliqua."""

print(parrafo)
print(parrafo[0])

for x in parrafo:
    print(x, end= "")

print()

print("La cantidad de caracteres que hay en el parrafo son", len(parrafo))

if "elit" in parrafo:
    print('"elit" esta en el parrafo')

if "hola" not in parrafo:
    print('"hola" no esta en el parrafo')