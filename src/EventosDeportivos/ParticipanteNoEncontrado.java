package EventosDeportivos;

public class ParticipanteNoEncontrado extends Exception{

    public ParticipanteNoEncontrado() {
        super("Participante no encontrado");
    }

    public ParticipanteNoEncontrado(String message) {
        super(message);
    }
}
