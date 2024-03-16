package Vuelo;

public class VueloException extends Exception{


    public VueloException() {
        super("Error en el vuelo : ");
    }
    public VueloException(String msg) {
        super(" Error en el vuelo : " + msg);
    }
    
}
