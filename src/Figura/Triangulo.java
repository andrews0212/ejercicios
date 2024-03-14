package Figura;
public class Triangulo extends Figura{

    public Punto punto1;
    public Punto punto2;

    public Triangulo(String nombre, Punto punto, Punto punto1, Punto punto2) {
        super(nombre, punto);
        double a, b, c;

        a = calcularLado(punto, punto1);
        b = calcularLado(punto1, punto2);
        c = calcularLado(punto2, punto);
        if (esTriangulo(a, b, c)){
            this.punto1 = punto1;
            this.punto2 = punto2;
        } else {
            throw new IllegalArgumentException("Los lados proporcionados no forman un triángulo.");
        }
    }

    public Triangulo(String nombre, int x1, int y1, int x2, int y2, int x3, int y3) {
        super(nombre, x1, y1);
        double a, b, c;
        Punto punto1 = new Punto(x2, y2);
        Punto punto2 = new Punto(x3, y3);
        a = calcularLado(super.getPunto(), punto1);
        b = calcularLado(punto1, punto2);
        c = calcularLado(punto2, super.getPunto());
        if (esTriangulo(a, b, c)){
            this.punto1 = punto1;
            this.punto2 = punto2;
        } else {
            throw new IllegalArgumentException("Los lados proporcionados no forman un triángulo.");
        }
    }

    private double calcularLado(Punto punto, Punto punto2){
        return Math.sqrt((punto2.getX() - punto.getX()) + (punto2.getY() - punto.getY()));

    }
    private boolean esTriangulo(double lado1, double lado2, double lado3) {
        // Verificar si los lados pueden formar un triángulo según la desigualdad triangular
        return (lado1 + lado2 > lado3) && (lado1 + lado3 > lado2) && (lado2 + lado3 > lado1);
    }

    private double calcularSemiperimetro(){
        double a, b, c;
        a = calcularLado(super.getPunto(), this.punto1);
        b = calcularLado(this.punto1, this.punto2);
        c = calcularLado(this.punto2, super.getPunto());
        return (a + b + c) / 2;
    }

    @Override
    public double calculaArea() {
        double a, b, c, s;
        a = calcularLado(super.getPunto(), this.punto1);
        b = calcularLado(this.punto1, this.punto2);
        c = calcularLado(this.punto2, super.getPunto());
        s = calculaPerimetro();
        return (Math.sqrt(s * ((s - a) * (s - b) * (s - c))));
    }

    @Override
    public double calculaPerimetro() {
        double a, b, c;
        a = calcularLado(super.getPunto(), this.punto1);
        b = calcularLado(this.punto1, this.punto2);
        c = calcularLado(this.punto2, super.getPunto());
        return a + b + c;
    }
}
