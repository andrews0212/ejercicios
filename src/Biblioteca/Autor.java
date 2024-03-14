package Biblioteca;

import java.time.LocalDate;
import java.time.LocalTime;

public class Autor extends Persona{

    private GeneroLiterario generoLiterario;

    public Autor(String nombre, String apellido, LocalDate fechaNacimiento, GeneroLiterario generoLiterario) {
        super(nombre, apellido, fechaNacimiento);
        this.generoLiterario = generoLiterario;
    }

    public Autor(String nombre, String apellido, int dia, int mes, int anio, GeneroLiterario generoLiterario) {
        super(nombre, apellido, dia, mes, anio);
        this.generoLiterario = generoLiterario;
    }
    public GeneroLiterario getGeneroLiterario() {
        return generoLiterario;
    }

    public void setGeneroLiterario(GeneroLiterario generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    @Override
    public String toString() {
        return "Autor{" +
                "generoLiterario=" + generoLiterario +
                '}';
    }
}
