package Figura;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<Figura>();

        figuras.add(new Circulo(2,4, 5));
        figuras.add(new Rectangulo(new Punto(7,5), 5, 6));
        figuras.add(new Cuadrado(new Punto(2,7),5));

        System.out.println(Arrays.toString(figuras.toArray()));
        Collections.sort(figuras);
        System.out.println(Arrays.toString(figuras.toArray()));
    }
}