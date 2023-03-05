// CLASE ARRAYS

package pooej10;

import java.util.Arrays;

public class PooEj10Arrays {

    public static void main(String[] args) {
        /*10.   Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo A
                de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
                programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por pantalla.
                Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros 10 números
                ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos elementos con el valor
                0.5. Mostrar los dos arreglos resultantes: el ordenado de 50 elementos y el combinado de
                20.  */
        double[] a = new double[50];
        double[] b = new double[20];

        //llamado de funciones
        llenarA(a);
        ordenarA(a);
        llenarB(a, b);

        mostrarA(a);
        mostrarB(b);
        // TODO code application logic here
    }// fin main

    /*---------------FUNCION LLENAR ARRAY A----------------*/
    public static void llenarA(double[] a) {
        for (int i = 0; i < 50; i++)
        {
            a[i] = (Math.random() * 20 + 1);

        }
        /*relleno el arreglo con números aleatorios*/
    }

    /*-------------------FUNCION MOSTRAR A-----------------*/
    public static void mostrarA(double[] a) {
        System.out.println("Array A: ");

        /*
        for (int i = 0; i < 50; i++)
        {
            System.out.print(a[i]);
            System.out.println(" ");
        } 
         */
        System.out.println(Arrays.toString(a));

        /*Arrays.toString() Este método imprime el arreglo como una cadena, la cadena
        consiste en una lista de los elementos del arreglo encerrados
        entre corchetes ("[]"). Los elementos adyacentes están
        separados por comas (",").*/
    }

    /*-------------------FUNCION ORDENAR A ------------------*/
    public static void ordenarA(double[] a) {

        Arrays.sort(a);
        //System.out.println(Arrays.toString(a));

        /*Arrays.sort() Este método sirve para ordenar un arreglo de manera
            ascendente. A este método también le podemos decir desde
            y hasta que índice queremos que ordene.*/
    }

    /*------------------ FUNCION LLENAR B ----------------*/
    public static void llenarB(double[] a, double[] b) {

        System.arraycopy(a, 0, b, 0, 10);
        /*Método que copia desde la posición origen de un array 
        a un array destino en una posición específica. El número
        de elementos copiados también se identifica como parámetro.*/

        Arrays.fill(b, 10, 20, 0.5);
        /*se puede usar con cualquier tipo de dato y le podemos decir
        desde y hasta que índice queremos que llene con ese valor.*/
    }

    /*---------------- FUNCION MOSTRAR B ------------------*/
    public static void mostrarB(double[] b) {

        System.out.println("Arrays B:");

        System.out.println(Arrays.toString(b));
    }

}// fin class
