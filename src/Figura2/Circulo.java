package Figura2;

import java.util.*;


public class Circulo extends Figura {

    public Double radio;

    public Circulo(double radio, Punto puntoA) {
        super("Circulo", puntoA);
        this.radio = radio;
    }



    public double getArea() {
       
        return 3.14 * Math.pow(radio, 2);
    }

    public Double getPerimetro() {
        return (2 * 3.14) * this.radio;
    }

  

}