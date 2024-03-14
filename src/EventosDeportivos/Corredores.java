package EventosDeportivos;

public class Corredores extends Participante{

    private int tiempo;
    public Corredores(String nombre, String apellido, String edad, int tiempo) {
        super(nombre, apellido, edad);
        this.tiempo = tiempo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return super.toString()  +
                "tiempo=" + tiempo +
                '}';
    }
}
