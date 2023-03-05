
package Entity;


public class Matematica {
    
    //atributos
    int num1;
    int num2;
    
    //constructor por defecto y por parametros
    public Matematica() {
    }

    public Matematica(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    //getter y setters
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }
    
    //toString
    @Override
    public String toString() {
        return "Matematica{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    
}
