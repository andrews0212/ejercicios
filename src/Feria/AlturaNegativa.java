package Feria;

public class AlturaNegativa extends PuertaException{
    public AlturaNegativa() {
        super("Error en la Altura: La altura es negativa");
    }

    public AlturaNegativa(String message) {
        super(message);
    }
}
