/*
Clase con métodos para cambios de base
 */
package Ejercicio1AL16_Profe.metodos;

/**
 *
 * @author Inma
 */
public class CambiaBase {

 /**
   * Pasa un número binario (en base 2) a octal (base 8).
   * 
   * @param binario número entero en binario
   * @return        número inicial pasado a octal
   */
  public static long binarioAOctal(long binario) {
    long octal = 1;
  
    while (binario > 0) {
      octal = octal * 10 + (binarioADecimal(binario % 1000));
      binario = binario / 1000;
    }
  
    octal = Ejer.pegaPorDetras(octal, 1);
    octal = Ejer.voltea(octal);
    octal = Ejer.quitaPorDetras(octal, 1);
    octal = Ejer.quitaPorDelante(octal, 1);
    
    return octal;
  }
  
  /**
   * Pasa un número binario (en base 2) a decimal (base 10).
   * 
   * @param binario número entero en binario
   * @return        número inicial pasado a decimal
   */
  public static long binarioADecimal(long binario) {
    long decimal = 0;
  
    int bits = Ejer.digitos(binario);
    
    for(int i = 0; i < bits; i++) {
      decimal += Ejer.digitoN(binario, bits - i - 1) * Ejer.potencia(2, i);
    }
      
    return decimal;
  }
  
  /**
   * Pasa un número binario (en base 2) a hexadecimal (base 16).
   * 
   * @param binario número entero en binario
   * @return        número inicial pasado a hexadecimal
   */
   public static String binarioAHexadecimal(long binario) {
    String hexadecimal = "";
    String digitosHexa = "0123456789ABCDEF";
  
    while (binario > 0) {
      hexadecimal = digitosHexa.charAt((int)binarioADecimal(binario % 10000)) + hexadecimal;
      binario = binario / 10000;
    };
      
    return hexadecimal;
  }
  
  /**
   * Pasa un número octal (en base 8) a binario (base 2).
   * 
   * @param octal número entero en octal
   * @return      número inicial pasado a binario
   */
  public static long octalABinario(long octal) {
    long binario = 0;
  
    for (int i = 0; i < Ejer.digitos(octal); i++) {
      binario = binario * 1000 + decimalABinario(Ejer.digitoN(octal, i));
    }
    
    return binario;
  }
  
/**
   * Pasa un número decimal (en base 10) a binario (base 2).
   * 
   * @param decimal número entero en base 10
   * @return        número inicial pasado a binario
   */
  public static long decimalABinario(int decimal) {
  
    if (decimal == 0) {
      return 0;
    }
      
    long binario = 1;
    
    while (decimal > 1) {
      binario = Ejer.pegaPorDetras(binario, decimal % 2);
      decimal = decimal / 2;
    }
    binario = Ejer.pegaPorDetras(binario, 1);
    binario = Ejer.voltea(binario);
    binario = Ejer.quitaPorDetras(binario, 1);
    
    return binario;
  }

  /**
   * Pasa un número hexadecimal (en base 10) a binario (base 2).
   * 
   * @param hexadecimal número entero en hexadecimal
   * @return            número inicial pasado a binario
   */
  public static long hexadecimalABinario(String hexadecimal) {
    String digitosHexa = "0123456789ABCDEF";
    long binario = 0;
  
    for (int i = 0; i < hexadecimal.length(); i++) {
      final long decimal = decimalABinario(digitosHexa.indexOf(hexadecimal.charAt(i)));
      binario = binario * 10000 + decimal;
    }

    return binario;
  }
  
}
