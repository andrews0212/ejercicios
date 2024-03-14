package EventosDeportivos;

import java.util.Comparator;

public class ComparadorTiempo implements Comparator<Corredores> {

    @Override
    public int compare(Corredores o1, Corredores o2) {
        return o1.getTiempo() - o2.getTiempo();
    }
}
