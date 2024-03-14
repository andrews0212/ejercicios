package EventosDeportivos;

import java.time.LocalDate;
import java.util.ArrayList;

public class TorneoDeFutbol extends EventoDeportivo{

    private ArrayList<Equipo> Equipos;


    public TorneoDeFutbol(String nombre, LocalDate fecha, String lugar, ArrayList<Equipo> equipos) {
        super(nombre, fecha, lugar);
        Equipos = equipos;
    }

    public TorneoDeFutbol(String nombre, LocalDate fecha, String lugar, ArrayList<Participante> participantes, ArrayList<Equipo> equipos) {
        super(nombre, fecha, lugar, participantes);
        Equipos = equipos;
    }

    public TorneoDeFutbol(String nombre, int dia, int mes, int anio, String lugar, ArrayList<Equipo> equipos) {
        super(nombre, dia, mes, anio, lugar);
        Equipos = equipos;
    }

    @Override
    public Participante obtenerGanador() {
        return null;
    }
}
