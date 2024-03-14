package EventosDeportivos;

import java.time.LocalDate;
import java.util.ArrayList;

public abstract class EventoDeportivo implements Ganador{


    // Atributos
    private String nombre;
    private LocalDate fecha;

    private String Lugar;

    private ArrayList<Participante> participantes;


    //Constructores

    public EventoDeportivo(String nombre, LocalDate fecha, String lugar) {
        this.nombre = nombre;
        this.fecha = fecha;
        Lugar = lugar;
        this.participantes = new ArrayList<Participante>();
    }
    public EventoDeportivo(String nombre, LocalDate fecha, String lugar, ArrayList<Participante> participantes) {
        this.nombre = nombre;
        this.fecha = fecha;
        Lugar = lugar;
        this.participantes.addAll(participantes);
    }

    public EventoDeportivo(String nombre, int dia, int mes, int anio, String lugar) {
        this.nombre = nombre;
        this.fecha = LocalDate.of(anio,mes,dia);
        Lugar = lugar;
        this.participantes = new ArrayList<Participante>();
    }

    //getter y setter


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getLugar() {
        return Lugar;
    }

    public void setLugar(String lugar) {
        Lugar = lugar;
    }

    public ArrayList<Participante> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Participante> participantes) {
        this.participantes = participantes;
    }

    // metodo inscribirParticipante

    public void inscribirParticipante(Participante participante){

        participantes.add(participante);

    }
    public abstract Participante obtenerGanador() ;
}
