package Vuelo;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeMap;
import java.util.TreeSet;

import centralitaLLamadas.Local;


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

    public void graba(String nombre) throws FileNotFoundException{
        File fichero = new File(nombre+".html");
        PrintWriter printWriter = new PrintWriter(fichero);
        // CABECERA
        printWriter.println("<html>");
       printWriter.println("<body>");
       printWriter.println("<table>");
       printWriter.println("<tr>");
       printWriter.println("<th>Codigo</th>");
       printWriter.println("<th>Destino</th>");
       printWriter.println("<th>Fecha</th>");
        for(VueloIMP vuelo : vuelos){
            printWriter.println("<tr>");
            printWriter.printf("<td>%s</td> <td>%s</td> <td>%s</td>", vuelo.getCodigo(), vuelo.getDestino(), vuelo.getFecha());
            printWriter.println("</tr>");
        }
        printWriter.println("</table>");
        printWriter.println("</body>");
        printWriter.println("</html>");
        printWriter.close();
        
    }



    // public AeropuertoIMP(String nombre) throws VueloException, FileNotFoundException {
    //     this.nombre = nombre;
    //     this.vuelos = new HashSet<VueloIMP>();
    //     File fichero = new File("src\\Vuelo\\vuelos.txt");
    //     Scanner teclado = new Scanner(fichero);
    //     String linea;
    //         while (teclado.hasNextLine()){
    //             linea = teclado.nextLine();
    //             vuelos.add(new VueloIMP(linea));
                
    //         }
    //         }


    public AeropuertoIMP(String nombre) throws VueloException{
        this.nombre = nombre;
        this.vuelos = new HashSet<VueloIMP>();
        Scanner sc = new Scanner(System.in);
        String cadena;
       
        while ( !(cadena = sc.nextLine()).isBlank()) {
            vuelos.add(new VueloIMP(cadena));
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

    // public void cuentaVueloDia(){
    //     ArrayList<LocalDate> fechas = new ArrayList<LocalDate>();
    //     int[] contador;
    //     for (VueloIMP v : vuelos){
    //        if (fechas.contains(v.getFecha())){
            
    //        }else {
    //         fechas.add(v.getFecha());
    //        }
           
    //     }
    //     contador = new int[fechas.size()];

    //     for (VueloIMP v : vuelos){
    //         if (fechas.contains(v.getFecha())){
    //             for(int i = 0; i < fechas.size(); i++){
    //                 if (fechas.get(i).equals(v.getFecha()))
    //                 contador[i] = contador[i] + 1;
    //             }
                

    //         }
    //     }
        

    //     for (int i = 0; i < fechas.size(); i++) {
    //         System.out.println(fechas.get(i) + " : " + contador[i]);
    //     }

    //     }


    /* */
    public Map<LocalDate, Integer> cuentaVueloDia(){
        Map<LocalDate, Integer> map = new HashMap<LocalDate, Integer>();
        for (VueloIMP vueloIMP : vuelos) {
            if (!(map.containsKey(vueloIMP.getFecha()))){
                map.put(vueloIMP.getFecha(), 1);
            }else{
                map.put(vueloIMP.getFecha(), map.get(vueloIMP.getFecha()) +1);
            }
        }
        return map;

    }
    public LocalDate dameFechaMasVuelo(){
        Map<LocalDate, Integer> map = cuentaVueloDia();
        LocalDate fecha;
        Integer max;
        fecha = null;
        max = 0;
        for (Entry<LocalDate, Integer> mp : map.entrySet()) {
            if (max < mp.getValue()){
            max = mp.getValue();
            fecha = mp.getKey();
            }
            
        }
        return fecha;
    }
    public LocalDate dameFechaMenosVuelo(){
        Map<LocalDate, Integer> map = cuentaVueloDia();
        LocalDate fecha;
        Integer min;
        fecha = null;
        min = -1;
        for (Entry<LocalDate, Integer> mp : map.entrySet()) {
            if (min > mp.getValue() || min == -1){
            min = mp.getValue();
            fecha = mp.getKey();
            }
            
        }
        return fecha;
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

    public Set<VueloIMP> getVuelos(){
        return this.vuelos;
    }

    @Override
    public String toString() {
        return "AeropuertoIMP [nombre=" + nombre + ", vuelos=" + vuelos + "]";
    }
    

}
