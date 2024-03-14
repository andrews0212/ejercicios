package Biblioteca;

import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros;

    public Biblioteca() {
        this.libros = new ArrayList<Libro>();
    }

    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void agregarLibro(Libro libro){
        this.libros.add(libro);
    }
    public void eliminarLibro(Libro libro) throws LibroNoEncontradoException{
        if (buscarLibroLista(libro) == -1){
           throw new LibroNoEncontradoException();
        }
        libros.remove(buscarLibroLista(libro));
    }
    public void eliminarLibro(String titulo) throws LibroNoEncontradoException{
        if (buscarLibroLista(new Libro(titulo, null, null, null, 0)) == -1){
            throw new LibroNoEncontradoException();
        }
        libros.remove(buscarLibroLista(titulo));
    }
    public int buscarLibroLista(Libro libro){
       return libros.indexOf(libro);
    }
    public int buscarLibroLista(String titulo){
        return libros.indexOf(new Libro(titulo, null, null, null, 0));
    }
    public Libro buscarLibro(String titulo){
        for (Libro l:libros) {
            if (l.equals(new Libro(titulo, null, null, null, 0)))
                return l;
        }
        return null;

    }

}
