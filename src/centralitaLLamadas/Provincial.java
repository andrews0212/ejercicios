package centralitaLLamadas;

public class Provincial extends Llamadas {

    // como son tres tipos de datos y que sea statico para que no se cree una por objetos
    private int precioFranja1 = 20;
    private int precioFranja2 = 25;
    private int precioFranja3 = 30;

    public Provincial(String numeroOrigen, String numeroDestino, double duracion) throws LlamadaTelefonica {
        super(numeroOrigen, numeroDestino, duracion);
    }

    @Override
    public double coste() {
        switch (super.getFecha().getDayOfWeek().getValue()) {
            case 1, 2, 3, 4, 5: {
                if (super.getFecha().getHour() >= 7 && super.getFecha().getHour() <= 14) {
                    return (double) super.getDuracion() * this.precioFranja1;
                } else if (super.getFecha().getHour() >= 15 && super.getFecha().getHour() <= 22) {
                    return (double) super.getDuracion() * this.precioFranja2;
                }
            }
            case 6, 7: {
                if (super.getFecha().getHour() >= 7 && super.getFecha().getHour() <= 14) {
                    return (double) super.getDuracion() * this.precioFranja3;
                }
            }
        }
        return 0;
    }

}
