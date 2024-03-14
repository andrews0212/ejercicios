package Figura;
public abstract class Figura implements Comparable<Figura> {

    private String nombre;
    private Punto punto;

    public Figura(String nombre, Punto punto) {
        this.nombre = nombre;
        this.punto = punto;
    }

    public Figura(String nombre, int x, int y) {
        this.nombre = nombre;
        this.punto = new Punto(x,y);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Punto getPunto() {
        return punto;
    }

    public void setPunto(Punto punto) {
        this.punto = punto;
    }

    @Override
    public int compareTo(Figura o) {
       String valor1 = String.valueOf(this.calculaArea());
       String valor2 = String.valueOf(o.calculaArea());
       return valor1.compareTo(valor2);

    }

    @Override
    public String toString() {
        return "\n" + this.getNombre() + "  (" + this.getPunto().x + "," + this.getPunto().y + ")" + " area : " + calculaArea() + " perimetro : " + calculaPerimetro();
    }

    public abstract double calculaPerimetro();
    public abstract double calculaArea();
}
