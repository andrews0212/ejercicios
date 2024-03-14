package Sorteo;

public class Moneda extends Sorteo{
    public Moneda(int posibilidades) {
        super(posibilidades);
    }

    public String lanzar(){
        int rdm = (int) (Math.random()*super.posibilidades);
        return String.valueOf(opcionesPPT[rdm]);
    }
}


