package LibroCollection;

import java.util.Comparator;

public class ComparadorPrecio implements Comparator<IMP_Libro> {
    @Override
    public int compare(IMP_Libro o1, IMP_Libro o2) {
        return o1.getPrecio().compareTo(o2.getPrecio());
    }
}
