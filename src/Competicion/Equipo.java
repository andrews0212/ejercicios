package Competicion;

import java.util.ArrayList;
import java.util.List;

public class Equipo {

    private String nombre;
    private int puntosA;
    private int puntosC;

    public Equipo(String nombre, int puntosA, int puntosC) {
        this.nombre = nombre;
        this.puntosA = puntosA;
        this.puntosC = puntosC;
    }
    

    @Override
    public String toString() {
        return "Equipo [nombre=" + nombre + ", puntosA=" + puntosA + ", puntosC=" + puntosC + "]";
    }


    public String getNombre() {
        return nombre;
    }


    public int getPuntosA() {
        return puntosA;
    }


    public int getPuntosC() {
        return puntosC;
    }
    
    
    

}
