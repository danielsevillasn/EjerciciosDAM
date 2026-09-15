# capitalize() - Convierte el primer carácter a mayúscula
"hola mundo".capitalize()  # "Hola mundo"

# casefold() - Convierte la cadena a minúsculas para comparaciones
"STRASSE".casefold()  # "strasse"

# center() - Devuelve una cadena centrada
"hola".center(10, "*")  # "***hola***"

# count() - Devuelve el número de apariciones de un valor
"banana".count("a")  # 3

# encode() - Devuelve una versión codificada en bytes
"hola".encode("utf-8")  # b'hola'

# endswith() - Devuelve True si la cadena termina con el valor especificado
"archivo.py".endswith(".py")  # True

# expandtabs() - Establece el tamaño de tabulación
"H\te\tl\tl\to".expandtabs(4)  # "H   e   l   l   o"

# find() - Busca un valor y devuelve su posición (o -1 si no lo encuentra)
"python".find("th")  # 2

# format() - Formatea valores especificados
"Hola, {}".format("Ana")  # "Hola, Ana"

# format_map() - Formatea valores usando un diccionario
"Hola, {nombre}".format_map({"nombre": "Ana"})  # "Hola, Ana"

# index() - Busca un valor y devuelve su posición (lanza ValueError si no existe)
"python".index("th")  # 2

# isalnum() - Devuelve True si todos los caracteres son alfanuméricos
"python3".isalnum()  # True

# isalpha() - Devuelve True si todos los caracteres son letras
"python".isalpha()  # True

# isascii() - Devuelve True si todos los caracteres son ASCII
"hello".isascii()  # True

# isdecimal() - Devuelve True si todos los caracteres son decimales (0-9)
"123".isdecimal()  # True

# isdigit() - Devuelve True si todos los caracteres son dígitos
"123".isdigit()  # True

# isidentifier() - Devuelve True si es un nombre de variable válido
"mi_variable".isidentifier()  # True

# islower() - Devuelve True si todos los caracteres están en minúsculas
"hola".islower()  # True

# isnumeric() - Devuelve True si todos los caracteres son numéricos
"123".isnumeric()  # True

# isprintable() - Devuelve True si todos los caracteres son imprimibles
"Hola\nMundo".isprintable()  # False

# isspace() - Devuelve True si todos los caracteres son espacios en blanco
"   ".isspace()  # True

# istitle() - Devuelve True si sigue las reglas de formato de título
"Hola Mundo".istitle()  # True

# isupper() - Devuelve True si todos los caracteres están en mayúsculas
"HOLA".isupper()  # True

# join() - Une los elementos de un iterable
"-".join(["a", "b", "c"])  # "a-b-c"

# ljust() - Alinea la cadena a la izquierda con un relleno determinado
"hola".ljust(10, "-")  # "hola------"

# lower() - Convierte la cadena a minúsculas
"HOLA".lower()  # "hola"

# lstrip() - Recorta los espacios en blanco a la izquierda
"   hola".lstrip()  # "hola"

# maketrans() - Crea una tabla de traducción para reemplazar caracteres
tabla = str.maketrans("a", "o")

# partition() - Divide la cadena en una tupla de 3 partes según un separador
"usuario@email.com".partition("@")  # ('usuario', '@', 'email.com')

# replace() - Reemplaza un valor especificado por otro
"hola mundo".replace("mundo", "todos")  # "hola todos"

# rfind() - Busca un valor desde la derecha y devuelve la última posición
"banana".rfind("a")  # 5

# rindex() - Busca un valor desde la derecha y devuelve la última posición
"banana".rindex("a")  # 5

# rjust() - Alinea la cadena a la derecha con un relleno determinado
"hola".rjust(10, "-")  # "------hola"

# rpartition() - Divide la cadena desde la derecha en 3 partes
"ruta/a/archivo.txt".rpartition("/")  # ('ruta/a', '/', 'archivo.txt')

# rsplit() - Divide la cadena desde la derecha con un número límite de cortes
"a,b,c".rsplit(",", 1)  # ['a,b', 'c']

# rstrip() - Recorta los espacios en blanco a la derecha
"hola   ".rstrip()  # "hola"

# split() - Divide la cadena según un separador y devuelve una lista
"a,b,c".split(",")  # ['a', 'b', 'c']

# splitlines() - Divide la cadena en los saltos de línea
"hola\nmundo".splitlines()  # ['hola', 'mundo']

# startswith() - Devuelve True si la cadena comienza con el valor especificado
"python".startswith("py")  # True

# strip() - Recorta espacios en blanco al inicio y al final
"   hola   ".strip()  # "hola"

# swapcase() - Intercambia mayúsculas a minúsculas y viceversa
"Hola Mundo".swapcase()  # "hOLA mUNDO"

# title() - Convierte la primera letra de cada palabra a mayúscula
"hola mundo".title()  # "Hola Mundo"

# translate() - Devuelve una cadena modificada usando una tabla de traducción
"hola".translate(str.maketrans("a", "o"))  # "holo"

# upper() - Convierte la cadena a mayúsculas
"hola".upper()  # "HOLA"

# zfill() - Rellena la cadena con ceros al principio hasta alcanzar la longitud
"42".zfill(5)  # "00042"