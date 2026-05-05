public class LibroDigital extends Libro implements Descargable, Cloneable{
    private double tamañoMB;

    public LibroDigital(String titulo, int añoPublicacion, int numPaginas, double tamañoMB) {
        super(titulo, añoPublicacion, numPaginas);
        this.tamañoMB = tamañoMB;
    }

    
    public LibroDigital(LibroDigital otro) {
        super(otro.getTitulo(),otro.getAñoPublicacion(),otro.getNumPaginas());
        this.tamañoMB = otro.tamañoMB;
    }


    public void descargar(){
        System.out.println("Descargando "+getTitulo()+" de "+tamañoMB+"MB...");
    }

    @Override
    public String getTitulo(){
        return super.getTitulo();
    }
    
    @Override
    public Object clone(){
        Object obj = null;
        try{
            obj = super.clone();
        }catch(CloneNotSupportedException ex){
            System.out.println(("No se pudo clonar el televisor"));
        }
        return obj;
    }
}
