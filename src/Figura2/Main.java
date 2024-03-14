package Figura2;

import java.util.ArrayList;
import java.util.Arrays;

public class Main{
    
    public static void main(String[] args) {
    /*  Punto p = new Punto( 2, 3);
        Cuadrado c = new Cuadrado(p, 2);
        System.out.println(c.getNombre());
        Rectangulo r = new Rectangulo(2, 2, p);
        System.out.println(r.getNombre());
        Figura f = new Figura("rectangulo", p);

        f = c;

        System.out.println(((Cuadrado)f).getArea());

        Object object = new Object();

        object = f;

        System.out.println(((Figura)object).getNombre());

        System.out.println(f.getArea()); */
/*Punto p = new Punto( 0, 0);
        Punto p1 = new Punto( 3, 0);
        Punto p2 = new Punto( 0, 4);
        Triangulo triangulo = new Triangulo(p, p1, p2);
        System.out.println(triangulo);
        Rectangulo r = new Rectangulo(3, 2, p);
        Cuadrado c = new Cuadrado(p, 2);
        Cuadrado c1 = new Cuadrado(p, 3);
        c.compararArea(r);*/

        ArrayList<Figura> array = new ArrayList<Figura>();
        for (int i = 0; i < 10; i++) {
        
        Cuadrado c = new Cuadrado(new Punto((int) (Math.random()* 10) -1, (int) (Math.random()* 10) -1), (int) (Math.random()* 10) -1);  
        array.add(c);
        }

        for (int i = 0; i < array.size(); i++) {
            System.out.print(array.get(i).getArea() + " ");
        }

        System.out.println();


        ArrayList<Figura> ordenado = GeometriaPlana.OrdenaArray(array);

    

        for (int i = 0; i < ordenado.size(); i++) {
            System.out.print(ordenado.get(i).getArea() + " ");
        }

        
    }
}
