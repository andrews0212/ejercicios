package Vuelo;

import java.util.Comparator;

public class ComparatorPorFecha implements Comparator<VueloIMP> {

    @Override
    public int compare(VueloIMP o1, VueloIMP o2) {
      return o1.getFecha().compareTo(o2.getFecha());
    }

  
    
}
