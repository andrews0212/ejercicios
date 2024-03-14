package LibroCollection;

import java.util.Comparator;

public class ComparatorRecaudacion implements Comparator<IMP_Libro> {


    @Override
    public int compare(IMP_Libro o1, IMP_Libro o2) {
        Double presupuesto1;
        Double presupuesto2;

        presupuesto1 = (o1.getPrecio() * o1.getNumCopiasVendidas());
        presupuesto2 = (o2.getPrecio() * o2.getNumCopiasVendidas());
        return presupuesto1.compareTo(presupuesto2);
    }
}
