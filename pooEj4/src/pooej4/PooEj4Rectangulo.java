//MAIN
package pooej4;


import Entity.Rectangulo;
import Service.ServicesRectangulo;

public class PooEj4Rectangulo {

    public static void main(String[] args) {
        /*4.    Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
                base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
                con los datos del Rectángulo dados por el usuario. También incluirá un método para
                calcular la superficie del rectángulo y un método para calcular el perímetro del
                rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
                asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
                setters y constructores correspondientes.
        
                Superficie = base * altura / Perímetro = (base + altura) * 2.  */
        
        ServicesRectangulo sv = new ServicesRectangulo();
        Rectangulo rectangulo = sv.crearRectangulo();
       
        //llamado de metodos
        sv.calcularSuperficie(rectangulo);
        sv.calcularPerimetro(rectangulo);
        sv.dibujarRectangulo(rectangulo);
        
        
    }//fin main
    
}//fin class
