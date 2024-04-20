package Ajedrez;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;


/**
 * @author:Andrews Dos Ramos
 * @version: 1
 */

public class PartidaAjedrez {

    static Map<String, String> partida = new HashMap<>();

    
    /** 
     * metodo que te devuelve un map con el ficha  y su valor
     * @return Map<Character, Integer>
     */
    public static Map<Character, Integer> Puntuacion(){
        Map<Character, Integer> valores = new HashMap<>();
        valores.put('D', 9);
        valores.put('T', 5);
        valores.put('A', 4);
        valores.put('C', 4);
        valores.put('P', 1);
        valores.put('R', 4);
        valores.put('-', 0);
        return valores;
    }

    
    /** 
     *
     * Devuelve un map con el valor que tienen las fichas blancas y negras
     * 
     * @return Map<Character,Integer>
     * 
     * 
     * 
     */
    
    public static Map<Character, Integer> valorPiezas(){

        Map<String, String> fichas = new HashMap<>();
        Map<Character, Integer> valor = new HashMap<>();

            for (Map.Entry<String, String> mp : partida.entrySet()) {

                valor.put(mp.getValue().toString().charAt(1), valor.getOrDefault(mp.getValue().toString().charAt(1), 0) + Puntuacion().get(mp.getValue().toString().toUpperCase().charAt(0)));
            }
            return valor;
    }

    
    /** 
     * @throws FileNotFoundException
     */
    /* 
     * lee el fichero ajedres.txt y almacena las fichas de un MAP<Posicion, FICHA>
     * 
    */

    public static void entrada() throws FileNotFoundException{
        char[] posicionLetra ={'a','b','c','d','e','f','g','h'};
        Scanner sc = new Scanner(new File("./src/ajedres.txt"));
        String linea;
        int contador = 0;
        int j = 8;
        
        
        while (sc.hasNextLine()){
            linea = sc.nextLine();
            linea = linea.replaceAll(" ", "");
            String[] fichas = linea.split(",");
            String posicion;
            
            
            for(int i = 0; i < posicionLetra.length; i++){
                posicion = posicionLetra[i] + "" + j;
                partida.put(posicion, fichas[i].toUpperCase());
            } 

            j--;
        }
       
    }

    /*
     * 
     * Muestra la posicion de las fichas del tablero
     * 
     * 
     */

    public static void mostrarMapPartida(){
        for (Map.Entry mp : partida.entrySet()) {
            System.out.println(mp.getKey() + " --> "+ mp.getValue());
        }
    }
    public static void mostrarMapValores(){
        for (Map.Entry mp : valorPiezas().entrySet()) {
            if (!mp.getKey().toString().equals("-"))
            System.out.println(mp.getKey() + " --> "+ mp.getValue());
        }
    }




    public static void main(String[] args) throws FileNotFoundException {

        entrada();
      //  mostrarMapPartida();
        valorPiezas();
        mostrarMapValores();
        


   



    }
}
