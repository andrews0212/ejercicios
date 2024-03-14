package EventosDeportivos;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;

public class Carrera extends EventoDeportivo{

    // Atributo
    private double distancia;

    //Constructor

    public Carrera(String nombre, LocalDate fecha, String lugar, double distancia) {
        super(nombre, fecha, lugar);
        this.distancia = distancia;
    }

    public Carrera(String nombre, LocalDate fecha, String lugar, ArrayList<Participante> participantes, double distancia) {
        super(nombre, fecha, lugar, participantes);
        this.distancia = distancia;
    }

    public Carrera(String nombre, int dia, int mes, int anio, String lugar, double distancia) {
        super(nombre, dia, mes, anio, lugar);
        this.distancia = distancia;
    }

    @Override
    public Participante obtenerGanador() {

        ArrayList<Corredores> corredores = new ArrayList<Corredores>();
        for (int i = 0; i < this.getParticipantes().size(); i++) {
            if (this.getParticipantes().get(i) instanceof Corredores) {
            corredores.add((Corredores)this.getParticipantes().get(i));
            }
        }

      return Collections.min(corredores, new ComparadorTiempo());

    }

    }

