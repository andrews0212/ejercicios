package centralitaLLamadas;

public class FranjaLLamada extends LlamadaTelefonica{
    public FranjaLLamada() {
    super("Error en la franja");
   }

    public FranjaLLamada(String message) {
        super("Error en la franja" + message);
    }
}
