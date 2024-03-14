package centralitaLLamadas;

public class DestinoLlamadaTelefonica extends LlamadaTelefonica{
    public DestinoLlamadaTelefonica() {
        super("Error en el destino");
    }

    public DestinoLlamadaTelefonica(String message) {
        super("Error en el destino" + message);
    }
}
