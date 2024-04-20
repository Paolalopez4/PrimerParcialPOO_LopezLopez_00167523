import java.util.Iterator;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class Telefono extends Articulos{
    //atributos
    private boolean tieneCase;
    private int numTelefono;

    //constructor
    public Telefono(String nombre, String modelo, String descripcion, int precio, boolean tieneCase, int numTelefono) {
        super(nombre, modelo, descripcion, precio);
        this.tieneCase = tieneCase;
        this.numTelefono = numTelefono;
    }

    //getters y setters
    public boolean isTieneCase() {
        return tieneCase;
    }

    public void setTieneCase(boolean tieneCase) {
        this.tieneCase = tieneCase;
    }

    public int getNumTelefono() {
        return numTelefono;
    }

    public void setNumTelefono(int numTelefono) {
        this.numTelefono = numTelefono;
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
