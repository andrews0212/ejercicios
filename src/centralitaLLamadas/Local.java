package centralitaLLamadas;

public class Local extends Llamadas {

    // los precios serian mejor instanciarlos en el constructor igual con el provincial
    private int precio = 15;

    public Local(String numeroOrigen, String numeroDestino, double Duracion) throws LlamadaTelefonica{
        super(numeroOrigen, numeroDestino, Duracion);
    }

    public double coste() {
        return (double) this.precio * super.getDuracion();
    }
}
