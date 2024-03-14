package Cuenta;



public class Main {
    public static void main(String[] args) {
        Titular titular = new Titular("andrews", "Dos Ramos", "12342414" ,18);
        Cuenta cuenta = new Cuenta(titular, new Fecha(02,12,2002) , "ES00000000000", 2000 );
        cuenta.reintegro(1000);
        System.out.println(cuenta.getIngresosRetiros().get(0));
    }
}
