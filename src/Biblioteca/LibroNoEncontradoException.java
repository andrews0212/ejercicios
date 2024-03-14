package Biblioteca;

public class LibroNoEncontradoException extends BiliotecaException{
    public LibroNoEncontradoException() {
        super("Libro no encontrado");
    }

    public LibroNoEncontradoException(String message) {
        super("Libro no encontrado " + message);
    }
}
