package AbstractaEJ1;

public class Consultor extends Trabajador {
    public int HorasTrabajadas;
    public int PrecioHora;

    public Consultor(String nombre, int bonus, int HorasTrabajadas, int PrecioHora) {
        super(nombre, bonus);
        this.HorasTrabajadas = HorasTrabajadas;
        this.PrecioHora = PrecioHora;
    }

    public int calcularSalarioAnual() {
        return bonus + PrecioHora * HorasTrabajadas;
    }
}
