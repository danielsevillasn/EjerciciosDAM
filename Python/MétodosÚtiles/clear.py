import os
import subprocess

class Consola:
    @staticmethod
    def limpiar():
        """Limpia la pantalla de la terminal según el sistema operativo."""
        comando = 'cls' if os.name == 'nt' else 'clear'
        subprocess.run(comando, shell=True)