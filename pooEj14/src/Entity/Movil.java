package Entity;

public class Movil {

    //atributos
    private String marca;
    private int precio;
    private String modelo;
    private double memoriaRam;
    private double almacenamiento;
    private int[] codigo;

    //constructor por defecto & por parametros
    public Movil() {
    }

    public Movil(String marca, int precio, String modelo, double memoriaRam, double almacenamiento, int[] codigo) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRam = memoriaRam;
        this.almacenamiento = almacenamiento;
        this.codigo = codigo;
    }

    //getters & setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getMemoriaRam() {
        return memoriaRam;
    }

    public void setMemoriaRam(double memoriaRam) {
        this.memoriaRam = memoriaRam;
    }

    public double getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(double almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    //toString
    @Override
    public String toString() {
        return "Movil{" + "marca=" + marca + ", precio=" + precio + ", modelo=" + modelo + ", memoriaRam=" + memoriaRam + ", almacenamiento=" + almacenamiento + ", codigo=" + codigo + '}';
    }

}
