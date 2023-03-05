//MAIN
package pooej5;

//imports
import Entity.Cuenta;
import Service.CuentaServices;
import java.util.Locale;
import java.util.Scanner;

public class PooEj5CuentaBancaria {
     
    
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
           /*5. Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
                numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
                Las operaciones asociadas a dicha clase son:
        
                a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
                b) Agregar los métodos getters y setters correspondientes
                c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
                d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
                y se la sumara a saldo actual.
                e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
                la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
                pondrá el saldo actual en 0.
                f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
                usuario no saque más del 20%.
                g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
                h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta  */
        int op;   
        CuentaServices sv = new CuentaServices();
        
        System.out.println("-----------Bienvenido------------");
        System.out.println("Para empezar a operar por favor ingrese a su cuenta personal ");
        Cuenta cuenta = sv.acceso();
        System.out.println(" ");
        
        do
        {
            System.out.println("------------Menu-----------");
            System.out.println("1. Depósito en efectivo");
            System.out.println("2. Retiro de efectivo");
            System.out.println("3. Extracción rápida");
            System.out.println("4. Consulta de saldo");
            System.out.println("5. Datos de la cuenta");
            System.out.println("6. Salir");
            System.out.println("***************************");
            op = read.nextInt();
            System.out.println("---------------------------");
            
            switch (op)
            {
                case 1:
                    sv.ingresarCash(cuenta);
                    System.out.println(" ");
                    break;
                case 2: 
                    sv.retirarCash(cuenta);
                    System.out.println(" ");
                    break;
                case 3:
                    sv.extraccionRapida(cuenta);
                    System.out.println(" ");
                    break;
                case 4: 
                    sv.consultarSaldo(cuenta);
                    System.out.println(" ");
                    break;
                case 5: 
                    sv.consultarDatos(cuenta);
                    System.out.println(" ");
                    break;
                
            }
            
        } while (op != 6);

        // TODO code application logic here
    }//fin metodo main
    
}//fin class
