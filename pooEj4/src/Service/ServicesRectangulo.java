
package Service;

//imports y librerias para interactuar
import Entity.Rectangulo;
import java.util.Locale;

import java.util.Scanner;


public class ServicesRectangulo {
    //declaro Scanner de forma global
    Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    public Rectangulo crearRectangulo(){ //instancia objeto a traves del metodo
        System.out.println("A continuacion ingrese los valores correspondientes para su rectangulo.");
        System.out.print("Ingrese la base: ");
        int base = read.nextInt();
        System.out.print("Ingrese la altura: ");
        int altura = read.nextInt();
        
        return new Rectangulo(base, altura);
    }
    
    public int calcularSuperficie(Rectangulo rectangulo){
        int superficie = rectangulo.getBase() * rectangulo.getAltura();
    
        return superficie;
    }
    
    public int calcularPerimetro(Rectangulo rectangulo){
        int perimetro = (rectangulo.getBase() + rectangulo.getAltura()) * 2;
        
        return perimetro;
    }
    
    public void dibujarRectangulo(Rectangulo rectangulo){
        for (int fila = 0; fila < rectangulo.getBase(); fila++) {
            for (int columna = 0; columna < rectangulo.getAltura(); columna++) {
                if ((fila == 0 || fila == rectangulo.getBase()-1) || (columna == 0 ||  columna == rectangulo.getAltura()-1)) {
                    System.out.print("* ");
                
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    
}//fin class
