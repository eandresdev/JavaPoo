//SERVICIOS
package Services;

import Entity.Operacion;
import java.util.Locale;
import java.util.Scanner;

public class OperacionServicio {
    //inicializo Scanner de forma global
    Scanner leer = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    Operacion operacion1 = new Operacion();
    public Operacion crearOperacion(){
        System.out.print("Ingresa el primer número:");
        int num1 =leer.nextInt();
        System.out.print("Ingresa el segundo número:");
        int num2 =leer.nextInt();
        
        return new Operacion(num1,num2);
    }
    
    
    public int sumar(Operacion num1, Operacion num2){
        int resultado = num1.getNum1() + num2.getNum2();
        
        return resultado;
    
    }
    
    public int restar(Operacion num1, Operacion num2){
        int resultado = num1.getNum1() + num2.getNum2();
        
        return resultado;
    
    }
    
    public int multiplicar(Operacion num1, Operacion num2){
        int resultado;
        
        if(num1.equals(0) || num2.equals(0)){
            System.out.println("Al menos uno de los números ingresado es igual a cero por tanto el resultado es ");
         return 0;
        }else{
            resultado = num1.getNum1()*num2.getNum2();
        }
       
        return resultado;
        
    }
    
    public double dividir(Operacion num1, Operacion num2){
       double resultado = 0;
    
        if(num1.equals(0) || num2.equals(0)){
           System.out.println("Al menos uno de los números ingresado es igual a cero por tanto el resultado es ");

        }else{
           resultado = num1.getNum1() / num2.getNum2();
        }
    
        return resultado;
    }
    
}
