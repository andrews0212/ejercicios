package AbstractaEJ1;

public class Empleado extends Trabajador {
    public int salarioBase;
    public Empleado(String nombre, int bonus, int salarioBase) {
        super(nombre, bonus);
        this.salarioBase = salarioBase;
    }

    public int calcularSalarioAnual () {
        return salarioBase + bonus;
    }
}
