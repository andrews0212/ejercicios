package Feria;

import java.util.Random;
import java.util.Scanner;

public class Sensor {

    // crear el error del sensor
    public int obtenerAltura() {
        Random rdm = new Random();

        if (rdm.nextInt(1, 10) == 5){
            return rdm.nextInt(-140, 0);
        }
        return rdm.nextInt(0,254);
    }
}
