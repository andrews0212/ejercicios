package Biblioteca;

public class BiliotecaException extends Exception {
    public BiliotecaException() {
        super("error en la biblioteca ");
    }
    public BiliotecaException(String msg) {
        super("error en la biblioteca " + msg);
    }
}
