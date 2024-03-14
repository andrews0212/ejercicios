package Feria;

public class AlturaMaximaNoValida extends PuertaException{


    /*
    *
    *  public alturaMaxima extends alturaException {
    *
    * public alturaMaxima(int altura, int alturaMaxima){
    * super("sobre pasa la altura" alturaMaxima - altura)
    *
    * }
    *
    *
    *
    * */
    public AlturaMaximaNoValida() {
        super("La Altura Maxima no es validad");
    }

    public AlturaMaximaNoValida(String message) {
        super(message);
    }
}
