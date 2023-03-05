package Service;

import Entity.Persona;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class PersonaServices {

    private final Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    public Persona crearPersona() {
        Persona persona = new Persona();

        System.out.println("Ingrese su nombre: ");
        persona.setNombre(read.next());

        System.out.println("Ingrese su fecha de nacimiento: ");
        System.out.println("Día: ");
        int dia = read.nextInt();
        System.out.println("Mes: ");
        int mes = read.nextInt() - 1;
        System.out.println("Año: ");
        int anio = read.nextInt() - 1900;
        Date fecha = new Date(anio, mes, dia);
        persona.setfNacimiento(fecha);

        return persona;
    }

    public int calcularEdad(Persona persona) {
        Date hoy = new Date();

        int edadPersona = hoy.getYear() - persona.getfNacimiento().getYear();

        //System.out.println("El usuario tiene "+ edadPersona +" años de edad.");        
        return edadPersona;
    }

    public boolean menorQue(Persona persona, int edad) {
        boolean esMenor;

        esMenor = edad <= calcularEdad(persona);

        return esMenor;
    }

    public void mostrarPersona(Persona persona) {
        int edad = calcularEdad(persona);
        System.out.println("------------DATOS DE USUARIO----------");
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Edad: " + edad+ " años.");
    }

}
