package EventosDeportivos;

import java.util.ArrayList;

public class Equipo {
    private String nombre;
    private ArrayList<Participante> jugadores;

    private int puntos;

    public Equipo(String nombre) {
        this.nombre = nombre;
        this.jugadores = new ArrayList<Participante>();
        this.puntos = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Participante> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Participante> jugadores) {
        this.jugadores = jugadores;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public void añadeJugador(Participante p){
        jugadores.add(p);
    }

    public void eliminaJugador(Participante p) throws ParticipanteNoEncontrado{
        if (jugadores.indexOf(p) == -1){
            throw new ParticipanteNoEncontrado();
        } else {
            jugadores.remove(jugadores.indexOf(p));
        }
    }
}
