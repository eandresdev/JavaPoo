// CLASE DATE
package pooej11;

import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class PooEj11Date {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        /*11.   Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
                clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
                Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
                usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
                deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
                se puede conseguir instanciando un objeto Date con constructor vacío.
        
                Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
                Ejemplo fecha actual: Date fechaActual = new Date(); 
         */

        System.out.println("Ingrese dia: ");
        int dia = read.nextInt();
        System.out.println("Ingrese mes: ");
        int mes = read.nextInt()-1;// este es el mes, empieza en 0 ej:el mes  5 seria el sexto mes, en este caso Junio. Por eso lo inicializo en -1
        System.out.println("Ingrese año: ");
        int anio = read.nextInt()-1900; // Esto es el año, tenemos que tener en cuenta que inicialmente empieza en 1900. Por eso lo inicializo en -1900

        Date fecha = new Date(anio, mes, dia);
        Date fechaActual = new Date();
        
        int diferencia = fechaActual.getYear() - fecha.getYear() ;// el metodo get nos retorna en este caso el año.
        
        System.out.println("La fecha ingresada por el usuario fue: " + fecha.toString());
        System.out.println("La fecha de hoy es: " + fechaActual);
        
        System.out.println("La diferencia de años entre estas dos fechas es de: " + diferencia);
        // TODO code application logic here
    }//fin main

}//fin class
