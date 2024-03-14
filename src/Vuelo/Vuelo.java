package Vuelo;

import java.time.LocalDate;

public class Vuelo implements Comparable<Vuelo> {

    private String destino;
    private int precio;
    private int numeroDePlaza;
    private int numeroDePasajero;
    private String pasajero;
    private String codigo;
    private LocalDate Fecha;

    public String getDestino() {
        return destino;
    }

    public int getPrecio() {
        return precio;
    }

    public int getNumeroDePlaza() {
        return numeroDePlaza;
    }

    public int getNumeroDePasajero() {
        return numeroDePasajero;
    }

    public String getPasajero() {
        return pasajero;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }

    @Override
    public int compareTo(Vuelo o) {
        if (this.getFecha().compareTo(o.getFecha()) != 0) {
           return this.getFecha().compareTo(o.getFecha());
        }
        return this.getCodigo().compareTo(o.getCodigo());
    }
}
