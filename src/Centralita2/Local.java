package Centralita2;

public class Local extends Llamada{

    private final double PRECIO = 0.15;
    public Local(String numeroOrigen, String numeroDestino, int duracion) {
        super(numeroOrigen, numeroDestino, duracion);
    }

    public double getPRECIO() {
        return PRECIO;
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;
        if (!(obj instanceof Local)) return false;
        if (getClass() != obj.getClass()) return false;

        Local l = (Local) obj;
        return super.getNumeroOrigen().equals(l.getNumeroOrigen());



    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nPRECIO= " + PRECIO +
                '}';
    }
}
