//CLASE MASCOTA
package mascotaapp.entidades;


public class Mascota {
    /*Cambiando el denominador de public a private lo estamos encapsulando para que no se pueda usar desde cualquier lugar solo desde la clase propia*/
    private String nombre;
    private String apodo;
    // Conejo, Gato, Perro, Loro.
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    private int energia;
    
    // contructor vacio
    public Mascota() {
        energia = 1000;
    }
    
    // constructor con algunos atributos del obejto mascota
    public Mascota(String nombre, String apodo, String tipo) {
        /*OJO: dentro de los constructores podmeos escribir logica tambien. EJ: */
        this.nombre = nombre;
        this.apodo = apodo;
        if (tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Loro") || tipo.equals("Conejo") || tipo.equals("Carpincho") ) {
            this.tipo = tipo;
            
        }
        
        energia = 1000;
    }
    
    // contructor lleno (Todos los atributos del objeto)
    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        
        energia = 1000;
    }
    
    
    // Aqui inician los set
    /*A traves del set podemos modificar los atributos y/o valores de un objeto*/
    public void setNombre(String nombre){
        /*Aqui tambien podemos integrar logica*/
        if (nombre.length() > 0) {// si el nombre viene vacio no lo recibe 
            this.nombre = nombre;
            
        }
    
    }
    
    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    // Aqui inician los get 
    /*a traves de get podemos entrar a la clase obtener los atributos y/o valores que necesitamos e irnos de un objeto*/
    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }
    
    //metodos de operacion
    /**
     * Funcion para restar energia
     * 
     * @param energiaRestar
     * @return energia
     */
    public int pasear(int energiaRestar){
        
        energia -= energiaRestar;
        
        return energia;
    
    }
    
    /**
     * Funcion para restar energia por vueltas
     * 
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    public int pasear(int energiaRestar, int vueltas){
        
        for (int i = 0; i < vueltas; i++) {//este para ao for va a ir retando energia en cada giro dle bucle mientras hasta llegar a la cantidad de vueltas

            energia -= energiaRestar;

        }
         
        return energia;
    
    }
    
    
    // Aqui inician los toString
    /*toString nos va a crear una funcion que nos devuelve un mensaje formateado o armado según cada mascota*/
    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }
    
}
