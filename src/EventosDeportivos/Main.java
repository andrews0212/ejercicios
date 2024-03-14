package EventosDeportivos;

public class Main {
    public static void main(String[] args) {
        EventoDeportivo e = new Carrera("evento1",02, 12, 2002, "Madrid", 120);
        Participante p1 = new Corredores("jugador1", "perez", "12", 120);
        Participante p2 = new Corredores("jugador2", "perez", "12", 110);
        Participante p3 = new Corredores("jugador3", "perez", "12", 20);
        Participante p4 = new Corredores("jugador4", "perez", "12", 90);
        e.getParticipantes().add(p1);
        e.getParticipantes().add(p2);
        e.getParticipantes().add(p3);
        e.getParticipantes().add(p4);

        System.out.println(e.obtenerGanador());


    }
}
