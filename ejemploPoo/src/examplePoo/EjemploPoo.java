/*Main. archivo principal desde aqui se hacen los llmados y se instancan los objetos creados a partir de la clase molde. A demas si tenemos pensado
usar una clase Servicio debemos tener en cuenta que sera el archivo que se encargara de llevar la logica del programa, es decir, que desde
el Main solamente hacemos el llmado a los metodos o funciones que se encargaran de darle vida al objeto instanciado.*/
package examplePoo;

import Entity.Mascota;
import Service.ServicesMascota;


public class EjemploPoo {

    
    public static void main(String[] args) {
        ServicesMascota sv = new ServicesMascota();
        
         /* instancio o creo el objeto a partir del molde Mascota dando uso al constructor vacio, la clase mascota va a permitir
       crea una mascota de culquier tipo.  NombreClase objetoCreado = new constructor() */
        Mascota mascota = new Mascota(); 
        
        
        sv.menuMascota();
        
    }
    
}
