public class Main1 {
    public static void main(String[] args) {
        Publicacion[] publicaciones = new Publicacion[2];
        Libro libro = new Libro("JuegosDelHambre", 2010, 300);
        Revista revista = new Revista("Marca", 2002, 5);
        publicaciones[0] = libro;
        publicaciones[1] = revista;
        for(int i = 0; i<publicaciones.length;i++){
            System.out.println(publicaciones[i].getDetalles());
            System.out.println("Precio del alquiler: "+publicaciones[i].calcularPrecioAlquiler());
        }

        Publicacion l1 = new Libro("Quijote", 1605, 500);
        Publicacion l2 = new Libro("Quijote", 1605, 500);
        if(l1.equals(l2)){
            System.out.println(l1+" es igual a: \n"+l2);
        }else{
            System.out.println("Son diferentes");
        }
        System.out.println(((Libro)l1).getDetalles());

        Descargable archivo = new LibroDigital("Java 101", 2024, 500, 15.5);
        archivo.descargar();
        System.out.println(archivo.getTitulo());

        LibroDigital original = new LibroDigital("Biblia", 2024, 1000, 2.0);
        Object clon = original.clone();
        original.setTitulo("Pepe");
        System.out.println(original);
        System.out.println((LibroDigital)clon);
    }
}
