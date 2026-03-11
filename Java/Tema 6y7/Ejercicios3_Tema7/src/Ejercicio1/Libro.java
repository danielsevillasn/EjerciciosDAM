public class Libro {
    private String ISBN;
    private String titulo;
    private int numeroPaginas;
    private String autor;
    private boolean prestado;

    public Libro() {
        ISBN = "";
        titulo = "";
        numeroPaginas = 0;
        autor = "";
        prestado = false;
    }

    public Libro(String ISBN, String titulo, int numeroPaginas, String autor, boolean prestado) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
        this.prestado = prestado;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setPrestado(boolean prestado) {
        this.prestado = prestado;
    }

    public void prestar(){
        if(!prestado){
            prestado = true;
        }
    }

    public void devolver(){
        if(prestado){
            prestado = false;
        }
    }

    public Double imprimir(double coste){
        return numeroPaginas*coste;
    }

    @Override
    public String toString() {
        if(prestado){
            return "El libro " + ISBN+" con titulo "+titulo+" y autor "+autor+" tiene "+numeroPaginas+" paginas y esta prestado";
        }else{
            return "El libro " + ISBN+" con titulo "+titulo+" y autor "+autor+" tiene "+numeroPaginas+" paginas y no esta prestado";
        }
    }
}
