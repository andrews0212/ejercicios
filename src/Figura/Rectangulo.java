package Figura;
public class Rectangulo extends Figura{

    private double base;
    private double altura;

    public Rectangulo(Punto punto, double base, double altura) {
        super("rectangulo", punto);
        this.base = base;
        this.altura = altura;
    }

    public boolean comprobarRectangulo(){
        return (this.base != this.altura);
    }

    @Override
    public double calculaArea() {
        return this.base * this.altura;
    }

    @Override
    public double calculaPerimetro() {
        return( this.base + this.base) + (this.altura + this.altura);
    }
}
