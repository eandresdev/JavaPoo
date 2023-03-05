package pooej8;

import Entity.Cadena;
import Services.CadenaService;
import java.util.Locale;
import java.util.Scanner;

public class PooEj8Cadena {
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        /* 8.   Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
                String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
                una frase que puede ser una palabra o varias palabras separadas por un espacio en
                blanco y a través de los métodos set, se guardará la frase y la longitud de manera
                automática según la longitud de la frase ingresada. Deberá además implementar los
                siguientes métodos:
                a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
                frase ingresada.
                b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
                ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
                c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
                contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
                d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
                e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
                compone la clase con otra nueva frase ingresada por el usuario.
                f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
                con una nueva frase ingresada por el usuario y mostrar la frase resultante.
                g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
                encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
                la frase resultante.
                h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
                ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
        
        
        
        CadenaService sv = new CadenaService();
        Cadena cadena = sv.ingresoFrase();
        
        sv.mostrarVocales(cadena);
        sv.invertirFrase(cadena);
        System.out.println("Ingrese un letra para saber cuantas veces se repitio : ");
        String letra = read.next();
        sv.vecesRepetido(cadena, letra);
        System.out.println("Ingrese una nueva cadena para comparar su longitudes: ");
        String newCadena = read.next();
        sv.compararLongitud(cadena, newCadena);
        System.out.println("Ingrese una nueva cadena que para unirla a la cadena original: ");
        newCadena =  read.next();
        sv.unirFrases(cadena, newCadena);
        System.out.println("Ingrese un caracter para reemplazar las letras 'A' en su cadena original:");
        String modificar = read.next();
        sv.reemplazar(cadena, modificar);
        System.out.println("");
        System.out.println("Ingrese una letra cualquiera y el sistema le dira si existe o no dentro de la cadena original: ");
        letra = read.next();
        if (sv.contiene(cadena, letra) == true)
        {
            System.out.println("La letra solicitada SI pertenece a la cadena original");
        }else{
            System.out.println("La letra solicitada NO pertenece a la cadena original");
            
        }
        // TODO code application logic here
    }//fin main
    
}//fin class
