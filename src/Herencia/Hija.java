package Herencia;

// En java no existe herencia multiple

public class Hija extends Madre {

    private String nombre;
    private int edad;

    public Hija(String nombreMadre, String nombre, int edad) {
        super(nombreMadre);
        setEdad(edad);
        setNombre(nombre);
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getNombreMadre() {
        return super.getNombre();
    }

    public int getEdad() {
        return this.edad;
    }
}
