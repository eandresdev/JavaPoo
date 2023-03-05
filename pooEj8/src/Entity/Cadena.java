
package Entity;


public class Cadena {
    //atributos
    private String frase;
    private int longitud;

    //constructor por defecto y por parametros
    public Cadena() {
    }

    //getters y setters
    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    //toString
    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longitud=" + longitud + '}';
    }
    
    
}
