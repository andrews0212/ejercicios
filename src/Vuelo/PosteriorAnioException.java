package Vuelo;

public class PosteriorAnioException extends VueloException {
    
    public PosteriorAnioException(){
        super("El año es posterior al 2000");
    }
    public PosteriorAnioException(String msg){
        super(msg);
    }

}
