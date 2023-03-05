// Persona clase date
package pooEj12;

import Entity.Persona;
import Service.PersonaServices;
import java.util.Locale;
import java.util.Scanner;

public class pooEj12PersonaDate {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        /*12.   Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
                (Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
                métodos:
                 Agregar un método de creación del objeto que respete la siguiente firma:
                crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
                usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
                fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
                 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
                en cuenta que para conocer la edad de la persona también se debe conocer la fecha
                actual.
                 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
                edad y retorna true en caso de que el receptor tenga menor edad que la persona que
                se recibe como parámetro, o false en caso contrario.
                 Metodo mostrarPersona(): este método muestra la persona creada en el método
                anterior.   */
        
        PersonaServices sv = new PersonaServices();
        
        System.out.println("Complete los siguientes datos para crear el usuario.");
        Persona persona = sv.crearPersona();
        System.out.println("-> Según la fecha proporcionada, la edad del usuario es " + sv.calcularEdad(persona)+"años");
        System.out.println("");
        
        System.out.println("-> Ingrese una edad a comparar con la del usuario: ");
        int edad = read.nextInt();
        System.out.println("-> El usurio es mayor que la edad proporcionada? " + sv.menorQue(persona, edad));
        System.out.println("");
        
        sv.mostrarPersona(persona);

        // TODO code application logic here
    }//fin main
    
}//fin class
