package EjemploAula.Tema09.tema.Ejemplo5Animal;

/**
 * Animal.java
 * Definici�n de la clase Animal
 * @author inma
 */
public abstract class Animal {

  private Sexo sexo;

  public Animal() {
    this.sexo = Sexo.MACHO;
  }

  public Animal (Sexo x) {
    this.sexo = x;
  }

  public Sexo getSexo() {
    return this.sexo;
  }

  @Override
  public String toString() {
    return "Sexo: " + this.sexo + "\n";
  }
  
  /**
   * Hace que el animal se eche a dormir.
   */
  public void duerme() {
    System.out.println("Zzzzzzz");
  }
  
  public void come() {
    System.out.println("Ah  Qu� rico!");
  }
  
  public void come(String comida) {
    System.out.println("\"Ah  Qu� rico, me gusta comer " + comida + "!");
  }
}
