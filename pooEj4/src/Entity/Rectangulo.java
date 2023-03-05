
package Entity;


public class Rectangulo {
    //atributos
    private int base;
    private int altura;
    
    //contructores  vacio y por parametros

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    //getters y setters

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    //toString

    @Override
    public String toString() {
        return "Rectangulo{" + "base=" + base + ", altura=" + altura + '}';
    }
    
    
}
