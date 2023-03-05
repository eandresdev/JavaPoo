//MAIN
package pooej3;

//imports + librerias
import Entity.Operacion;
import Services.OperacionServicio;


public class PooEj3Operaciones {
    public static void main(String[] args) {
        /*
        3. Crear una clase llamada Operacion que tenga como atributos privados numero1 y
        numero2. A continuación, se deben crear los siguientes métodos:
        a) Método constructor con todos los atributos pasados por parámetro.
        b) Metodo constructor sin los atributos pasados por parámetro.
        c) Métodos get y set.
        d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
        en los atributos del objeto.
        e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
        f) Método restar(): calcular la resta de los números y devolver el resultado al main
        g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
        fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
        Si no, se hace la multiplicación y se devuelve el resultado al main
        h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
        una división por cero, el método devuelve 0 y se le informa al usuario el error se le
        informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
        */
        
        OperacionServicio sv = new OperacionServicio(); // instanciacion del obejto
        
        Operacion operacion1 = sv.crearOperacion(); // interaccion con el obejto a traves de la clase servicio
        
        System.out.println("El resultado al SUMAR los dos números es "+ sv.sumar(operacion1, operacion1));
        System.out.println("El resultado al RESTARLOS fue: "+ sv.restar(operacion1, operacion1));
        System.out.println("El resultado al MULTIPLICARLOS fue: "+ sv.multiplicar(operacion1, operacion1));
        System.out.println("El resultado al DIVIDIRLOS fue: "+ sv.dividir(operacion1, operacion1));
        
    }//fin main
    
}//fin class
