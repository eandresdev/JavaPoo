//archivo principal (PRIMERO EN EJECUTARSE)

package mascotaapp;

// clase y librerias para interactuar
import java.util.*;
import mascotaapp.entidades.Mascota;
import mascotaapp.entidades.Usuario;
import mascotaapp.servicios.ServicioMascota;


public class MascotaApp {

    public static void main(String[] args) {
        
        ServicioMascota sm = new ServicioMascota();
        
        Mascota m1 = sm.crearMascota();
        
        // visualizacion de los que seria el toString por pantalla o consola.
        System.out.println(m1);
       
 
    }
    
}
