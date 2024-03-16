package Vuelo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;


public class Aeropuerto {

    private String nombre;
    private Set<Vuelo> vuelos;


    public Aeropuerto(String nombre) {
        this.nombre = nombre;
        this.vuelos = new HashSet<Vuelo>();
    }
    
    public void añadirVuelo(Vuelo vuelo){
        vuelos.add(vuelo);
    }
    public void quitarVuelo(Vuelo vuelo){
        for (Vuelo v : vuelos) {
            if (v.getCodigo().equals(vuelo.getCodigo())){
                vuelos.remove(vuelo);
            }

        }
    }
    public Set<Vuelo> buscaVuelosPorDias(LocalDate fecha){
        
        Set<Vuelo> vuelos = new HashSet<Vuelo>();

        for (Vuelo vuelo : this.vuelos) {

            if (vuelo.getFecha().equals(fecha)){
                vuelos.add(vuelo);
            }

        }
        return vuelos;
    }

    public int vuelosSinPlazas(){
        int contador;
        contador = 0;
        for (Vuelo vuelo : vuelos) {
            contador +=  vuelo.getNumeroDePasajero() == vuelo.getNumeroDePlaza() ? 1 : 0;   
        }
        return contador;
    }

    public double recaudacionPorDestino(String destino){
        double recaudacion;
        recaudacion = 0;
        for (Vuelo vuelo : vuelos) {
            if (vuelo.getDestino().equalsIgnoreCase(destino)){
                recaudacion += vuelo.getPrecio() * vuelo.getNumeroDePasajero();
            }
        }
        return recaudacion;
    }

    public Vuelo VueloMasBarato(String destino){
    return vuelos.stream().filter(p -> p.getDestino().equalsIgnoreCase(destino)).min(new ComparadorPorPrecio()).get();
    }
    

}
