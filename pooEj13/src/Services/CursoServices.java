package Services;

import Entity.Curso;
import java.util.Locale;
import java.util.Scanner;

public class CursoServices {

    private Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    public String[] cargarCurso() {
        String[] alumnos = new String[5];

        for (int i = 0; i < 5; i++)
        {
            System.out.println("Alumno "+(i+1));
            alumnos[i] = read.next();
        }

        return alumnos;
    }

    public Curso crearCurso() {

        Curso curso = new Curso();

        System.out.print("Ingrese el nombre del curso: ");
        curso.setNombreCurso(read.next());
        System.out.print("Ingrese la cantidad de horas por día: ");
        curso.setCantidadHorasPorDia(read.nextInt());
        System.out.print("Ingrese la cantidad de dias por semana: ");
        curso.setCantidadDiasPorSemana(read.nextInt());
        System.out.println("Ingrese el turno del curso: (Mañana/Tarde)");
        curso.setTurno(read.next());
        System.out.print("Ingrese el costo por hora: $");
        curso.setPrecioPorHora(read.nextInt());
        System.out.println("Ingrese los nombres de sus alumnos: ");
        curso.setAlumnos(cargarCurso());

        return curso;
    }

    public void calcularGananciaSemanal(Curso curso) {
        int totalSemanal = (int) (((curso.getPrecioPorHora() * curso.getCantidadHorasPorDia()) * curso.getCantidadDiasPorSemana()) * 5);

        System.out.println("El total por semana es de $" + totalSemanal);
    }
    
}
