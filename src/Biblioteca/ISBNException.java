package Biblioteca;

public class ISBNException extends BiliotecaException{
    public ISBNException(String isbn){

        super("Error en el isbn :" + isbn);
    }
}
