package Map.ejercicico2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class palabras {

    public static Map<String, List> PosicionPalabra(List<String> list){

        Map<String, List> map = new HashMap<String, List>();
        
        for (int i = 0; i < list.size(); i++) {

            if (!(map.containsKey(list.get(i)))){
                map.put(list.get(i), new ArrayList<Integer>());
                map.get(list.get(i)).add(i);
            }else{
                map.get(list.get(i)).add(i);
            }
           
        }

        return map;
        
    }
    public static void mostrarMap(Map<String, List> map){
    
        for (Entry<String, List> mp : map.entrySet()) {
             /*  System.out.print(mp.getKey());
              System.out.println(mp.get(mp.getKey()));
            */
        System.out.println(mp.getKey()+ "" + map.get(mp.getKey()));
        }
      }
    
    

    public static void main(String[] args) {

        List<String> palabras = new ArrayList<String>();
        palabras.add("andrews");palabras.add("Jose");palabras.add("andrews");
        mostrarMap(PosicionPalabra(palabras));


    }
}
