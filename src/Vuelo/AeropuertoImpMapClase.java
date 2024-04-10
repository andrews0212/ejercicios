package Vuelo;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class AeropuertoImpMapClase extends AeropuertoIMP{

    /*a) Un método que devuelva una estructura que relacione cada fecha con todos los
vuelos programados para ese dia. */
    
    public AeropuertoImpMapClase(String n) throws FileNotFoundException, VueloException{
        super(n);
    }

    public Map<LocalDate, List<Vuelo>> getVueloPorDia(){
        Map<LocalDate, List<Vuelo>> map = new HashMap();
        for (Vuelo vuelo : super.getVuelos()){
        if (!map.containsKey(vuelo.getFecha())){
            map.put(vuelo.getFecha(), new ArrayList<Vuelo>());
            map.get(vuelo).add(vuelo);
        } else{
            map.get(vuelo).add(vuelo);
        }
        
        }
        return map;
        }

        public SortedMap<LocalDate, Integer> getPasajerosXDia(){
            SortedMap<LocalDate, Integer> map = new TreeMap();
             for(Vuelo vuelo: getVuelos()) {
                    map.put(vuelo.getFecha(), map.getOrDefault(vuelo.getFecha(), 0) + 1);
                
             }
            return map;
        }

        public void getDiaMasPasajeros(){
            Map<LocalDate, Integer> nPXD = getPasajerosXDia();
            SortedMap<Integer, List<LocalDate>> nPXDInv = new TreeMap<>();
            for (LocalDate fecha : nPXD.keySet()){
                if(!nPXDInv.containsKey(nPXD.get(fecha))){
                    nPXDInv.put(nPXD.get(fecha), new ArrayList<>());
                    nPXDInv.get(nPXD.get(fecha)).add(fecha);
                }
            }
            pintaPXD(nPXD);
            pintaPXDI(nPXDInv);
            
            System.out.println(nPXDInv.lastKey() + " " + nPXDInv.get(nPXDInv.lastKey()));
            
            
        }

        public void pintaPXDI(Map<Integer, List<LocalDate>> nPXD){
            for (Map.Entry a : nPXD.entrySet()) {
                System.out.println(a.getKey() + " > " + a.getValue() );
          
            }
        }
        public void pintaPXD(Map<LocalDate, Integer> nPXD){
            for (Map.Entry a : nPXD.entrySet()) {
                System.out.println(a.getKey() + " > " + a.getValue() );
          
            }
        }
        
        
        public void pintaVxFMapEntry(Map<LocalDate, List<Vuelo>> map) {
            for( Map.Entry<LocalDate, List<Vuelo>> entry : map.entrySet()) {
                System.out.printf(" %s -- > %s\n ", entry.getKey() , entry.getValue()); 
            for(Vuelo vuelo: entry.getValue()) {
                System.out.printf("%s\n", vuelo);
            }
        }
        }
        public void pintaVxF(Map<LocalDate, List<Vuelo>> map) {
            for(LocalDate fecha: map.keySet()) {
                System.out.printf(" %s -- > %s\n ", fecha , map.get(fecha)); //fecha --> vuelo
            for(Vuelo vuelo: map.get(fecha)) {
                System.out.printf("%s\n", vuelo);
            }
        }
            //varios vuelos en una fecha(recorre la lista)
            }

        public void pintaRxD(Map<String, Double> map) {
            for(String destino: map.keySet()) {
                System.out.printf(" %s -- > %s\n ", destino , map.get(destino));  //Destino --> recaudacion
            }
        }
    }






