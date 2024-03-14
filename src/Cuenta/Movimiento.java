package Cuenta;

import java.util.ArrayList;

public class Movimiento {

    private Cuenta cuenta;
    private Fecha fecha;
    private char tipoMovimiento;
    private double saldo;
    private double importe;


    public Movimiento(char tipoMovimiento, Cuenta cuenta, double importe){
        this.cuenta = cuenta;
        this.fecha = cuenta.getFecha();
        this.tipoMovimiento = tipoMovimiento;
        this.saldo = this.cuenta.getSaldo();
        this.importe = importe;
    }

    public String toString(){
        return String.format("tipo de movimiento: %s saldo: %s importe: %s", tipoMovimiento, saldo, importe);
    }
}
