package LibroCollection;

public class IMP_Libro implements Libro{

    private String codigo;
    private String autor;
    private String titulo;
    private int numeroPaginas;
    private double precio;

    private boolean bestSelle;

    private TipoPrestamo tipoPrestamo;
    private  int numeroCopiaVendidas;

    private int numeroDeCopiasVendidas;

    public IMP_Libro(String codigo, String autor, String titulo, int numeroPaginas, int precio, TipoPrestamo tipoPrestamo, int numeroCopiaVendidas, int numeroDeCopiasVendidas) {
        this.codigo = codigo;
        this.autor = autor;
        this.titulo = titulo;
        this.numeroPaginas = numeroPaginas;
        this.precio = precio;
        this.tipoPrestamo = tipoPrestamo;
        this.numeroCopiaVendidas = numeroCopiaVendidas;
        this.numeroDeCopiasVendidas = numeroDeCopiasVendidas;
    }

    @Override
    public String getCodigo() {
        return this.codigo;
    }

    @Override
    public String getAutor() {
        return this.autor;
    }

    @Override
    public String getTitulo() {
        return this.titulo;
    }

    @Override
    public Integer getNumPaginas() {
        return this.numeroPaginas;
    }

    @Override
    public Integer getNumCopiasVendidas() {
        return this.numeroCopiaVendidas;
    }

    @Override
    public Double getPrecio() {
        return this.precio;
    }

    @Override
    public Boolean getBestSeller() {
        return this.bestSelle;
    }

    @Override
    public TipoPrestamo getTipoPrestamo() {
        return this.tipoPrestamo;
    }

    @Override
    public void setNumCopiasVendidas(Integer nc) throws CopiaNegativaException {

        if (nc < 0){ throw new CopiaNegativaException();}
        this.numeroCopiaVendidas = nc;

    }

    @Override
    public void setTipoPrestamo(TipoPrestamo tp) throws PrestamoException {
     if (tp.equals(null)){throw new PrestamoException();}
     this.tipoPrestamo = tp;
    }

    @Override
    public int compareTo(Libro o) {
        if(this.titulo.compareTo(o.getTitulo()) == 0){
             if (this.autor.compareTo(o.getAutor()) == 0){
                 return this.codigo.compareTo(o.getCodigo());
             } else{
                 return  this.autor.compareTo(o.getAutor());
             }
        } else {
            return this.titulo.compareTo(o.getTitulo());
        }
    }

    @Override
    public String toString() {
        return "IMP_Libro{" +
                "codigo='" + codigo + '\'' +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", numeroPaginas=" + numeroPaginas +
                ", precio=" + precio +
                ", bestSelle=" + bestSelle +
                ", tipoPrestamo=" + tipoPrestamo +
                ", numeroCopiaVendidas=" + numeroCopiaVendidas +
                ", numeroDeCopiasVendidas=" + numeroDeCopiasVendidas +
                '}';
    }
}
