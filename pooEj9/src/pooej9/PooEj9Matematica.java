// METODO STATIC Y CLASE MATH

package pooej9;

import Entity.Matematica;
import Serivices.MatematicaService;
import java.util.Locale;
import java.util.Scanner;

public class PooEj9Matematica {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        /*9.    Realizar una clase llamada Matemática que tenga como atributos dos números reales con
                los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
                constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
                Math.random para generar los dos números y se guardaran en el objeto con su
                respectivos set. Deberá además implementar los siguientes métodos:

                a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
                b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
                elevado al menor número. Previamente se deben redondear ambos valores.
                c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
                Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número. */
        MatematicaService sv = new MatematicaService();
        Matematica mates = new Matematica();
        
        mates.setNum1((int) (Math.random() * 20 + 1));
        mates.setNum2((int) (Math.random() * 20 + 1));
        System.out.println("Primer valor:" + mates.getNum1());
        System.out.println("Segundo valor:" + mates.getNum2());
        
        System.out.println("El mayor de los dos valores fue el " + sv.devolverMayor(mates));
        sv.calcularPotencia(mates);
        sv.calculaRaiz(mates);

        // TODO code application logic here
    }//fin main
    
}//fin class
