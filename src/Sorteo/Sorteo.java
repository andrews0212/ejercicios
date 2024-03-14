package Sorteo;

public abstract class Sorteo implements Sorteable {

    protected int posibilidades;

    public Sorteo(int posibilidades){
        this.posibilidades = posibilidades;
    }
    public abstract String lanzar();

}
