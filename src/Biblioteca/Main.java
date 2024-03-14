package Biblioteca;

public class Main {
    public static void main(String[] args) {
        Biblioteca biblioteca = new Biblioteca();

        try {
            biblioteca.agregarLibro(new Libro("El oro se dará",new Autor("Pedro", "Perez", 2, 12, 2002, GeneroLiterario.Dramattico), "cantimploora", 12, 11, 2003, "1000200000", 544));
            biblioteca.agregarLibro(new Libro("venezuela",new Autor("Maria", "Santa", 21, 12, 2013, GeneroLiterario.Didactico), "mine", 21, 2, 2017, "000020000x", 213));
            biblioteca.agregarLibro(new Libro("Sopla",new Autor("Andrews", "Dosrasmo", 2, 2, 2013, GeneroLiterario.Didactico), "mine", 21, 2, 2017, "9788441526822", 213));
            System.out.println(biblioteca.buscarLibro("venezuela"));
            biblioteca.eliminarLibro("venezuela");
        } catch (BiliotecaException e){
            System.out.println(e);
        }

        System.out.println(biblioteca.buscarLibro("venezuela"));

        try {
            biblioteca.eliminarLibro("venezuela");
        } catch (LibroNoEncontradoException e){
            System.out.println(e);
        }
    }
}
