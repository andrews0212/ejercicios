package Feria;

public class AlturaMinimaNoValida extends PuertaException{

    public AlturaMinimaNoValida() {
        super("La Altura Minima no valida");
    }

    public AlturaMinimaNoValida(String message) {
        super(message);
    }
}
