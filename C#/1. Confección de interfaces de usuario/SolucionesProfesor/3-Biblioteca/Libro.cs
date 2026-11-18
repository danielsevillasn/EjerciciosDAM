namespace Biblioteca
{
    class Libro
    {
        /* Objeto. */
        // Atributos.
        private string Titulo;
        private string Autor;
        private string Editorial;
        private string RutaImagen;
        private readonly bool EsNuevo;

        // Constructores.
        /**
         * Constructor a partir de todos los parámetros.
         * 
         * */
        public Libro(string pTitulo, string pAutor, string pEditorial, string
            pRutaImagen, bool pEsNuevo)
        {
            Titulo = pTitulo;
            Autor = pAutor;
            Editorial = pEditorial;
            RutaImagen = pRutaImagen;
            EsNuevo = pEsNuevo;
        }

        // Getters.
        public string GetTitulo()
        {
            return Titulo;
        }

        public string GetAutor()
        {
            return Autor;
        }

        public string GetEditorial()
        {
            return Editorial;
        }

        public string GetRutaImagen()
        {
            return RutaImagen;
        }
    }
}