//MAIN
package pooejej7;

import Entity.Persona;
import Services.PersonaService;
import java.util.Locale;
import java.util.Scanner;


public class PooEjej7Imc {

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
        /* 7.   Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
                sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
                atributo, puede hacerlo. Los métodos que se implementarán son:
                 Un constructor por defecto.
                 Un constructor con todos los atributos como parámetro.
                 Métodos getters y setters de cada atributo.
                 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
                al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
                Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
                O. Si no es correcto se deberá mostrar un mensaje
                 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
                kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
                significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
                Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
                persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
                de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
                función devuelve un 1.
                 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
                devuelve un booleano.
                A continuación, en la clase main hacer lo siguiente:
                Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
                los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
                tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
                persona es mayor de edad.
                Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
                distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

                cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
                también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores. */
        int contG = 0;
        int contM = 0;
        int contF = 0;
        int contMayor = 0;
        int contMenor = 0;
        
        PersonaService sv = new PersonaService();
        
        System.out.println("******** Usuario 1 ********");
        Persona persona1 = sv.crearPersona();
        sv.calcularImc(persona1);
        
        
        if (persona1.getImc() == -1)
        {   
            System.out.println("Usted se encuentra por debajo de su peso ideal.");
            contF ++;
        }else if (persona1.getImc() == 0)
        {   
            System.out.println("Usted se encuentra dentro de su rango de peso.");
            contM ++;
        }else if (persona1.getImc() == 1)
        {   
            System.out.println("Usted presenta un peso por encima de lo ideal.");
            contG ++;
        }
        
        if (persona1.getEdad() < 18)
        {   sv.esMayorDeEdad(persona1);
            System.out.println("Usted no es mayor de edad. ");
            contMenor ++;
        }else{
            sv.esMayorDeEdad(persona1);
            System.out.println("Usted es mayor de edad. ");
            contMayor ++;
        }
        
        System.out.println("******** Usuario 2 ********");
        Persona persona2 = sv.crearPersona();
        sv.calcularImc(persona2);
        
        
        if (persona2.getImc() == -1)
        {   
            System.out.println("Usted se encuntra por debajo de su peso ideal.");
            contF ++;
        }else if (persona2.getImc() == 0)
        {   
            System.out.println("Usted se encuntra dentro de su rango de peso.");
            contM ++;
        }else if (persona2.getImc() == 1)
        {   
            System.out.println("Usted presenta un peso por encima de lo ideal.");
            contG ++;
        }
        
        if (persona2.getEdad() < 18)
        {   sv.esMayorDeEdad(persona2);
            System.out.println("Usted no es mayor de edad. ");
            contMenor ++;
        }else{
            sv.esMayorDeEdad(persona2);
            System.out.println("Usted es mayor de edad. ");
            contMayor ++;
        }
        System.out.println("******** Usuario 3 ********");
        Persona persona3 = sv.crearPersona();
        sv.calcularImc(persona3);
        
        
        if (persona3.getImc() == -1)
        {   
            System.out.println("Usted se encuntra por debajo de su peso ideal.");
            contF ++;
        }else if (persona3.getImc() == 0)
        {   
            System.out.println("Usted se encuntra dentro de su rango de peso.");
            contM ++;
        }else if (persona3.getImc() == 1)
        {   
            System.out.println("Usted presenta un peso por encima de lo ideal.");
            contG ++;
        }
        
        if (persona3.getEdad() < 18)
        {   sv.esMayorDeEdad(persona3);
            System.out.println("Usted no es mayor de edad. ");
            contMenor ++;
        }else{
            sv.esMayorDeEdad(persona3);
            System.out.println("Usted es mayor de edad. ");
            contMayor ++;
        }
        System.out.println("******** Usuario 4 ********");
        Persona persona4 = sv.crearPersona();
        sv.calcularImc(persona4);
        
        
        if (persona4.getImc() == -1)
        {   
            System.out.println("Usted se encuntra por debajo de su peso ideal.");
            contF ++;
        }else if (persona4.getImc() == 0)
        {   
            System.out.println("Usted se encuntra dentro de su rango de peso.");
            contM ++;
        }else if (persona4.getImc() == 1)
        {   
            System.out.println("Usted presenta un peso por encima de lo ideal.");
            contG ++;
        }
        
        if (persona4.getEdad() < 18)
        {   sv.esMayorDeEdad(persona4);
            System.out.println("Usted no es mayor de edad. ");
            contMenor ++;
        }else{
            sv.esMayorDeEdad(persona4);
            System.out.println("Usted es mayor de edad. ");
            contMayor ++;
        }
        
        System.out.println("---------------------REPORTE-----------------");
        
        System.out.println(((contF*100)/4)+ "% están por debajo de su peso ideal.");
        System.out.println(((contM*100)/4)+ "% están dentro de su rango de peso ideal.");
        System.out.println(((contG*100)/4)+ "% presentan sobrepeso.");
        
        System.out.println(((contMayor*100)/4)+ "% son mayores de edad");
        System.out.println(((contMenor*100)/4)+ "% son menores de edad");
        
        // TODO code application logic here
    }//fin main
    
}//fin class
