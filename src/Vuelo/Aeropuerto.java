package Vuelo;

import java.time.LocalDate;
import java.util.Set;

public interface Aeropuerto {
    public void añadirVuelo(VueloIMP vuelo);
    public void quitarVuelo(VueloIMP vuelo);
    public Set<VueloIMP> buscaVuelosPorDias(LocalDate fecha);
    public int vuelosSinPlazas();
    public double recaudacionPorDestino(String destino);
    public VueloIMP VueloMasBarato(String destino);
    public VueloIMP PrimerVueloConPlaza(String destino);
    public double porcentajePlaza(LocalDate fecha);
    public void incrementarPrecio(double porcentaje, LocalDate fecha);
}
