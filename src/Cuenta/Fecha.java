package Cuenta;

import java.time.LocalDate;
import java.time.chrono.ChronoLocalDate;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Fecha {
    private LocalDate localDate;
    private Calendar calendar;

    private int dia;
    private int mes;
    private int anio;

    public boolean comprobarMes(int mes){
        if (mes > 0 && mes <= 12) {
        return true;
        }
        return false;
    }

    public boolean comprobarFecha(int dia, int mes, int anio) {
        if (comprobarMes(mes)) {
            if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
                if (dia > 0 && dia <= 31) {
                    return true;
                } else {
                    return false;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

                if (dia > 0 && dia <= 30) {
                    return true;
                } else {
                    return false;
                }
            } else if (mes == 2) {
                if (comprobarBisiesto(anio)){
                    return true;
                } else{
                    return false;
                }

            }
        }
        return false;
    }
    public boolean comprobarBisiesto(int anio){
        if (anio % 4 == 0 || anio % 4 == 0 && anio % 100 != 0 || anio % 100 == 0 && anio % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public Fecha(int dia, int mes, int anio) {

        if (comprobarFecha(dia, mes ,anio)){
            setDia(dia);
            setAnio(anio);
            setMes(mes);
        } else {
            System.out.println("Fecha erronea");
        }

        this.localDate = LocalDate.of(anio, mes, dia);
        this.calendar = new GregorianCalendar(anio, mes - 1, dia);

    }


    public LocalDate getLocalDate() {
        return localDate;
    }

    public void setLocalDate(LocalDate localDate) {
        this.localDate = localDate;
    }

    public Calendar getCalendar() {
        return calendar;
    }

    public void setCalendar(Calendar calendar) {
        this.calendar = calendar;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public String toString(){
        return String.format("%s",localDate);
    }
}
