package Competicion;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Competicion {

    private List<Equipo> equipos;

    public Competicion(){
        equipos = new ArrayList<>();
    }

    public void cargarEquipo() throws IOException{
        File file = new File("./src/Competicion/equipoParticipante.txt");
        FileReader fr = new FileReader(file);
        BufferedReader br = new BufferedReader(fr);
        Scanner sc;
        String linea = br.readLine();
        sc = new Scanner(linea).useDelimiter("\\s*,\\s*");

        while (linea != null) {
            
            while (sc.hasNextLine()){
                String nombre = sc.next();
                equipos.add(new Equipo(nombre, 0, 0));
            }   
            
            linea = br.readLine();

        }
    }

    public String equipoParticipante(){

      String participantes = "";
      int contador = equipos.size();
      
      for (Equipo equipo : equipos) {
        participantes += equipo.getNombre();
        contador --;
        if (contador != 0){
            participantes += ", ";
        }
      }
      return participantes;
            
        
    }



    private void pintaGF(Map<String, Integer> map){
        for(Map.Entry<String, Integer> valor : map.entrySet()){
            System.out.println();
            System.out.println(valor.getKey() + " -> " + valor.getValue());
        }
    }


    public Map<String, Integer> GolesVisitantes() throws IOException{
        Map<String, Integer> mapGoles = new TreeMap<>();
        Map<String, List<String>> mapResultado = resultados();
        int GolesFavor = 0;
        int contador = 0;
        for (Map.Entry<String, List<String>> mp1 : mapResultado.entrySet()){
            for (Map.Entry<String, List<String>> mp2 : mapResultado.entrySet()) {
                if (mp2.getKey().equals(mp1.getKey())){
                    continue;
                }
                if (mp2.getValue().get(contador).equals("*") || mp2.getValue().get(contador).equals("-")){
                    continue;
                } 
                GolesFavor += Integer.parseInt(mp2.getValue().get(contador).split("-")[1]);
                
            }
            contador++;
            mapGoles.put(mp1.getKey(), GolesFavor);
            GolesFavor = 0;


    }
    pintaGF(mapGoles);
    return mapGoles;
}

    public Map<String, Integer> GolesLocales() throws IOException{
        Map<String, Integer> mapGoles = new TreeMap<>();
        Map<String, List<String>> mapResultado = resultados();
        int GolesFavor = 0;

        // esto es para lo goles en local
        for (Map.Entry<String, List<String>> mp : mapResultado.entrySet()) {
            for (int i = 0; i < mp.getValue().size(); i++) {
                if (mp.getValue().get(i).equals("*") || mp.getValue().get(i).equals("-")){
                    continue;
                }   
                GolesFavor +=  Integer.parseInt(mp.getValue().get(i).split("-")[0]);
            }
        
           
           

            mapGoles.put(mp.getKey(), GolesFavor);
            GolesFavor = 0;

        }

        pintaGF(mapGoles);
        return mapGoles;

    }

    public Map<String, Integer> GolesTotales() throws IOException{
        Map<String, Integer> mpv = GolesVisitantes();
        Map<String, Integer> mpl = GolesLocales();
        Map<String, Integer> mpt = new TreeMap<>();

        for (Map.Entry<String, Integer> mp : mpv.entrySet()) {
            mpt.put(mp.getKey(), mp.getValue());
        }
        for (Map.Entry<String, Integer> mp : mpl.entrySet()) {
            mpt.put(mp.getKey(), mpt.get(mp.getKey()) + mp.getValue());
        }

        pintaGF(mpt);
        return mpt;
    }

    public Map<String, Integer> GolesEnContra() throws IOException{
        Map<String, Integer> mpc = new TreeMap<>();
        Map<String, List<String>> mapResultado = resultados();
        int GolesEnCont = 0;
           // esto es para lo goles en local
           for (Map.Entry<String, List<String>> mp : mapResultado.entrySet()) {
            for (int i = 0; i < mp.getValue().size(); i++) {
                if (mp.getValue().get(i).equals("*") || mp.getValue().get(i).equals("-")){
                    continue;
                }   
                GolesEnCont +=  Integer.parseInt(mp.getValue().get(i).split("-")[1]);
            }
        
           
           

            mpc.put(mp.getKey(), GolesEnCont);
            GolesEnCont = 0;

        }
        int contador = 0;
        for (Map.Entry<String, List<String>> mp1 : mapResultado.entrySet()){
            for (Map.Entry<String, List<String>> mp2 : mapResultado.entrySet()) {
                if (mp2.getKey().equals(mp1.getKey())){
                    continue;
                }
                if (mp2.getValue().get(contador).equals("*") || mp2.getValue().get(contador).equals("-")){
                    continue;
                } 
                GolesEnCont += Integer.parseInt(mp2.getValue().get(contador).split("-")[1]);
                
            }
            contador++;
            mpc.put(mp1.getKey(), mpc.get(mp1.getKey()) + GolesEnCont);
            GolesEnCont = 0;
        }

        pintaGF(mpc);
        return mpc;

    }

    // hay que hacer un map de puntos
    public Map<String, Integer> Puntuacion() throws IOException{
        Map<String, Integer> mapPuntaje = new TreeMap<>();
        int puntaje = 0;
        for (Map.Entry<String, List<String>> equipo : resultados().entrySet()) {
           
            for (int i = 0; i < equipo.getValue().size(); i++) {
                if (equipo.getValue().get(i).equals("*") || equipo.getValue().get(i).equals("-")){
                    continue;
                }   
                if (Integer.parseInt(equipo.getValue().get(i).split("-")[0]) > Integer.parseInt(equipo.getValue().get(i).split("-")[1])){
                    puntaje += 3;
                } else if (Integer.parseInt(equipo.getValue().get(i).split("-")[0]) == Integer.parseInt(equipo.getValue().get(i).split("-")[1])){
                    puntaje += 1;
                }
            }
            mapPuntaje.put(equipo.getKey(), puntaje);
            puntaje = 0;
        }
      
        int contador = 0;
        for (Map.Entry<String, List<String>> equipo : resultados().entrySet()){
            for (Map.Entry<String, List<String>> mp2 : resultados().entrySet()) {
            if (mp2.getKey().equals(equipo.getKey())){
                continue;
            }
            if (mp2.getValue().get(contador).equals("*") || mp2.getValue().get(contador).equals("-")){
                continue;
            } 
            Integer valor1 = Integer.parseInt(mp2.getValue().get(contador).split("-")[0]);
            Integer valor2 = Integer.parseInt(mp2.getValue().get(contador).split("-")[1]);
            if (valor1 == valor2){
                puntaje += 1;
            } else if (valor1 < valor2){
                puntaje += 3;
            }
        }
        contador++;
        mapPuntaje.put(equipo.getKey(), mapPuntaje.get(equipo.getKey()) + puntaje);
        puntaje = 0;
        }
    
        
        pintaGF(mapPuntaje);
        return mapPuntaje;
    }



    public Map<String, List<String>> resultados() throws IOException{
        String[] valores;
        File file = new File("./src/Competicion/resultados.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bf = new BufferedReader(fileReader);
        bf.readLine();
        String linea = bf.readLine();
        Map<String, List<String>> map = new TreeMap();
        int contador = 0;
        while (linea != null){
            if (!map.containsKey(equipos.get(contador).getNombre())){
                    map.put(equipos.get(contador).getNombre(), new ArrayList<>());
                }
                valores = linea.split("\t");

                for (String valor : valores) {
                    if (!valor.equals(valores[0]))
                        map.get(equipos.get(contador).getNombre()).add(valor.trim());        
                }
                contador++;
                linea = bf.readLine();
               
            }

        return map;
       
     }

     
 
    @Override
    public String toString() {
        return "Competicion [equipos=" + equipos + "]";
    }


}
