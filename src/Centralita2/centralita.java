package Centralita2;

import centralitaLLamadas.Llamadas;

import java.util.ArrayList;

public interface centralita {


     void hacerLlamada(Llamada l1);
     Llamada MayorDuracion();
     double getCosteTotal();
}
