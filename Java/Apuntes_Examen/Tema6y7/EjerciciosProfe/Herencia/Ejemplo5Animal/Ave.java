package EjemploAula.Tema09.tema.Ejemplo5Animal;

/**
 * Ave.java
 * Definici�n de la clase Ave
 * @author inma
 */
public class Ave extends Animal {
  
  public Ave(Sexo s) {
    super(s);
  }

  public Ave() {
    super();
  }

  /**
   * Hace que el ave se limpie.
   */  
  public void aseate() {
    System.out.println("Me estoy limpiando las plumas");
  }

  /**
   * Hace que el ave levante el vuelo.
   */  
  public void vuela() {
    System.out.println("Estoy volando");
  }
}
