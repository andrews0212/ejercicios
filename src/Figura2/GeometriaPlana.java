package Figura2;

import java.util.ArrayList;
import java.util.Arrays;

public interface GeometriaPlana {

    double getArea();
    double getPerimetro();

  static double CompararArea(GeometriaPlana f, GeometriaPlana f2) {

        String valor1 = String.valueOf(f.getArea());
        String valor2 = String.valueOf(f2.getArea());
        if (valor1.compareTo(valor2) > 0){
            System.out.printf("%s es mayor");
            return valor1.compareTo(valor2);
        } else if (valor1.compareTo(valor2) < 0) {
            System.out.printf("%s es menor");
            return valor1.compareTo(valor2);
        } else {
            System.out.printf("%s es igual");
            return valor1.compareTo(valor2);
        }

    }

    static ArrayList<Figura> OrdenaArray(ArrayList<Figura> a){
        Figura aux;
        for (int i = 0; i < a.size(); i++) {
         
            for (int j = (i + 1); j < a.size(); j++) {
                if (a.get(i).getArea() > a.get(j).getArea()){
                    aux = a.get(i);
                    a.set(i, a.get(j));
                    a.set(j, aux);
                }

            }

        }
        return a; 
        }

    }


