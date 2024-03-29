package Vuelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;


public class AeropuertoIMP implements Aeropuerto{

    private String nombre;
    private Set<VueloIMP> vuelos;


    // public AeropuertoIMP(String nombre) {
    //     this.nombre = nombre;
    //     this.vuelos = new HashSet<VueloIMP>();
    // }
    public AeropuertoIMP() throws VueloException{

        Scanner teclado = new Scanner(System.in);
        this.nombre = teclado.nextLine();
        this.vuelos = new HashSet<VueloIMP>();

        String linea;
            while (teclado.hasNextLine()){
                if(teclado.nextLine().isEmpty())break;
                vuelos.add(new VueloIMP(teclado.nextLine()));
                
            }
            }
    public AeropuertoIMP(String nombre) throws VueloException, FileNotFoundException {
        this.nombre = nombre;
        this.vuelos = new HashSet<VueloIMP>();
        File fichero = new File("src\\Vuelo\\vuelos.txt");
        Scanner teclado = new Scanner(fichero);
        String linea;
            while (teclado.hasNextLine()){
                linea = teclado.nextLine();
                vuelos.add(new VueloIMP(linea));
                
            }
            }
    

    
    public void añadirVuelo(VueloIMP vuelo){
        vuelos.add(vuelo);
    }
    
    public void quitarVuelo(VueloIMP vuelo){
        for (VueloIMP v : vuelos) {
            if (v.getCodigo().equals(vuelo.getCodigo())){
                vuelos.remove(vuelo);
            }

        }
    }
    public Set<VueloIMP> buscaVuelosPorDias(LocalDate fecha){
        
        Set<VueloIMP> vuelos = new HashSet<VueloIMP>();

        for (VueloIMP vuelo : this.vuelos) {

            if (vuelo.getFecha().equals(fecha)){
                vuelos.add(vuelo);
            }

        }
        return vuelos;
    }

    public int vuelosSinPlazas(){
        int contador;
        contador = 0;
        for (VueloIMP vuelo : vuelos) {
            contador +=  vuelo.getNumeroDePasajero() == vuelo.getNumeroDePlaza() ? 1 : 0;   
        }
        return contador;
    }

    public double recaudacionPorDestino(String destino){
        double recaudacion;
        recaudacion = 0;
        for (VueloIMP vuelo : vuelos) {
            if (vuelo.getDestino().equalsIgnoreCase(destino)){
                recaudacion += vuelo.getPrecio() * vuelo.getNumeroDePasajero();
            }
        }
        return recaudacion;
    }

    /*
     * 
     * la otra forma de hacerlos es creando una collection que almacene  todos los del mismo destino
     * y luego lo ordenas con el collections.min(new comparator()).
     * 
     * 
     */

    public VueloIMP VueloMasBarato(String destino){
    return vuelos.stream().filter(p -> p.getDestino().equalsIgnoreCase(destino)).min(new ComparadorPorPrecio()).get();
    }


    public VueloIMP PrimerVueloConPlaza(String destino){
        return vuelos.stream().filter(p -> p.getDestino().equalsIgnoreCase(destino) && p.getNumeroDePasajero() < p.getNumeroDePlaza()).min(new ComparatorPorFecha()).get();
    }

    // numero de plaza == 100%
    // numero de pasajero = ?
    //(numero / nummeroPasajero) * 100

    public double porcentajePlaza(LocalDate fecha){
        double porcentaje;
        porcentaje = 0;
        for (VueloIMP vuelo : vuelos) {
            if (vuelo.getFecha().equals(fecha)){
                if(porcentaje <= (vuelo.getNumeroDePlaza() / vuelo.getNumeroDePasajero()) * 100){
                    porcentaje = (vuelo.getNumeroDePlaza() / vuelo.getNumeroDePasajero()) * 100;
                }
            }
        }
        return porcentaje;
    }
    
    public void incrementarPrecio(double porcentaje, LocalDate fecha)
    {
        for (VueloIMP vuelo : vuelos) {
            if (vuelo.getFecha().compareTo(fecha) > 0){
                vuelo.setPrecio( vuelo.getPrecio() + (vuelo.getPrecio() * porcentaje / 100));
            }
        }
    }

    void mostrarVuelos(){
        for (VueloIMP v : vuelos) {
            System.out.println(v);
        }
    }

}
