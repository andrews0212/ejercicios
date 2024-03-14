package Collec;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ListaValores list = new ListaValores(6);
        ListaValores list2 = new ListaValores(6);
        list.AñadirElementos(list2);

        System.out.println(list.getEnteros().size());
        list.MostrarArray();
        list.MayorMenor();
        list.MostrarArray();
//        System.out.println(list.CuentaVecesValor(1));
//        list.MostrarArray();
//        System.out.println(list.sumaValores());
//        System.out.println(list.todosMayores(2));
//        System.out.println(list.dameMayor());
//        System.out.println(list.dameMenor());
//        System.out.println(Arrays.toString(list.DameValorEntre(2,3).toArray()));
    }
}
