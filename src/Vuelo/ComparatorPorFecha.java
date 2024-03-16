package Vuelo;

import java.util.Comparator;

public class ComparatorPorFecha implements Comparator<Vuelo> {

    @Override
    public int compare(Vuelo o1, Vuelo o2) {
      return o1.getFecha().compareTo(o2.getFecha());
    }

  
    
}
