package Vuelo;

import java.util.Comparator;

public class ComparadorPorPrecio implements Comparator<Vuelo> {

    @Override
    public int compare(Vuelo o1, Vuelo o2) {
        return o1.getPrecio().compareTo(o2.getPrecio());
    }
    
}
