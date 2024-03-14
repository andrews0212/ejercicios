package Cuenta;

public class Titular {
    private String nombre;
    private String apellido;
    private String numeroIdentificacion;
    private int edad;

    public Titular(String nombre, String apellido, String numeroIdentificacion, int edad){
        this.nombre = nombre;
        this.apellido = apellido;
        this.numeroIdentificacion = numeroIdentificacion;
        this.edad = edad;
    }

    /* getter */
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public int getEdad() {
        return edad;
    }
    // setter
    public void setEdad(int edad){
        this.edad = edad;
    }

    public String toString(){
        return String.format(" Nombre: %s \n Apellido: %s \n Numero de identificacion: %s \n Edad: %s",getNombre(),getApellido(),getNumeroIdentificacion(),getEdad());
    }

}
