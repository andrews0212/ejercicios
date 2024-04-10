package Vuelo;

import java.time.LocalDate;
import java.util.Scanner;
import java.util.Objects;

public class VueloIMP implements Comparable<VueloIMP>, Vuelo {
    private String destino;
    private Double precio;
    private int numeroDePlaza;
    private int numeroDePasajero;
    private String codigo;
    private LocalDate Fecha;
    
    public VueloIMP(String cadena) throws VueloException{
        
        int dia,mes,anio;
        cadena = cadena.replaceAll(" ", "");
        String[] valores = cadena.split(",");
        if (Integer.parseInt(valores[7]) < 2000){
            throw new PosteriorAnioException();
        }else{
            dia = Integer.parseInt(valores[5]);
            mes =Integer.parseInt(valores[6]);
            anio = Integer.parseInt(valores[7]);
            this.Fecha = LocalDate.of(anio, mes, dia);
        }
        this.destino = valores[0];
        this.setPrecio(Double.parseDouble(valores[1]));

        if(Integer.parseInt(valores[2]) < 0){
            throw new NegativoException();
        } else {
            this.numeroDePlaza = Integer.parseInt(valores[2]);
        }

        this.setNumeroPasajero(Integer.parseInt(valores[3]));
        this.codigo = valores[4];
    }



    
    private void setNumeroPasajero(int numero) throws NegativoException, SobrepasoPlazaException {
        if (numero < 0){
            throw new NegativoException();
        }else if (numero > this.numeroDePlaza){
            throw new SobrepasoPlazaException();
        } else {
            this.numeroDePasajero = numero;
        }
    }




    public String getDestino() {
        return destino;
    }

    public Double getPrecio() {
        return precio;
    }

    public int getNumeroDePlaza(){
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
        
        VueloIMP other = (VueloIMP) obj;
        
        if (!this.getDestino().equals(other.getDestino())){
        return false;
        } else if (!this.getCodigo().equals(other.getCodigo())){
        return false;
        }else{
            return true;
        }
    }

    @Override
    public int compareTo(VueloIMP o) {
        if (this.getFecha().compareTo(o.getFecha()) != 0) {
        return this.getFecha().compareTo(o.getFecha());
        }
        return this.getCodigo().compareTo(o.getCodigo());
    }

    @Override
    public String toString() {
        return "Vuelo [destino=" + destino + ", precio=" + precio + ", numeroDePlaza=" + numeroDePlaza
                + ", numeroDePasajero=" + numeroDePasajero + ", codigo=" + codigo + ", Fecha=" + Fecha + "]";
    }

}
