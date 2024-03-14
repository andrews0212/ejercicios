package Sorteo;

public class Dado extends Sorteo{
    public Dado(int posibilidades) {
        super(posibilidades);
    }

    public String lanzar(){
    int numero = (int) (Math.random()*super.posibilidades) -1;
    return String.valueOf(numero);
    }
}
