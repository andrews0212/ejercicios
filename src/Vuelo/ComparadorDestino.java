package Vuelo;

import java.util.Comparator;

public class ComparadorDestino implements Comparator<Vuelo>{

    @Override
    public int compare(Vuelo o1, Vuelo o2) {
        if (!(o1.getDestino().compareTo(o2.getDestino()) == 0)){
            return o1.getDestino().compareTo(o2.getDestino());
        } else {
            return o1.getCodigo().compareTo(o2.getCodigo());
        }   
        
    }

}
