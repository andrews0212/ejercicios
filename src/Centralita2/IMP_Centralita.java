package Centralita2;

import java.util.ArrayList;
import java.util.Collection;

public class IMP_Centralita implements centralita{

    private ArrayList<Llamada> RegistroLlamadas;
    private double costeTotal;

    public IMP_Centralita(ArrayList<Llamada> registroLlamadas) {
        RegistroLlamadas = registroLlamadas;
        this.costeTotal = 0;
    }
    public IMP_Centralita() {
        RegistroLlamadas = new ArrayList<Llamada>();
        this.costeTotal = 0;
    }

    public ArrayList<Llamada> getRegistroLlamadas() {
        return RegistroLlamadas;
    }

    public double getCosteTotal() {
        return costeTotal;
    }

    @Override
    public void hacerLlamada(Llamada l1) {
        RegistroLlamadas.add(l1);
        double precio;
        int duracion;
        precio = 0;
        duracion = 0;
        if (l1 instanceof Local){
            precio = ((Local) l1).getPRECIO();
            duracion = l1.getDuracion();
            costeTotal +=  precio * duracion ;
        } else if (l1 instanceof Provincial){
            precio = ((Provincial) l1).getFranja().getPrecio();
            duracion = l1.getDuracion();
            costeTotal +=  precio * duracion ;
        }

    }

    public Llamada buscarLLamadaPorOrigen(String origen){
        for (int i = 0; i < RegistroLlamadas.size(); i++) {
          if (RegistroLlamadas.get(i).getNumeroOrigen().equals(origen))
              return RegistroLlamadas.get(i);
        }
        return null;
    }

    @Override
    public Llamada MayorDuracion() {
        return null;
    }

}
