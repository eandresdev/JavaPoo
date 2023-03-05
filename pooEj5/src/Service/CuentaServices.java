//SERVICES
package Service;

//imports
import Entity.Cuenta;
import java.util.Locale;
import java.util.Scanner;

public class CuentaServices {
    private Scanner read = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n").useLocale(Locale.US);
    
    public Cuenta acceso(){
        
        //instanciar un objeto de tipo Cuenta
        Cuenta cuenta = new Cuenta();
        System.out.print("Ingrese su N° de cuenta:");
        cuenta.setNumeroCuenta(read.nextInt());
        System.out.print("Ingrese su número de DNI:");
        cuenta.setDni(read.nextLong());
        
        System.out.println("ACCESO PERMITIDO");
        System.out.print("Su saldo actual es de $"+cuenta.getSaldoActual());
        
        return cuenta; 
    }
    
    public void ingresarCash(Cuenta cuenta){
        System.out.print("Ingrese el monto que desea depositar: $");
        double cash = read.nextInt();
        int ingreso = 0;
        
        ingreso = cuenta.getSaldoActual();
        ingreso += cash;
        cuenta.setSaldoActual(ingreso);
        
        System.out.print("Su saldo actual es $"+cuenta.getSaldoActual());
    }
    
    public void retirarCash(Cuenta cuenta){
        System.out.print("Ingrese el monto que desea retirar: $");
        double cash = read.nextInt();
        int retiro = 0;
        
        retiro = cuenta.getSaldoActual();
        if (retiro <= 0)
        {
            System.out.println("Usted no posee saldo suficiente para realizar esta operacion");
            System.out.print("Su saldo actual es $"+cuenta.getSaldoActual());
        }else{
            retiro -=cash;
            cuenta.setSaldoActual(retiro);
            System.out.print("Su saldo actual es $"+cuenta.getSaldoActual());
        }
        
    }
    
    public void extraccionRapida(Cuenta cuenta){
        System.out.print("Ingrese el monto que desea retirar: $");
        double extraccion = read.nextInt();
        int montoPermitido = 0;
        int aux = 0;
        
        aux  = cuenta.getSaldoActual();
        montoPermitido = (int) (aux * 0.2);
        
        if (extraccion <= montoPermitido) {
            
            aux -= extraccion;
            System.out.println("Su saldo disponible es de $" + aux);
        }else{
            System.out.println("El monto ingresado excede el limite diario");
        }   
    }
    
    public void consultarSaldo(Cuenta cuenta){
        
        System.out.println("Su saldo disponible es de $" + cuenta.getSaldoActual());
    }
    
    public void consultarDatos(Cuenta cuenta){
        
        System.out.println("Cuenta N°: "+ cuenta.getNumeroCuenta());
        System.out.println("Nombre: Benito Conejo Malo");
        System.out.println("DNI: " + cuenta.getDni());
        System.out.println("Alias: CARRO.GORRA.GATO");
        
    }

    
}//fin class
