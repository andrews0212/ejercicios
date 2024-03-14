package Figura;

public class Circulo extends Figura{
    double radio;

    public Circulo( Punto punto, double radio) {
        super("ciculo", punto);
        this.radio = radio;
    }

    public Circulo( int x, int y, double radio) {
        super("ciculo", x, y);
        this.radio = radio;
    }

    public double calculaArea(){
        return (Math.PI * Math.pow(radio, 2));
    }

    public double calculaPerimetro(){
        return ((2 + Math.PI) * radio);
    }
}
