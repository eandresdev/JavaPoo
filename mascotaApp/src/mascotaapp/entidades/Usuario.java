// CLASE USUARIO
package mascotaapp.entidades;

//se importan libreria
import java.util.Date;

public class Usuario {

    public String nombre;
    public String apellido;
    public int dni;
    public int edad;
    public Date nacimiento;
    public String pais;

    public Usuario() {
     
    }

    public Usuario(String nombre, String apellido, int dni, int edad, Date nacimiento, String pais) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.edad = edad;
        this.nacimiento = nacimiento;
        this.pais = pais;
    }
    
    
}
