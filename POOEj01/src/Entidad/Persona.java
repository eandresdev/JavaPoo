
package Entidad;

public class Persona {
    
    //estructura de un constructor
    /*[<modificador>] <nombre de clase> ( <argumento>* ) {
        <sentencia>*
      }*/
    
    public Persona() { // constructor por defecto o vacio
        
    }

    public Persona(String profesion, String nombre, int edad) {// constructor c/ parametros
        this.profesion = profesion;
        this.nombre = nombre;
        this.edad = edad;
    }
    
    //atributos
    //<modificador> <tipo> <nombre>
    public String profesion;
    public String nombre;
    public int edad;
    
           
}
