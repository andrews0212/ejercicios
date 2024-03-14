package Vuelo;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Objects;

public class Vuelo implements Comparable<Vuelo> {

    private String destino;
    private Double precio;
    private int numeroDePlaza;
    private int numeroDePasajero;
    private String codigo;
    private LocalDate Fecha;

    public Vuelo(String cadena) {
        int dia,mes,anio;
        cadena = cadena.replaceAll(" ", "");
        String[] valores = valores = cadena.split(",");
        dia = Integer.parseInt(valores[5]);
        mes =Integer.parseInt(valores[6]);
        anio = Integer.parseInt(valores[7]);
        this.destino = valores[0];
        this.precio = Double.parseDouble(valores[1]) ;
        this.numeroDePlaza = Integer.parseInt(valores[2]);
        this.numeroDePasajero = Integer.parseInt(valores[3]);
        this.codigo = valores[4];
        this.Fecha = LocalDate.of(anio, mes, dia);
    }

    


    public String getDestino() {
        return destino;
    }

    public Double getPrecio() {
        return precio;
    }

    public int getNumeroDePlaza() {
        return numeroDePlaza;
    }

    public int getNumeroDePasajero() {
        return numeroDePasajero;
    }

    public LocalDate getFecha() {
        return Fecha;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((destino == null) ? 0 : destino.hashCode());
        result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
        result = prime * result + ((Fecha == null) ? 0 : Fecha.hashCode());
        return result;
    }




    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass())  return false;
        
        Vuelo other = (Vuelo) obj;
        
        if (destino == null) {
            if (other.destino != null)
                return false;
        } else if (!destino.equals(other.destino))
            return false;
        if (codigo == null) {
            if (other.codigo != null)
                return false;
        } else if (!codigo.equals(other.codigo))
            return false;
        if (Fecha == null) {
            if (other.Fecha != null)
                return false;
        } else if (!Fecha.equals(other.Fecha))
            return false;
        return true;
    }




    @Override
    public int compareTo(Vuelo o) {
        if (this.getFecha().compareTo(o.getFecha()) != 0) {
        return this.getFecha().compareTo(o.getFecha());
        }
        return this.getCodigo().compareTo(o.getCodigo());
    }
    

    
}
