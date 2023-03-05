// CLASE CIRCUNFERENCIA 
package Entidades;


public class Circunferencia {
    
    //atributos
    private double radio;
    
    //constructor vacio
    public Circunferencia() {
        
    }
    
    //constructor por parametro
    public Circunferencia(double radio) {
        this.radio = radio;
    }
    
    //getters and setters
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    //to String
    @Override
    public String toString() {
        return "Circunferencia{" + "radio=" + radio + '}';
    }
    
    
    
    
}
