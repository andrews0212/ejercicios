package Centralita2;

public enum Franja {
    FRANJA1(0.20), FRANJA2(0.25), FRANJA3(0.30);

    private double precio;
    Franja(double precio) {
        this.precio = precio;
    }

    double getPrecio(){
        return precio;

    }



}
