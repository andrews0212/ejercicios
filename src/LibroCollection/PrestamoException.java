package LibroCollection;

public class PrestamoException extends LibroExeption{
    public PrestamoException() {
        super("El prestamo es erroneo");
    }

    public PrestamoException(String message) {
        super(message);
    }
}
