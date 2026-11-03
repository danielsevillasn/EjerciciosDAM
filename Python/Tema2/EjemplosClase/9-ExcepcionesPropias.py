"""
raise ExceptionType("Mensaje de error")
• ExceptionType es la clase de excepción que deseas lanzar.
• Mensaje de error es una cadena opcional que proporciona detalles 
sobre el error.
"""
def verificar_edad(edad):
    if not isinstance(edad, (int, float)):
        raise TypeError("La edad debe ser un número")
    if edad < 0:
        raise ValueError("La edad no puede ser negativa")
    if edad > 150:
        raise ValueError("Edad no válida: demasiado alta")
    return True
try:
    verificar_edad(-5)
except ValueError as e:
    print(f"Error de validación: {e}")
except TypeError as e:
    print(f"Error de tipo: {e}")

"""
Para crear una excepción personalizada, simplemente 
definimos una nueva clase que hereda de Exception.

class MiExcepcionPersonalizada(Exception):
def __init__(self, mensaje):
    super().__init__(mensaje)
"""
class ErrorDeValidacion(Exception):
    def __init__(self, campo, mensaje):
        self.campo = campo
        self.mensaje = mensaje
        super().__init__(f"Error en '{campo}': {mensaje}")
# Lanzar la excepción
raise ErrorDeValidacion("nombre", "El nombre no puede estar vacío.")


class MiExcepcion(Exception): 
    def __init__(self, valor):
        self.valor = valor
    def __str__(self):
        return "Error: " + str(self.valor)
try:
    fin = False
    while not fin:
        entrada = input("Introduzca c para continuar o f para finalizar:")
    if entrada != "f" and entrada != "c":
        raise MiExcepcion(entrada + " no es un valor válido.")
    elif entrada == "f": 
        fin = True
except MiExcepcion as e:
    print (e)

class ErrorDeConexion(ErrorDeApp):
    """Error al intentar establecer una conexión."""
    def __init__(self, mensaje="No se pudo establecer la conexión"):
        self.mensaje = mensaje
        super().__init__(self.mensaje)
class ErrorDeDatos(ErrorDeApp):
    """Error relacionado con los datos de la aplicación."""
    pass
class ErrorDeFormato(ErrorDeDatos):
    """Error de formato incorrecto en los datos."""
    def __init__(self, mensaje="Formato de datos incorrecto"):
        self.mensaje = mensaje
        super().__init__(self.mensaje)


def conectar_a_servicio(url):
    if "mal" in url:
        raise ErrorDeConexion("URL malformada")
    print(f"Conectando a {url}...")
    # Simular un error de conexión
    if "servicio_caido" in url:
        raise ErrorDeConexion("El servicio está caído")
def procesar_datos(data):
    if not isinstance(data, dict):
        raise ErrorDeFormato("Los datos deben ser un diccionario")
    print("Procesando datos...")
# Simular otro error de datos
    if "error" in data:
        raise ErrorDeDatos("Error interno en el procesamiento de datos")
# --- Bloque try-except ---
try:
    conectar_a_servicio("http://servicio_caido")
    procesar_datos({"nombre": "Ejemplo"})
except ErrorDeConexion as e:
    print(f"Error de conexión: {e}") # Capta 
    ErrorDeConexion
except ErrorDeFormato as e:
    print(f"Error de formato: {e}")  # Capta 
    ErrorDeFormato
except ErrorDeDatos as e:
    print(f"Error de datos: {e}")   # Capta 
    ErrorDeDatos
except ErrorDeApp as e:
    print(f"Un error genérico de la aplicación ocurrió: {e}") # Capta otros ErroresDeApp