import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public abstract class Articulos {
    //atributos
    private String nombre;
    private String modelo;
    private String descripcion;
    private int precio;

    //constructor
    public Articulos(String nombre, String modelo, String descripcion, int precio) {
        this.nombre = nombre;
        this.modelo = modelo;
        this.descripcion = descripcion;
        this.precio = precio;
    }

    //getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    //metodos
    public abstract int obtenerPrecio();
    public abstract String obtenerDescripcion();

    public void mostrarArticulos(){
        System.out.println(getNombre());
        System.out.println(getModelo());
        System.out.println(getDescripcion());
        System.out.println(getPrecio());
    }
}
