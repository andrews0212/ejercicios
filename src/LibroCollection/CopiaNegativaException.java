package LibroCollection;

public class CopiaNegativaException extends LibroExeption{
    public CopiaNegativaException() {
        super("El numero de las copias no puede ser en negativo");
    }

    public CopiaNegativaException(String message) {
        super(message);
    }
}
