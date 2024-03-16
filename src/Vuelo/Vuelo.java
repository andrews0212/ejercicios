package Vuelo;

import java.time.LocalDate;

public interface Vuelo {
    String getDestino();
    Double getPrecio();
    int getNumeroDePlaza() throws NegativoException;
    int getNumeroDePasajero();
    LocalDate getFecha();
    String getCodigo();
    void setPrecio(Double precio);

}
