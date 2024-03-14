package Figura;
public class Cuadrado extends Rectangulo {

    double lado;

    public Cuadrado(Punto punto,double lado) {
        super(punto, lado, lado);
        super.setNombre("cuadrado");
        this.lado = lado;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
