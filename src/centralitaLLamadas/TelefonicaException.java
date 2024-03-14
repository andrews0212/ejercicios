package centralitaLLamadas;

public class TelefonicaException extends Exception{


    public TelefonicaException() {
        super("Error general en la centralita");
    }

    public TelefonicaException(String message) {
        super(message);
    }

}
