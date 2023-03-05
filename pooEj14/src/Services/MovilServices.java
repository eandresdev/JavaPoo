package Services;

import Entity.Movil;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class MovilServices {

    private Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    public int[] ingresarCodigo() {
        int[] codigo = new int[7];

        for (int i = 0; i < 7; i++)
        {
            codigo[i] = read.nextInt();
        }
        return codigo;
    }

    public void mostrarCodigo(Movil movil) {
        for (int i = 0; i < 7; i++)
        {
            System.out.print(movil.getCodigo());
        }
    }

    public Movil cargarCelular(int cantidad) {
        Movil movil = new Movil(); // instanciacion del objeto

        for (int i = 0; i < cantidad; i++)
        {
            System.out.println("Complete los siguientes datos para cargar el articulo.");

            System.out.print("Marca: ");
            movil.setMarca(read.next());
            System.out.print("Precio: $");
            movil.setPrecio(read.nextInt());
            System.out.print("Modelo: ");
            movil.setModelo(read.next());
            System.out.print("Memoria Ram: ");
            movil.setMemoriaRam(read.nextDouble());
            System.out.print("Almacenamiento: ");
            movil.setAlmacenamiento(read.nextDouble());
            System.out.println("Código: ");
            movil.setCodigo(ingresarCodigo());
        }

        return movil;
    }

    public void mostarMovil(Movil movil, int cantidad) {
        for (int i = 0; i < cantidad; i++)
        {
            System.out.println("---- Movil " + (i + 1) + " ----");
            System.out.println("Marca: " + movil.getMarca());
            System.out.println("Precio: $" + movil.getPrecio());
            System.out.println("Modelo: " + movil.getModelo());
            System.out.println("Memoria Ram: " + movil.getMemoriaRam() + " GB");
            System.out.println("Almacenamiento: " + movil.getAlmacenamiento() + " GB");
            System.out.println("Código: N°" + Arrays.toString(movil.getCodigo()));
        }
        System.out.println("-----------------------------");
    }
}
