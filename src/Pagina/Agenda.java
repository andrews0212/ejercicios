package Pagina;

import java.util.Scanner;

public class Agenda {

    private Pagina paginaAbierta;
    private int anio;
    private Pagina[][] pagina;

    public Agenda(int anio){
        this.anio = anio;
        pagina = new Pagina[12][31];
        for(int mes = 0; mes < pagina.length; mes++){
            for(int dia = 0; dia < pagina[mes].length; dia++){
                if (mes >= 0 && mes <= 11) {
                    switch (mes){
                        case 0,2,4,6,7,9,11:
                            if (dia >= 0 && dia <= 30) {
                                pagina[mes][dia] = new Pagina(dia + 1, mes + 1);
                            }
                            break;

                        case 3,5,8,10:

                            if (dia >= 0 && dia <= 29) {
                                pagina[mes][dia] = new Pagina(dia + 1, mes + 1);
                            }

                            break;

                        case 1:
                            if (anioBisiesto()){

                                if (dia >= 0 && dia <= 28) {
                                    pagina[mes][dia] = new Pagina(dia + 1, mes + 1);
                                }
                            } else {
                                if (dia >= 0 && dia <= 27) {
                                    pagina[mes][dia] = new Pagina(dia + 1, mes + 1);
                                }
                            }


                    }
                }
            }
        }
        paginaAbierta = pagina[0][0];
    }

    public Pagina getPaginaAbierta() {
        return paginaAbierta;
    }

    public void setPaginaAbierta(Pagina paginaAbierta) {
        this.paginaAbierta = paginaAbierta;
    }

    public Pagina[][] getPagina() {
        return pagina;
    }


    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public Pagina[][] getLisPagina() {
        return pagina;
    }

    public void setPagina(Pagina[][] pagina) {
        this.pagina = pagina;
    }

    public Pagina getPagina(int dia, int mes){
       return pagina[mes -1][dia - 1];
    }


    public void abrirPagina(int dia, int mes){
        this.paginaAbierta = pagina[mes -1][dia - 1];
    }
    public boolean anioBisiesto(){
    int anio = this.anio;
    if (anio % 4 == 0 || anio % 4 == 0 && anio % 100 != 0 || anio % 100 == 0 && anio % 400 == 0){
        return true;
    }
    return false;
    }

}
