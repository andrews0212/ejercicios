package centralitaLLamadas;

import java.util.ArrayList;

public class Centralita {


    // falta numero llamada
    // tenemos que eliminar el array list y solo gestionarlo con numeroDelamada e importe total
    private int montoTotal;

    private ArrayList<Llamadas> llamadas;

    // centralita(String origen, String destino, double duracion){}
    // centralita(String origen, String destino, double ducacion, boolean provincial){}
    public Centralita() {
        this.llamadas = new ArrayList<Llamadas>();
        montoTotal = 0;
    }

    public int getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(int montoTotal) {
        this.montoTotal = montoTotal;
    }

    public ArrayList<Llamadas> getLlamadas() {
        return llamadas;
    }

    public void setLlamadas(ArrayList<Llamadas> llamadas) {
        this.llamadas = llamadas;
    }

    public void añadirllamada(Llamadas llamada){
        llamadas.add(llamada);
        montoTotal += llamada.coste();
    }

    public void listaLlamadas(){
        for (int i = 0; i < llamadas.size(); i++) {
            System.out.printf("%s  :    %s   :   %s", llamadas.get(i).getNumeroOrigen(), llamadas.get(i).getNumeroDestino(), llamadas.get(i).getDuracion());
            System.out.println();
        }
    }
}
