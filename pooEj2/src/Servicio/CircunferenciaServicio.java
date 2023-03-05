//SERVICIOS  
package Servicio;
//imports + librerias
import Entidades.Circunferencia;
import static java.lang.Math.PI;
import java.util.Locale;
import java.util.Scanner;

public class CircunferenciaServicio {
    //inicializo Scanner de forma global
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    public Circunferencia crearCircunferencia() {
        
        //se piden datos para llenar atributos
        System.out.println("Por favor ingrese el radio del circulo con el que desea trabajar: ");
        double radio = leer.nextDouble(); 
 
        return new Circunferencia(radio);
        
    }
    
   public void area(Circunferencia radio){
       double area = PI *(radio.getRadio()*2);
       
       System.out.println("El Area del circulo es: "+area);
   
   }
    
   public void perimetro(Circunferencia radio){
       double perimetro = 2 * PI * radio.getRadio();
       
       System.out.println("El Perimetro del circulo es : "+perimetro);
   }
}
