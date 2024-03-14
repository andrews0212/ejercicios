package centralitaLLamadas;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public abstract class Llamadas {

    private String numeroOrigen;
    private String numeroDestino;


    // La fecha seria mejor colocarlo en la propia llamada provincial
    private LocalDateTime fecha;
    private double duracion;


    public Llamadas(String numeroOrigen, String numeroDestino, double duracion) throws LlamadaTelefonica {
        if (numeroOrigen == null || numeroOrigen.isBlank() || numeroOrigen.isEmpty()){
            throw new OrigenLlamadaTelefonica();
        }
        this.numeroOrigen = numeroOrigen;
        if (numeroDestino == null || numeroDestino.isEmpty() || numeroDestino.isBlank()){
            throw new DestinoLlamadaTelefonica();
        }
        this.numeroDestino = numeroDestino;
        this.duracion = duracion;
        LocalTime t = LocalTime.now();
        LocalDate f = LocalDate.now();
        fecha = LocalDateTime.of(f, t);
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getNumeroOrigen() {
        return numeroOrigen;
    }

    public void setNumeroOrigen(String numeroOrigen) {
        this.numeroOrigen = numeroOrigen;
    }

    public String getNumeroDestino() {
        return numeroDestino;
    }

    public void setNumeroDestino(String numeroDestino) {
        this.numeroDestino = numeroDestino;
    }

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public abstract double coste();
}
