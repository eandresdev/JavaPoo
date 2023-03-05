
package Entity;


public class Persona {
    //atributos
    private String nombre;
    private int edad;
    private String genero;
    private float peso;
    private float altura;
    private int imc;
    
    //constructores  vacio y por parametros
    public Persona() {
        
    }
    
    public Persona(String nombre, int edad, String genero, float peso, float altura, int imc) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.peso = peso;
        this.altura = altura;
        this.imc = imc;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }
    
    public int getImc () {
        return imc;
    }
    
    public void setImc(int imc) {
        this.imc = imc; 
    }
    
    //toString
    @Override
    public String toString() {
        return "Personas{" + "nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", peso=" + peso + ", altura=" + altura + ", imc =" + imc+'}';
    }
    
}
