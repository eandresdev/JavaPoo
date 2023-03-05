//  CLASE SERVICIOS
package libroServicio;

//importamos clase y librerias para interactuar
import LibroEntidades.Libro; 
import java.util.Locale;
import java.util.Scanner;

public class LibroServicio {
    //inicializo scanner de forma global
    private static Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    public Libro llenarLibro() {
        
        // instancian objeto de tipo libro
        Libro l1 = new Libro();
        
        //lleno atributos
        System.out.println("Por favor complete los datos para poder cargar el libro al sistema: ");
        System.out.println("ISBN: ");
        l1.setIsbn(leer.next());
        System.out.println("Título: ");
        l1.setTitulo(leer.next());
        System.out.println("Autor: ");
        l1.setAutor(leer.next());
        System.out.println("Número de páginas: ");
        l1.setnPaginas(leer.nextInt());
        
        System.out.println("--------------------------------");
        
        return l1; // retornamos el objeto l1 con todos los atributos llenos
    
    }// fin metodo llenar libro
    
    public void mostrarLibro(Libro l1) { // le pasamos como parametro un objeto de tipo libro 
        System.out.println("Usted solicito el libro: ");
        
        System.out.println("ISBN: "+l1.getIsbn());
        System.out.println("TITULO: "+l1.getTitulo());
        System.out.println("AUTOR: "+l1.getAutor());
        System.out.println("N° PAGINAS: "+l1.getnPaginas());
    }
}
