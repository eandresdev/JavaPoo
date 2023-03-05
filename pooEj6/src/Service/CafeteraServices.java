
package Service;

import Entity.Cafetera;
import java.util.Locale;
import java.util.Scanner;


public class CafeteraServices {
    private static Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    public Cafetera llenarCafetera(){
        //instanciar el objeto cafetera
        Cafetera cafetera = new Cafetera();
        System.out.println("Ingrese la capacidad de su cafetera: ");
        cafetera.setCapacidadMaxima(read.nextInt());
        cafetera.setCapacidadActual(cafetera.getCapacidadMaxima());
        if (cafetera.getCapacidadActual() == 0)
        {
            System.out.println("No puedo llenar su cafetera si no me dice la capacidad.");
        }else{
            System.out.println("Su cafetera ahora esta llena y continene "+cafetera.getCapacidadActual()+" ml de café.");
        }
        
        return cafetera;
    }
    
    public void servirTaza(Cafetera cafetera, int taza){
        
        System.out.println("Dale te sirvo...");
        
        if (cafetera.getCapacidadActual() < taza )
        {    
            System.out.println("No pude llenarte la taza porque solo tenia "+cafetera.getCapacidadActual()+" ml de café, asi que te servi esa cantidad. DISFRUTALO!!");
            cafetera.setCapacidadActual(0);
        }else{
            cafetera.setCapacidadActual(cafetera.getCapacidadActual()-taza);
            System.out.println("Te llene a tope la taza, tienes "+taza+" ml de café servido CUIDADO QUE ESTA CALIENTE!!");
            
        }
    }
    
    public void vaciarCafetera(Cafetera cafetera){
        
        cafetera.setCapacidadActual(0);
        System.out.println("Su cafetera esta vacia");
    
    }
    
    public void agregarCafe(Cafetera cafetera, int cafe){
        if (cafetera.getCapacidadActual() < cafe)
        {
            cafe += cafetera.getCapacidadActual();
            cafetera.setCapacidadActual(cafe);
            
        }else{
            
        }
        
        
        System.out.println("Su cafetera ahora contiene "+cafetera.getCapacidadActual()+" ml de café");
    }
    
}
