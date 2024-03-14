package LibroCollection;

public class Main {
    public static void main(String[] args) {

        IMP_Libro l1 = new IMP_Libro("001", "Autor1", "Título1 jesus", 200, 20, TipoPrestamo.SEMANAL, 100, 50);
        IMP_Libro l2 = new IMP_Libro("002", "Autor2", "Título2", 250, 25, TipoPrestamo.QUINCENAL, 80, 40);
        IMP_Libro l3 = new IMP_Libro("003", "Autor3", "Título3 jesus", 300, 30, TipoPrestamo.MENSUAL, 120, 60);
        IMP_Libro l4 = new IMP_Libro("004", "Autor1", "Título4 jesus", 180, 18, TipoPrestamo.QUINCENAL, 90, 45);
        IMP_Libro l5 = new IMP_Libro("005", "Autor1", "Título5", 220, 22, TipoPrestamo.MENSUAL, 110, 55);
        IMP_Libro l6 = new IMP_Libro("006", "Autor6", "Título6", 270, 27, TipoPrestamo.MENSUAL, 70, 35);
        IMP_Libro l7 = new IMP_Libro("007", "Autor7", "Título7", 240, 24, TipoPrestamo.SEMANAL, 130, 65);
        IMP_Libro l8 = new IMP_Libro("008", "Autor8", "Título8", 190, 19, TipoPrestamo.SEMANAL, 85, 42);
        IMP_Libro l9 = new IMP_Libro("009", "Autor9", "Título9", 310, 26, TipoPrestamo.QUINCENAL, 115, 57);
        IMP_Libro l10 = new IMP_Libro("010", "Autor10", "Título10", 260, 31, TipoPrestamo.QUINCENAL, 75, 38);

        Libreria libreria = new Libreria();
        libreria.estanteria.add(l1);
        libreria.estanteria.add(l2);
        libreria.estanteria.add(l3);
        libreria.estanteria.add(l4);
        libreria.estanteria.add(l5);
        libreria.estanteria.add(l6);
        libreria.estanteria.add(l7);
        libreria.estanteria.add(l8);
        libreria.estanteria.add(l9);
        libreria.estanteria.add(l10);

        System.out.printf("hay %s libros que tienen un precio menos de 20 \n",libreria.MenorPrecio(20));
        System.out.printf("hay %s libros que contiene la palabra \n ", libreria.contieneTitulo("jesus"));
        System.out.println(libreria.hayPrestamo(TipoPrestamo.QUINCENAL));
        System.out.println(libreria.copiasVendidasPorAutor("Autor1"));
        System.out.println(libreria.copiasVendidasPorAutor("Pepe"));
        System.out.println(libreria.recaurdacionPorAutor("Autor1"));
        System.out.println(libreria.libroConMasPagina());
        System.out.println(libreria.libroConMenosPagina());
        System.out.println(libreria.libroConMayorPrecio());
        System.out.println(libreria.libroConMenorPrecio());
        System.out.println(libreria.libroConMayorRecaurdacion());
        System.out.println(libreria.librosDelAutor("Autor1"));

























    }
}
