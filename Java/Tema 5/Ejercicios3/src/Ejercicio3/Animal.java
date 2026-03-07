package Ejercicio3;

// Clase base Animal
class Animal {
    public void comer() {
        System.out.println("El animal está comiendo");
    }

    public void dormir() {
        System.out.println("El animal está durmiendo");
    }

    public void moverse() {
        System.out.println("El animal se está moviendo");
    }
}

// Mamífero hereda de Animal
class Mamifero extends Animal {
    public void amamantar() {
        System.out.println("El mamífero amamanta a sus crías");
    }
}

// Ave hereda de Animal
class Ave extends Animal {
    public void volar() {
        System.out.println("El ave está volando");
    }
}

// Reptil hereda de Animal
class Reptil extends Animal {
    public void tomarSol() {
        System.out.println("El reptil toma el sol");
    }
}

// Gato hereda de Mamifero
class Gato extends Mamifero {
    public void maullar() {
        System.out.println("El gato maúlla");
    }
}

// Perro hereda de Mamifero
class Perro extends Mamifero {
    public void ladrar() {
        System.out.println("El perro ladra");
    }
}

// Canario hereda de Ave
class Canario extends Ave {
    public void cantar() {
        System.out.println("El canario canta");
    }
}

// Pingüino hereda de Ave
class Pinguino extends Ave {
    @Override
    public void volar() {
        System.out.println("El pingüino no puede volar");
    }

    public void nadar() {
        System.out.println("El pingüino está nadando");
    }
}

// Lagarto hereda de Reptil
class Lagarto extends Reptil {
    public void camuflarse() {
        System.out.println("El lagarto se camufla");
    }
}