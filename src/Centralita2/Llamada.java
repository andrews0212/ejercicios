package Centralita2;

public abstract class Llamada{

    private String numeroOrigen;
    private String numeroDestino;
    private  int duracion;

    public Llamada(String numeroOrigen, String numeroDestino, int duracion) {
        this.numeroOrigen = numeroOrigen;
        this.numeroDestino = numeroDestino;
        this.duracion = duracion;
    }

    public String getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(String numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public String getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(String numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }


    @Override
    public String toString() {
        return String.format("numero origen: %s \nnumero Destino: %S \nDuracion: %s", numeroOrigen, numeroDestino, duracion);
    }


    public abstract boolean equals(Object obj);

}
