package Services;

import Entity.Cadena;
import java.util.Locale;
import java.util.Scanner;

public class CadenaService {

    private static Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);

    public Cadena ingresoFrase() {
        Cadena cadena = new Cadena();

        System.out.println("Ingrese una palabra o frase: ");
        cadena.setFrase(read.next());

        cadena.setLongitud(cadena.getFrase().length());
        System.out.println("Cantidad de caracteres ingresados: " + cadena.getLongitud());
        return cadena;
    }

    public void mostrarVocales(Cadena cadena) {
        int contA = 0, contE = 0, contI = 0, contO = 0, contU = 0;
        for (int i = 0; i < cadena.getLongitud(); i++)
        {
            switch (cadena.getFrase().substring(i, i + 1))
            {
                case "a":
                    contA++;
                    break;
                case "e":
                    contE++;
                    break;
                case "i":
                    contI++;
                    break;
                case "o":
                    contO++;
                    break;
                case "u":
                    contU++;
                    break;
            }

        }

        System.out.println("La frase ingresada tiene " + contA + " veces la vocal A");
        System.out.println("La frase ingresada tiene " + contE + " veces la vocal E");
        System.out.println("La frase ingresada tiene " + contI + " veces la vocal I");
        System.out.println("La frase ingresada tiene " + contO + " veces la vocal O");
        System.out.println("La frase ingresada tiene " + contU + " veces la vocal U");   
    }

    public void invertirFrase(Cadena cadena) {

        String cInv = "";

        for (int i = cadena.getLongitud() - 1; i >= 0; i--)
        {
            cInv += cadena.getFrase().substring(i, i + 1);
        }
        System.out.println("La cadena invertida se ve así: " +"'"+ cInv+"'");

    }

    public void vecesRepetido(Cadena cadena, String letra) {
        int cont = 0;

        for (int i = 0; i < cadena.getLongitud(); i++)
        {
            if (cadena.getFrase().substring(i, i + 1).equalsIgnoreCase(letra))
            {
                cont++;
            }

        }
        System.out.println("La letra " + letra.toUpperCase() + " fue repetida " + cont + " veces.");

    }

    public void compararLongitud(Cadena cadena, String newCadena) {

        if (cadena.getLongitud() == newCadena.length())
        {
            System.out.println("Las dos cadenas tinen la misma cantidad de caracteres");
        } else if (cadena.getLongitud() > newCadena.length())
        {
            System.out.println("La primer cadena tine mayor cantidad de caracteres");
        } else
        {
            System.out.println("La segunda cadena tiene mayor cantidad de caracteres");
        }

    }

    public void unirFrases(Cadena cadena, String newCadena) {
        String fraseConcatenada;

        fraseConcatenada = cadena.getFrase().concat(" " + newCadena);

        System.out.println("La dos frases unidas se ven de la siguiente manera: " + fraseConcatenada);
    }

    public void reemplazar(Cadena cadena, String modificar) {
        String sub = "";
        for (int i = 0; i < cadena.getLongitud(); i++)
        {
            sub = cadena.getFrase().substring(i, i + 1);
            if (sub.equalsIgnoreCase("a"))
            {
                System.out.print(modificar);
            } else
            {
                System.out.print(cadena.getFrase().substring(i, i + 1));
            }

            System.out.print(" ");
        }
    }

    public boolean contiene(Cadena cadena, String letra) {
        
        boolean bandera = false;

        for (int i = 0; i < cadena.getLongitud(); i++)
        {
            if (cadena.getFrase().substring(i, i+1).equalsIgnoreCase(letra))
            {
                bandera = true;
            }
        }
        return bandera;
    }
}
