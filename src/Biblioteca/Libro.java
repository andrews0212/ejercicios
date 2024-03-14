package Biblioteca;

import java.time.LocalDate;

public class Libro implements ISBN{
    private String titulo;
    private Autor autor;
    private String Editorial;
    private LocalDate fechaPublicacion;
    private String isbn;
    private double precio;

    public Libro(String titulo, Autor autor, String editorial, LocalDate fechaPublicacion, String isbn, double precio) throws ISBNException {
        this.titulo = titulo;
        this.autor = autor;
        Editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        if(ISBN.comprobacion(isbn)) this.isbn = isbn;
        this.precio = precio;
    }

    public Libro(String titulo, Autor autor, String editorial, LocalDate fechaPublicacion, double precio){
        this.titulo = titulo;
        this.autor = autor;
        Editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.precio = precio;
    }

    public Libro(String titulo, Autor autor, String editorial, int dia, int mes, int anio, String isbn, double precio) throws ISBNException{
        this.titulo = titulo;
        this.autor = autor;
        Editorial = editorial;
        this.fechaPublicacion = LocalDate.of(anio,mes,dia);
        if(ISBN.comprobacion(isbn)) this.isbn = isbn;
        this.precio = precio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return Editorial;
    }

    public void setEditorial(String editorial) {
        Editorial = editorial;
    }

    public LocalDate getFechaPublicacion() {
        return fechaPublicacion;
    }

    public void setFechaPublicacion(LocalDate fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public String getIsbn() {
        return isbn;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Libro)) return false;
        if (obj == null) return false;
        if (obj == this) return true;
        Libro libro = (Libro)obj;
        return libro.titulo.equals(this.titulo);
    }

    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", autor=" + autor +
                ", Editorial='" + Editorial + '\'' +
                ", fechaPublicacion=" + fechaPublicacion +
                ", isbn=" + isbn +
                ", precio=" + precio +
                '}';
    }
}
