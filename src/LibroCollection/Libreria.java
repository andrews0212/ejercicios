package LibroCollection;

import java.util.*;

public class Libreria {
    public List<IMP_Libro> estanteria;

    public Libreria(List<IMP_Libro> estanteria) {
        this.estanteria = new ArrayList<>();
        this.estanteria.addAll(estanteria);
    }

    public Libreria() {
        this.estanteria = new ArrayList<>();
    }

    public int MenorPrecio(int p){
        int contador;
        contador = 0;

        for (Libro l: estanteria) {

            contador += l.getPrecio() < p ? 1 : 0;

        }

        return contador;

    }

    public int contieneTitulo(String s){
        int contador;
        contador = 0;
        for (Libro l: estanteria) {

            contador +=  l.getTitulo().contains(s) ? 1 : 0;
        }
        return  contador;
    }

    public boolean hayPrestamo(TipoPrestamo p){
        Iterator<IMP_Libro> it = estanteria.iterator();
        Libro l = null;
        while(it.hasNext()){
            l = it.next();
            if (l.getTipoPrestamo().equals(p)){
                return true;
            }
        }
        return false;
    }

    public int copiasVendidasPorAutor(String autor){

        for (Libro l: estanteria) {
        if (l.getAutor().equals(autor))
          return l.getNumCopiasVendidas();
        }

        return 0;

    }
    public double recaurdacionPorAutor(String autor){

        for (Libro l: estanteria) {
            if (l.getAutor().equals(autor))
                return (l.getPrecio() * l.getNumCopiasVendidas());
        }

        return 0;

    }

    public Libro libroConMasPagina() {

//        Libro l2;
//        l2 = estanteria.get(0);
//
//        for (Libro l: estanteria) {
//            if (l.getNumPaginas() > l2.getNumPaginas()){
//                l2 = l;
//            }
//        }
//        return l2;
//    }

        return Collections.max(estanteria, new ComparadorPaginas());

    }
    public Libro libroConMenosPagina() {

//        Libro l2;
//        l2 = libroConMasPaginas();
//
//        for (Libro l: estanteria) {
//            if (l.getNumPaginas() < l2.getNumPaginas()){
//                l2 = l;
//            }
//        }
//        return l2;
//    }

        return Collections.min(estanteria, new ComparadorPaginas());

    }
    public Libro libroConMenorPrecio(){
        return Collections.min(estanteria, new ComparadorPrecio());
    }
    public Libro libroConMayorPrecio(){
        return Collections.max(estanteria, new ComparadorPrecio());
    }
    public Libro libroConMayorRecaurdacion(){
        return Collections.max(estanteria, new ComparatorRecaudacion());
    }

    public List<IMP_Libro> librosDelAutor(String nombre){
       return estanteria.stream().filter(e -> e.getAutor().equals(nombre)).toList();
    }


}
