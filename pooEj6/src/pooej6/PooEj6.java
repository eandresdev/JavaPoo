//MAIN
package pooej6;

import Entity.Cafetera;
import Service.CafeteraServices;
import java.util.Locale;
import java.util.Scanner;

public class PooEj6 {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        /*6. Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
                (la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
                cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
                métodos:
                 Constructor predeterminado o vacío
                 Constructor con la capacidad máxima y la cantidad actual

                 Métodos getters y setters.
                 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
                máxima.
                 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
                tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
                cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
                método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
                cuanto quedó la taza.
                 Método vaciarCafetera(): pone la cantidad de café actual en cero.
                 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
                recibe y se añade a la cafetera la cantidad de café indicada. */
        String respuesta;

        do
        {
            CafeteraServices sv = new CafeteraServices();
            Cafetera cafetera = sv.llenarCafetera();

            if (cafetera.getCapacidadActual() == 0)
            {

                break;
            } else
            {
                System.out.println("Quieres tomar café?");
                respuesta = read.next();
                
                if (respuesta.equalsIgnoreCase("s"))
                {
                    System.out.println("Qué capacidad tiene la taza en la que se quiere servir? ");
                    int taza = read.nextInt();
                    sv.servirTaza(cafetera, taza);

                    System.out.println("Quiere agregar más café a la cafetera?");
                    respuesta = read.next();
                    
                    if (respuesta.equalsIgnoreCase("s"))
                    {
                        System.out.println("Qué cantidad de café le pondra?");
                        int cafe = read.nextInt();
                        sv.agregarCafe(cafetera, cafe);

                    } else
                    {
                        System.out.println("ok, no hay problema, vuelva cuando guste un cafecito.");
                        break;
                    }
                } else
                {
                    System.out.println("ok, no hay problema. ");
                    break;
                }
            }
            
            System.out.println("Quiere vaciar la cafetera?");
                        respuesta = read.next();
                        if (respuesta.equalsIgnoreCase("s"))
                        {
                            sv.vaciarCafetera(cafetera);
                        } else
                        {
                            System.out.println("ok, no hay problema. ");
                            break;
                        }

        } while ("n".equals(respuesta));

        // TODO code application logic here
    }//fin void 
}//fin class
