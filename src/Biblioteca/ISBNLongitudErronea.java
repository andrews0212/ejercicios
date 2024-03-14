package Biblioteca;

public class ISBNLongitudErronea extends ISBNException{

    public ISBNLongitudErronea(String isbn){
        super("Longitud Erronea: " +  isbn.length());
    }
}
