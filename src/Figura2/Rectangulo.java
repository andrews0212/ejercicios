package Figura2;

import java.util.*;


public class Rectangulo extends Figura {

 
   

    public Double base;

    public Double altura;

    public Rectangulo(double base, double altura, Punto punto){
        super("rectangulo", punto);
        this.base = base;
        this.altura = altura;
       
    }


    public void setNombre(String nombre) {
       
        super.setNombre(nombre);
    }

    public double getArea() {
      return (double) base * altura;
    }
   
    public Double getPerimetro() {
        // TODO implement here
        return null;
    }

}