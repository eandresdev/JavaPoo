package pooej14;

import Entity.Movil;
import Services.MovilServices;
import java.util.Locale;
import java.util.Scanner;

public class PooEj14 {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        /*14.   Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
                posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
                almacenar cada producto con su información. Crear una entidad Movil con los atributos
                marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
                un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
                correspondiente al código. A continuación, se implementarán los siguientes métodos:
                 Un constructor por defecto.
                 Un constructor con todos los atributos como parámetro.
                 Métodos getters y setters de cada atributo.
                 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
                instanciar un objeto Celular y poder cargarlo en nuestro programa.
                 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
                números de un celular. Para ello, puede utilizarse un bucle repetitivo.  */
        MovilServices sv = new MovilServices();
        
        System.out.print("Ingrese la cantidad de articulos a cargar: ");
        int cantidad = read.nextInt();
        
        Movil movil = sv.cargarCelular(cantidad);
        
        System.out.println("------------------------");
        sv.mostarMovil(movil, cantidad);

        // TODO code application logic here
    }//fin main

}//fin class
