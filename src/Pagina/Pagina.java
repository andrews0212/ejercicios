package Pagina;

import java.util.ArrayList;

public class Pagina {
    private int dia;
    private int mes;

    private ArrayList<Cita> citas;
    private Agenda agenda;

    public Pagina(int dia, int mes) {
        this.dia = dia;
        this.mes = mes;
        citas = new ArrayList<>();

    }

    public void agregarCita(Cita cita){
        String minutos;
        minutos = "";
        if (cita.getMinutos() % 5 != 0) {
            minutos = String.valueOf(cita.getMinutos());
            if (minutos.length() == 1) {
                minutos = "0" + minutos;
            }
            if (Integer.parseInt(String.valueOf(minutos.charAt(1))) <= 2 && Integer.parseInt(String.valueOf(minutos.charAt(1))) >= 0) {
                minutos = String.valueOf(minutos.charAt(0)) + "0";
                cita.setMinutos(Integer.parseInt(minutos));
            } else if (Integer.parseInt(String.valueOf(minutos.charAt(1))) >= 3 && Integer.parseInt(String.valueOf(minutos.charAt(1))) <= 5) {
                minutos = String.valueOf(minutos.charAt(0)) + "5";
                cita.setMinutos(Integer.parseInt(minutos));
            } else if (Integer.parseInt(String.valueOf(minutos.charAt(1))) <= 7 && Integer.parseInt(String.valueOf(minutos.charAt(1))) >= 5) {
                minutos = String.valueOf(minutos.charAt(0)) + "5";
                cita.setMinutos(Integer.parseInt(minutos));
            } else if (Integer.parseInt(String.valueOf(minutos.charAt(1))) >= 8 && Integer.parseInt(String.valueOf(minutos.charAt(0))) != 5) {
                minutos = String.valueOf((Integer.parseInt(String.valueOf(minutos.charAt(0))) + 1)) + "0";
                cita.setMinutos(Integer.parseInt(minutos));
            } else if (Integer.parseInt(String.valueOf(minutos.charAt(1))) >= 8 && Integer.parseInt(String.valueOf(minutos.charAt(0))) == 5 && cita.getHora() != 23) {
                minutos = String.valueOf("00");
                cita.setHora(cita.getHora() + 1);
                cita.setMinutos(Integer.parseInt(minutos));
            } else if (Integer.parseInt(String.valueOf(minutos.charAt(1))) >= 8 && Integer.parseInt(String.valueOf(minutos.charAt(0))) == 5 && cita.getHora() == 23) {
                minutos = String.valueOf("00");
                cita.setHora(00);
                cita.setMinutos(Integer.parseInt(minutos));
            }

        }

        citas.add(cita);
    }

    public void borrarCita(Cita cita){

        citas.remove(cita);
    }

    public void mostrarCitas(){
        for (int i = 0; i < citas.size(); i++) {
            System.out.println(citas.get(i).getHora()+ " : "+ citas.get(i).getMinutos() + " " + citas.get(i).getTitulo());
        }

    }
    public int buscarCita(int hora, int min){

        for (int i = 0; i < citas.size(); i++) {
            if( hora == this.citas.get(i).getHora() && min == this.citas.get(i).getMinutos()){
                System.out.println(this.citas.get(i).getHora() + ":"+ this.citas.get(i).getMinutos() + " " + this.citas.get(i).getTitulo());
              return i;
            }
        }
        return -1;
    }



}
