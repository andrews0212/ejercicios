package Figura2;

import java.util.*;


public class Triangulo extends Figura {

    
    public Punto puntoB;

    public Punto puntoC;

    public Triangulo(Punto puntoA, Punto puntoB, Punto puntoC) {
        super("triangulo", puntoA);
        if (!comprobarTriangulo(puntoA, puntoB, puntoC)){
            throw new IllegalArgumentException("no se cumple la condicion del triangulo");
        } else {
            this.puntoB = puntoB;
            this.puntoC = puntoC;
        }  
    }


    public double dameLado(Punto puntoA, Punto puntoB){
        return puntoA.getDistancia(puntoB);
    }

    public boolean comprobarTriangulo(Punto puntoA, Punto puntoB, Punto puntoC){
        double a = dameLado(puntoA, puntoB);
        double b = dameLado(puntoB, puntoC);
        double c = dameLado(puntoC, puntoA);
        if ( (a + b) > c && (b + c) > a && (c + a) > b ){     
        return true;     
        }
        return false;
    }


    public double getArea() {
        double semiPerimetro;
        double a = dameLado(super.getPunto(), puntoB);
        double b = dameLado(puntoB, puntoC);
        double c = dameLado(puntoC, super.getPunto());
        semiPerimetro = (double) (a + b + c) / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - a) * (semiPerimetro - b) * (semiPerimetro - c));

    }

  


    public Double getPerimetro() {
        double a = dameLado(super.getPunto(), puntoB);
        double b = dameLado(puntoB, puntoC);
        double c = dameLado(puntoC, super.getPunto());
        return (double) a + b + c;
    }

}