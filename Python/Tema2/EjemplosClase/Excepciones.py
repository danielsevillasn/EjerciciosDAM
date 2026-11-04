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
    print(f"Error de conexión: {e}") # Capta ErrorDeConexion
except ErrorDeFormato as e:
    print(f"Error de formato: {e}")  # Capta ErrorDeFormato
except ErrorDeDatos as e:
    print(f"Error de datos: {e}")   # Capta ErrorDeDatos
except ErrorDeApp as e:
    print(f"Un error genérico de la aplicación ocurrió: {e}") # Capta otros ErroresDeApp