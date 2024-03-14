package Feria;

public class PuertaException extends Exception{
    public PuertaException() {
        super("Error en la puerta");
    }

    public PuertaException(String message) {
        super("Error en la puerta" + message);
    }
}
