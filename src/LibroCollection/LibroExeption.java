package LibroCollection;

public class LibroExeption extends Exception{
    public LibroExeption() {
        super("Error: LibroExeption");
    }

    public LibroExeption(String message) {
        super(message);
    }
}
