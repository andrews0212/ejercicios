package centralitaLLamadas;

public class OrigenLlamadaTelefonica extends LlamadaTelefonica{
    public OrigenLlamadaTelefonica() {
        super("Error en el origen");
    }

    public OrigenLlamadaTelefonica(String message) {
        super("Error en el origen" + message);
    }
}
