/*Clase Servicio: contiene la parte logica de nuestro programa. metodos y funciones*/
package Service;

import Entity.Mascota;
import java.util.Locale;
import java.util.Scanner;


public class ServicesMascota {
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        Mascota mascota = new Mascota();
    public void datosMscota(){ 
        System.out.println("Ingrese los datos de su mascota: ");
        System.out.print("Nombre: ");
        mascota.setNombre(read.next());
        System.out.print("Edad: ");
        mascota.setEdad(read.nextInt());
        System.out.print("Color: ");
        mascota.setColor(read.next());
        System.out.print("Tipo animal: ");
        mascota.setTipo(read.next());
        
        // bloque que emite el sonido de nuestra mascota en relacion al tipo de animal que asignemos
        switch (mascota.getTipo())
        {// onomatopeya es el sonido que emiten los animales.
            case "perro":
                mascota.setSonido("GUAU GUAU!");
                System.out.println("La onomatopeya de su mascota es " + mascota.getSonido());
                break;
               
            case "gato":
                mascota.setSonido("MIAU MIAU!");
                System.out.println("La onomatopeya de su mascota es " + mascota.getSonido());
                break;
                
            case "gallo":
                mascota.setSonido("kikiriki kikiriki!");
                System.out.println("La onomatopeya de su mascota es " + mascota.getSonido());
                break;
        }
        System.out.println("");
    }
    
    public void menuMascota(){
        int opc;
        do
        {
           System.out.println("-----MENU-----"); 
           System.out.println("1. Agregar mascota"); 
           System.out.println("2. Mostrar mascota"); 
           System.out.println("3. Eliminar mascota"); 
           System.out.println("4. Salir"); 
            System.out.print("Ingrese la opcion: ");opc = read.nextInt();
           
            if (opc == 1) {
                datosMscota();
            }else if (opc == 2){
                System.out.println(mascota.toString());
            }else if(opc == 3){
                System.out.println("Usuario eliminado");
            }
        } while (opc != 4);
            System.out.println("Salió del programa");
        
    }
}