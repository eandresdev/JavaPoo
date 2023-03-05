
package Services;

import Entity.Persona;
import java.util.Locale;
import java.util.Scanner;

public class PersonaService {
    private static Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
     public Persona crearPersona() {
         Persona persona = new Persona();
         
         System.out.print("Ingrese su nombre: ");
         persona.setNombre(read.next());
         System.out.print("Ingrese su edad: ");
         persona.setEdad(read.nextInt());
         boolean bandera = false;
         do {
             System.out.print("Con qué género se identifica?  Hombre (h), Mujer (m), Otro (o): ");
             persona.setGenero(read.next());
             switch (persona.getGenero())
             {
                 case "h":
                     bandera = true;
                     break;
                case "m":
                     bandera = true;
                     break;
                case "o":
                     bandera = true;
                     break;
                 default:
                     System.out.println("Opción ingresada no existente vuelva, Por favor vuelva a intentarlo.");
             }
             
         } while (bandera == false);
         System.out.print("Ingrese su peso: ");
         persona.setPeso(read.nextFloat());
         System.out.print("Ingrese su altura: ");
         persona.setAltura(read.nextFloat());
         
         return persona;
     }
     
     public int calcularImc(Persona persona){
         
         double calculo = persona.getPeso()/ Math.pow(persona.getAltura(), 2);
         
         
         if (calculo < 20)
         {
             persona.setImc(-1);
             
         }else if (calculo > 20 && calculo <= 25)
         {
             persona.setImc(0); 
             
         }else if (calculo > 25 )
         {
             persona.setImc(1);
             
         }
         
         return persona.getImc();
     }
     
     public boolean esMayorDeEdad(Persona persona){
         
         boolean bandera = persona.getEdad() > 18;
             
         return bandera;
     }
}
