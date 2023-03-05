package Serivices;

import Entity.Matematica;
import java.util.Locale;
import java.util.Scanner;

public class MatematicaService {

    private static Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    public int devolverMayor(Matematica mates) {
        int n1 = mates.getNum1();
        int n2 = mates.getNum2();

        int mayor = Math.max(n2, n1);

        return mayor;

    }

    public void calcularPotencia(Matematica mates) {
        int n1 = Math.round(mates.getNum1());
        int n2 = Math.round(mates.getNum2());
        double n = 0;

        if (n1 > n2)
        {
            n = Math.pow(n1, n2);
            System.out.println("El primer valor elevado a la potencia del segundo da como resultado: " + n);
        } else
        {
            n = Math.pow(n2, n1);
            System.out.println("El segundo valor elevado a la potencia del primer da como resultado: " + n);
        }
    }

    public void calculaRaiz(Matematica mates) {
        int n1 = Math.abs(mates.getNum1());
        int n2 = Math.abs(mates.getNum2());
        double n = 0;

        if (n1 < n2)
        {
            n = Math.sqrt(n1);
            System.out.println("La raiz cuadrada de "+ n1 +" es:"+ n);
        } else
        {
            n = Math.sqrt(n2);
            System.out.println("La raiz cuadrada de "+ n2 +" es:"+ n);
        }

    }

}
