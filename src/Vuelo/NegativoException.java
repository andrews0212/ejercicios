package Vuelo;

public class NegativoException extends VueloException {
    public NegativoException() {
        super("numero negativo");
    }
    public NegativoException(String msg) {
        super(msg);
    }
    
}
