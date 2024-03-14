package LibroCollection;


public interface Libro extends Comparable<Libro>{
        String getCodigo();
        String getAutor();
        String getTitulo();
        Integer getNumPaginas();
        Integer getNumCopiasVendidas();
        Double getPrecio();
        Boolean getBestSeller();
        TipoPrestamo getTipoPrestamo();
        void setNumCopiasVendidas(Integer nc) throws CopiaNegativaException;
        void setTipoPrestamo(TipoPrestamo tp) throws PrestamoException;
}



