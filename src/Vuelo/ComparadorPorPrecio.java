package Vuelo;

import java.util.Comparator;

public class ComparadorPorPrecio implements Comparator<VueloIMP> {

    @Override
    public int compare(VueloIMP o1, VueloIMP o2) {
        return o1.getPrecio().compareTo(o2.getPrecio());
    }
    
}
