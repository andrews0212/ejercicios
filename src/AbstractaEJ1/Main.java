package AbstractaEJ1;

public class Main {
    public static void main(String[] args) {
      Trabajador t1 = new Empleado("Juan", 2000,30000);
    //  Trabajador t1 = new Consultor("Bob", 3000, 500,20);
      Trabajador t2 = new Consultor("Bob", 3000, 500,20);

//+        System.out.printf
//                ("Salario %s -> %d%n", t1.nombre, t1.calcularSalarioAnual());
//        System.out.printf
//                ("Salario %s -> %d%n", t2.nombre, t2.calcularSalarioAnual());


        if (t1 instanceof Empleado)
            System.out.printf
                    ("Salario %s -> %d%n",
                            ((Empleado) t1).nombre,
                            ((Empleado) t1).calcularSalarioAnual());
        if (t1 instanceof Consultor)
            System.out.printf
                    ("Salario %s -> %d%n",
                            ((Consultor) t1).nombre,
                            ((Consultor) t1).calcularSalarioAnual());
    }
}
