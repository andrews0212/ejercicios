package LibroCollection;

import java.util.Comparator;

public class ComparadorPaginas implements Comparator<IMP_Libro> {

    @Override
    public int compare(IMP_Libro o1, IMP_Libro o2) {
        return o1.getNumPaginas() - o2.getNumPaginas();
    }

}
