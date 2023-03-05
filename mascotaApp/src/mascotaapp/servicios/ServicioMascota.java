
package mascotaapp.servicios;

import java.util.Scanner;
import mascotaapp.entidades.Mascota;


public class ServicioMascota {
    
    private Scanner scan = new Scanner(System.in).useDelimiter("\n");
    
    public Mascota crearMascota(){
    
        System.out.println("Ingrese el nombre de su mascota: ");
        String nombre = scan.next();
        
        System.out.println("Ingrese el apodo de su mascota: ");
        String apodo = scan.next();
        
        System.out.println("Ingrese el tipo de su mascota: ");
        String tipo = scan.next();
        
        return  new Mascota(nombre,apodo,tipo);
    }
    
}
