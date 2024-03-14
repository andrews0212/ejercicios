package Cuenta;

import java.util.ArrayList;

public class Cuenta {

    // para poder hacer un auto incrremento de numero de cuenta
    // para esto necestiamos un contador que instanciamos a 1 y este sera un contador que tendran todos los objetos en relacion
    // luego en el constructor colocamos el this.numeroCuenta = contador y luego contado++

    static int contador = 100;
    private Titular titular;
    private Fecha fecha;
    private String numeroCuenta;
    private double saldo;
    private ArrayList<Movimiento> ingresosRetiros;


    public void ingresar(double cantidad){
        double saldo = getSaldo();
        saldo += cantidad;
        setSaldo(saldo);
        ingresosRetiros.add(new Movimiento('i',this, cantidad));
    }

    public boolean compararNumeroCuenta(String cuenta){
        if (cuenta.equalsIgnoreCase(getNumeroCuenta())){
            return true;
        }else {
            return false;
        }
    }
    public void reintegro(double cantidad){
        if (getSaldo() > 0){
            if (cantidad <= getSaldo()){
                double saldo = getSaldo();
                saldo -= cantidad;
                setSaldo(saldo);
                ingresosRetiros.add(new Movimiento('r',this, cantidad));
            } else {
                System.out.println("estas retirando mas de lo que tienes");
            }
        } else {
            System.out.println("no tienes saldo");
        }
    }

    // tenemos que hacer el metodo de transferencia bancaria

    public Cuenta(Titular titular, Fecha fecha,String numeroCuenta, double saldo){
        ingresosRetiros = new ArrayList<>();
        this.titular = titular;
        this.fecha = fecha;
        this.numeroCuenta = String.valueOf(contador);
        contador++;
        this.saldo = saldo;
    }
    public Cuenta(String nombre, String apellido , String numeroIdentificacion, int edad, Fecha fecha,String numeroCuenta, double saldo){
        ingresosRetiros = new ArrayList<>();
        this.titular = new Titular(nombre, apellido, numeroIdentificacion, edad);
        this.fecha = fecha;
        this.numeroCuenta = String.valueOf(contador);
        contador++;
        this.saldo = saldo;
    }
    public Cuenta(String nombre, String apellido , String numeroIdentificacion, int edad, int  dia, int mes ,int anio,String numeroCuenta, double saldo){
        ingresosRetiros = new ArrayList<>();
        this.titular = new Titular(nombre, apellido, numeroIdentificacion, edad);
        this.fecha = new Fecha(dia, mes ,anio);
        this.numeroCuenta = String.valueOf(contador);
        contador++;
        this.saldo = saldo;
    }

    // podemos hacer otro constuctor donde se le puede instanciar el titular  que corresponde

    public Cuenta(Titular titular, String numeroCuenta){
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = 1000;
        this.fecha = new Fecha(1,1,2024);
    }

    public ArrayList<Movimiento> getIngresosRetiros() {
        return ingresosRetiros;
    }

    public Titular getTitular() {
        return titular;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String toString(){
        return String.format(" nombre: %s \n apellido: %s \n fecha: %s \n numero de cuenta %s \n saldo: %s", titular.getNombre(), titular.getApellido(), getFecha(), getNumeroCuenta(), getSaldo());
    }

}
