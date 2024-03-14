package Agenda;

public class Amigo implements Comparable<Amigo>,Cloneable {
    private String nombre;
    private String apellido;
    private Integer telefono;
    private String correoElectronico;

    public Amigo(String nombre, int telefono){
       this.nombre = nombre;
       this.telefono = telefono;
       this.apellido = null;
       this.correoElectronico = null;
    }
    public Amigo(String nombre, String apellido, int telefono, String correoElectronico){
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }
    public Amigo(Amigo amigo){
        this.nombre = amigo.getNombre();
        this.apellido = amigo.getApellido();
        this.telefono = amigo.getTelefono();
        this.correoElectronico = amigo.getCorreoElectronico();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getTelefono() {
        return this.telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
    public String toString(){
        return String.format("nombre: %s // apellido: %s // telefono: %s // correo: %s", this.nombre, this.apellido, this.telefono, this.correoElectronico);
    }
    @Override
    public int compareTo(Amigo a1){

        if (this.getNombre().compareTo((a1.getNombre())) == 0){
            return this.getApellido().compareTo(a1.getApellido());
        }
        return this.getNombre().compareTo(a1.getNombre());
    }

    @Override
    public boolean equals(Object o) {

        if(o == null) return false;
        if(o == this) return true;
        if(!(o instanceof Amigo)) return false;

        Amigo a = (Amigo)o;
        return this.nombre.equals(a.nombre);
    }
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
