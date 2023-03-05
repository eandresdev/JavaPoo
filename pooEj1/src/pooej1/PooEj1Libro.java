// MAIN
package pooej1;


import LibroEntidades.Libro;
import libroServicio.LibroServicio;


public class PooEj1Libro {

    
    public static void main(String[] args) {
        /*
        1. Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
           Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
           constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
           luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
           numero de páginas.
        */
        
        //instanciamos un objeto de tipo servicio para acceder
        LibroServicio ls = new LibroServicio();
        Libro l1 = ls.llenarLibro();
        
        
        ls.mostrarLibro(l1);
        
    }//fin metodo main
    
}// fin clase
