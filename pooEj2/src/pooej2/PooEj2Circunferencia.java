// MAIN
package pooej2;

//imports
import Entidades.Circunferencia;
import Servicio.CircunferenciaServicio;


public class PooEj2Circunferencia {

    public static void main(String[] args) {
        /*
        2. Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
            tipo real. A continuación, se deben crear los siguientes métodos:
            a) Método constructor que inicialice el radio pasado como parámetro. OK
            b) Métodos get y set para el atributo radio de la clase Circunferencia. OK
            c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
            objeto.OK
            d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
            e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
        */
        
        
        // instancio el objeto a traves de serivicio 
        CircunferenciaServicio sv = new CircunferenciaServicio();
        
        //llamado de metodos a traves del servicio
        Circunferencia circulo = sv.crearCircunferencia();
        
        sv.area(circulo);
        sv.perimetro(circulo);
    } //fin main
    
} //fin clase
