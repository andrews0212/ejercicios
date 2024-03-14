package Herencia;

public class Main {

    public static void main(String[] args) {
        Madre madre = new Madre("Ana");
        Hija hija = new Hija("Ana", "Maria", 20);

        System.out.println(hija.getNombreMadre()); // Salida: Ana
        System.out.println(hija.getNombre());  // Salida: Maria
    }
}