package Pagina;

public class Ges {
    static Agenda agenda = new Agenda(2012);
    static Cita cita = new Cita(13,3,"manicura de jesus", "qlq");

    public static void main(String[] args){

        agenda.abrirPagina(2,2);
        agenda.getPaginaAbierta().agregarCita(cita);
        agenda.getPaginaAbierta().buscarCita(13,05);


    }
}
