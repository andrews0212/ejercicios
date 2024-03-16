package Vuelo;

public class SobrepasoPlazaException extends VueloException {

    public SobrepasoPlazaException(){
        super("ha sobrepasado el numero de pasajero el numero de plaza");
    }
    public SobrepasoPlazaException(String msg){
        super(msg);
    }
    
}
