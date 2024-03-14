package Centralita2;

public class Provincial extends Llamada{

    private Franja franja;
    public Provincial(String numeroOrigen, String numeroDestino, int duracion, Franja franja) {
        super(numeroOrigen, numeroDestino, duracion);
        this.franja = franja;
    }

    public Franja getFranja() {
        return franja;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Provincial)) return false;
        if (getClass() != obj.getClass()) return false;

        Llamada l = (Provincial) obj;
        return super.getNumeroOrigen().equals(l.getNumeroOrigen());

    }

    @Override
    public String toString() {
        return super.toString() +
                "franja= " + franja +
                '}';
    }
}
