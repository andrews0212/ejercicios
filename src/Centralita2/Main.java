package Centralita2;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        IMP_Centralita c = new IMP_Centralita();

        Llamada l1 = new Local("1232312", "12344124", 14);
        Llamada l2 = new Provincial("1232312", "12344124", 16, Franja.FRANJA1);
        Llamada l3 = new Local("12121212", "12344124", 19);
        c.hacerLlamada(l1);
        c.hacerLlamada(l2);
        c.hacerLlamada(l3);
        System.out.println(Arrays.toString(c.getRegistroLlamadas().toArray()));
        System.out.println(c.getCosteTotal());
        c.hacerLlamada(l3);
        System.out.println(c.getCosteTotal());
        System.out.println(c.buscarLLamadaPorOrigen("12121212"));
        System.out.println(c.getRegistroLlamadas().indexOf(new Provincial("1232312", null, 0, null)));

    }
}
