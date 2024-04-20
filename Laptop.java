import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Laptop extends Articulos{
    //atributos
    private int ram;
    private String os;

    //constructor
    public Laptop(String nombre, String modelo, String descripcion, int precio, int ram, String os) {
        super(nombre, modelo, descripcion, precio);
        this.ram = ram;
        this.os = os;
    }

    //getters y setters
    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    //metodos
    @Override
    public int obtenerPrecio() {
        return getPrecio();
    }

    @Override
    public String obtenerDescripcion() {
        return getDescripcion();
    }
}
