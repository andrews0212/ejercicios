package centralitaLLamadas;

import centralitaLLamadas.UI.Interfaz1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test {
    public static void main(String[] args) {
        Centralita c = new Centralita();
        try{
        Llamadas local = new Local("1213", null, 12.2);
        } catch (LlamadaTelefonica e) {
            System.out.println(e);
        }




}
}
