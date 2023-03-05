/*Este archivo contiene la clase o molde del objeto y las propiedades o atributos que lo componen  */
package Entity;

public class Mascota {
    //atributos o propiedades de nuestro molde mascota
 //modificador: private, tipo: Sting, nombreAtributo: nombre ;
    private String nombre; 
    private String tipo;
    private String color;
    private String sonido;
    private int edad;
    
    // constructores vacio y por paraetros

    public Mascota() {//vacio
    }

    public Mascota(String nombre, String tipo, String color, String sonido, int edad) { //por parametros
        this.nombre = nombre;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.sonido = sonido;
    }
    
    
    //getters y setters
    /*
    -getter nos muestra el atributo tomado
    -setter accede al atributo tomado y permite modificarlo
    */

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public String getSonido() {
        return sonido;
    }
    
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    //toString
    /*El metodo toString() nos va a retornar todos los atributos como cadena de forma que podamos verlo en consola
    al mostrar al objeto por pantalla, si no se declara el metodo toString() lo que veriamos en consola seria una 
    especie de codigo acompañado de un @ y numeros.  */
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + '}';
    }
    
}