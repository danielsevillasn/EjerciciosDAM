package Ejercicio1AL19_Alumno.metodos;

/**
 * Clase para los ejercicios 1-14
 *
 * @author dani
 */
public class Funciones {

    /**
     * Recoge una palabra y mira si es capicua al poniendo del reves la palabra
     * 
     * 
     * @param mensaje de peticion de datos tipo String
     * @return booleano que depende de si es capicua o no
     */
    public static boolean EsCapicua(int n) {
        boolean capicua = false;
        // Pasa la palabra a un array en orden al reves
        int nReves = voltea(n);
        // Mira si todo el array es igual al otro
        if (nReves == n) {
            capicua = true;
        } else {
            capicua = false;
        }
        return capicua;
    }

    /**
     * Recoge un numero entero y mira si es primo o no mirando si es divisible por
     * más numeros que el mismo
     * 
     * 
     * @param mensaje de peticion de un numero entero
     * @return booleano que depende de si es primo o no
     */
    public static boolean esPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    /**
     * Recoge un numero entero y mira si es primo o no mirando si es divisible por
     * más numeros que el mismo
     * 
     * 
     * @param mensaje de peticion de un numero entero
     * @return booleano que depende de si es primo o no
     */
    public static int siguientePrimo(int n) {
        boolean primo = false;
        while (!primo) {
            n++;
            primo = esPrimo(n);
        }
        return n;
    }

    /**
     * Calcula la potencia de un numero elevado a otro
     * 
     * @param base      numero base
     * @param exponente numero exponente
     * @return resultado de la potencia
     */
    public static int potencia(int base, int exponente) {
        int resultado = 1;
        if (exponente == 0) {
            return resultado;
        } else {
            for (int i = 0; i < exponente; i++) {
                resultado = resultado * base;
            }
        }
        return resultado;
    }

    /**
     * Cuenta los digitos de un numero entero
     * 
     * @param n numero entero
     * @return numero de digitos
     */
    public static int digitos(int n) {
        int contador = 0;
        if (n == 0) {
            return 1;
        } else {
            while (n != 0) {
                n = n / 10;
                contador++;
            }
        }
        return contador;
    }

    /**
     * Da la vuelta a un numero entero
     * 
     * @param n numero entero
     * @return numero volteado
     */
    public static int voltea(int n) {
        int numeroVolteado = 0;
        while (n > 0) {
            numeroVolteado = (numeroVolteado * 10) + (n % 10);
            n = n / 10;
        }
        return numeroVolteado;
    }

    /**
     * Devuelve el digito en la posicion indicada de un numero entero
     * 
     * @param n        numero entero
     * @param posicion posicion del digito a devolver
     * @return digito en la posicion indicada
     */
    public static int digitoN(int n, int posicion) {
        int digito = 0;
        for (int i = 1; i <= posicion; i++) {
            digito = n % 10;
            n = n / 10;
        }
        return digito;
    }

    /**
     * Devuelve la posicion de la primera ocurrencia de un digito en un numero
     * entero
     * 
     * @param n             numero entero
     * @param digitoBuscado digito a buscar
     * @return posicion del digito buscado o -1 si no se encuentra
     */
    public static int posicionDeDigito(int n, int digitoBuscado) {
        int posicion = -1;
        int posicionActual = 1;
        while (n > 0) {
            int digito = n % 10;
            if (digito == digitoBuscado) {
                posicion = posicionActual;
            }
            n = n / 10;
            posicionActual++;
        }
        return posicion;
    }

    /**
     * Quita una cantidad de digitos por detras de un numero entero
     * 
     * @param n        numero entero
     * @param cantidad cantidad de digitos a quitar
     * @return numero sin los digitos quitados
     */
    public static int quitaPorDetras(int n, int cantidad) {
        for (int i = 0; i < cantidad; i++) {
            n = n / 10;
        }
        return n;
    }

    /**
     * Quita una cantidad de digitos por delante de un numero entero
     * 
     * @param n        numero entero
     * @param cantidad cantidad de digitos a quitar
     * @return numero sin los digitos quitados
     */
    public static int quitaPorDelante(int n, int cantidad) {
        int numeroVolteado = voltea(n);
        for (int i = 0; i < cantidad; i++) {
            numeroVolteado = numeroVolteado / 10;
        }
        return voltea(numeroVolteado);
    }

    /**
     * Pega un digito por detras de un numero entero
     * 
     * @param n      numero entero
     * @param digito digito a pegar
     * @return numero con el digito pegado por detras
     */
    public static int pegaPorDetras(int n, int digito) {
        int numeroConDigito = (n * 10) + digito;
        return numeroConDigito;
    }

    /**
     * Pega un digito por delante de un numero entero
     * 
     * @param n      numero entero
     * @param digito digito a pegar
     * @return numero con el digito pegado por delante
     */
    public static int pegaPorDelante(int n, int digito) {
        int numeroVolteado = voltea(n);
        numeroVolteado = (numeroVolteado * 10) + digito;
        return voltea(numeroVolteado);
    }

    /**
     * Devuelve un trozo de un numero entero entre dos posiciones
     * 
     * @param n      numero entero
     * @param inicio posicion inicial
     * @param fin    posicion final
     * @return trozo de numero entre las posiciones indicadas
     */
    public static int trozoDeNumero(int n, int inicio, int fin) {
        n = quitaPorDetras(n, digitos(n) - fin);
        n = quitaPorDelante(n, inicio - 1);
        return n;
    }

    /**
     * Junta dos numeros enteros
     * 
     * @param n1 primer numero entero
     * @param n2 segundo numero entero
     * @return numero resultante de juntar los dos numeros
     */
    public static int juntaNumeros(String n1, String n2) {
        String numeroJuntadoString = n1 + n2;
        int numeroJuntado = Integer.parseInt(numeroJuntadoString);
        return numeroJuntado;
    }

    /**
     * Pasa de decimal a binario
     * 
     * @param un numero entero que es el binario
     * @return nada
     */
    public static void BinarioDecimal(int n) {
        int extensionN = Funciones.digitos(n);
        int total = 0;
        int contador = 0;
        for (int i = 1; i <= extensionN; i++) {
            if (Funciones.digitoN(n, i) == 1) {
                total += Funciones.potencia(2, contador);
            }
            contador++;
        }
        System.out.println("El numero pasado a decimal es: " + total);
    }

    /**
     * Pasa de decimal a binario
     * 
     * @param un numero entero que es el decimal
     * @return nada
     */
    public static void DecimalBinario(int n) {
        int total = 0;
        int potencia = 0;
        int contador = 0;
        boolean inicio = true;
        boolean positivo = true;
        if (n < 0) {
            n = -n;
            positivo = false;
        }
        while (n != 0) {
            potencia = Funciones.potencia(2, contador);
            ;
            if (inicio) {
                while (potencia < n) {
                    potencia = Funciones.potencia(2, contador + 1);
                    contador++;
                }
                inicio = false;
            }
            if (n - potencia >= 0) {
                total = Funciones.pegaPorDetras(total, 1);
                n = n - potencia;
            } else if (n - potencia < 0) {
                total = Funciones.pegaPorDetras(total, 0);
            }
            contador--;
        }
        for (int i = contador; i >= 0; i--) {
            total = Funciones.pegaPorDetras(total, 0);
        }
        if (positivo) {
            System.out.println("El numero pasado a binario es: " + total);
        } else {
            System.out.println("El numero pasado a binario es: " + (-total));
        }
    }

    /**
     * Pasa de binario a octal
     * 
     * @param un numero entero que es el binario
     * @return nada
     */
    public static void BinarioOctal(int n) {
        int extensionN = Funciones.digitos(n);
        int total = 0;
        int posicion = 1;

        for (int i = 1; i <= extensionN; i += 3) {
            int valorGrupo = 0;
            int potencia = 0;

            for (int j = i; j < i + 3 && j <= extensionN; j++) {
                if (Funciones.digitoN(n, j) == 1) {
                    valorGrupo += Funciones.potencia(2, potencia);
                }
                potencia++;
            }

            total += valorGrupo * posicion;
            posicion *= 10;
        }

        System.out.println("El numero pasado a octal es: " + total);
    }

    /**
     * Pasa de octal a binario
     * 
     * @param n número en octal
     */
    public static void OctalBinario(int n) {
        int total = 0;
        int posicion = 1; // controla dónde colocar los bits

        while (n > 0) {
            int digito = n % 10; // dígito octal (0–7)

            // Generamos 3 bits
            for (int i = 0; i < 3; i++) {
                int bit = digito % 2;
                digito = digito / 2;

                total += bit * posicion;
                posicion *= 10;
            }

            n = n / 10;
        }

        System.out.println("El numero pasado a binario es: " + total);
    }

    /**
     * Pasa de binario a hexadecimal
     * 
     * @param n numero binario
     */
    public static void BinarioHexadecimal(int n) {
        int total = 0;
        int posicion = 1;

        while (n > 0) {
            int valor = 0;
            int potencia = 1;

            // Leemos 4 bits
            for (int i = 0; i < 4 && n > 0; i++) {
                int bit = n % 10;
                n = n / 10;

                valor += bit * potencia;
                potencia *= 2;
            }

            // Convertimos a símbolo hexadecimal
            int hex;
            if (valor < 10) {
                hex = valor;
            } else {
                hex = valor - 10 + 'A'; // A=10, B=11...
            }

            // Guardamos como "número" (para letras usamos su código)
            total += valor * posicion;
            posicion *= 100;
        }

        System.out.println("El numero pasado a hexadecimal es: " + total);
    }

    /**
     * Pasa de hexadecimal a binario
     * 
     * @param n numero hexadecimal
     */
    public static void HexadecimalBinario(String hex) {
        int total = 0;
        int posicion = 1;

        for (int i = hex.length() - 1; i >= 0; i--) {
            char c = hex.charAt(i);
            int valor;

            if (c >= '0' && c <= '9') {
                valor = c - '0';
            } else {
                valor = c - 'A' + 10;
            }

            // Sacamos 4 bits
            for (int j = 0; j < 4; j++) {
                int bit = valor % 2;
                valor = valor / 2;

                total += bit * posicion;
                posicion *= 10;
            }
        }

        System.out.println("El numero pasado a binario es: " + total);
    }

}
