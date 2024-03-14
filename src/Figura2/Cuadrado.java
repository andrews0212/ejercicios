package Figura2;

import java.lang.reflect.Method;
import java.util.*;


public class Cuadrado extends Rectangulo {

    public Punto punto;
    public double lado;

    public Cuadrado(Punto punto, double lado){
        super(lado, lado, punto);
        this.punto = punto;
        this.lado = lado;
        setNombreCuadrado("cuadrado");
       
    }

    private void setNombreCuadrado(String nombre){
        super.setNombre(nombre);
    }

    public double getLado(){
        return this.lado;
    }

    public double getArea() {
        return (double) lado * lado;
    }
    public void compararArea(Figura figura){
        String area = String.valueOf(getArea());
        String area2 = String.valueOf(figura.getArea());

        area.compareTo(area2);
        if (area.compareTo(area2) > 0){
            System.out.println(this.getNombre() + " es mayor");
        } else if (area.compareTo(area2) == 0){
            System.out.println(this.getNombre() + " es igual");
        } else if (area.compareTo(area2) < 0){
            System.out.println(this.getNombre() + " es menor");
        }
    }
}