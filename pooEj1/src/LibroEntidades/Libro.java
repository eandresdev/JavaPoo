// CLASE LIBRO
package LibroEntidades;


public class Libro {
    
    //atributos
    private String isbn;
    private String titulo;
    private String autor;
    private int nPaginas;
    
    //constructor por defecto
    public Libro() {
        
    }

    //constructor por parametro
    public Libro(String isbn, String titulo, String autor, int nPaginas) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.nPaginas = nPaginas;
    }
    
    
    // getter & setter
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getnPaginas() {
        return nPaginas;
    }

    public void setnPaginas(int nPaginas) {
        this.nPaginas = nPaginas;
    }
    
    //toString

    @Override
    public String toString() {
        return "libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", nPaginas=" + nPaginas + '}';
    }
    
    
}// fin libro