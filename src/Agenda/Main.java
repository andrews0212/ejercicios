package Agenda;

public class Main {
    public static void main(String[] args) {
        Agenda a = new Agenda();
        a.añadirAmigo("javier", "roldan", 21312312, "safsasf");
        a.añadirAmigo("<zorro>", "qlq", 21312312, "safsasf");
        a.añadirAmigo("<andrews>", "Dosramos", 21312312, "safsasf");
//        System.out.println(a.toString());
//
//        a.getAgenda().sort(null);
//        System.out.println(a.toString());
//
            Amigo amigo1 = new Amigo("andrews", 23123);
//
//        Amigo amigo3 = new Amigo("and12321rews", 23231123);
//        System.out.println(amigo1.equals(amigo3));

//        System.out.println(a.mostrarAmigos("javier"));

        System.out.println(amigo1);
        try {
            Amigo amigo2 = (Amigo) amigo1.clone();
            System.out.println(amigo2);
        } catch (Exception e){

        }

    }
}
