package Vuelo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {    
        Vuelo v1,v2,v3,v4,v5;
        v1 = new Vuelo("Madrid, 12.37, 155, 100, IB1123, 22, 11, 2007");
        v2 = new Vuelo("Madrid, 22.37, 155, 154, IB2365, 23, 11, 2007");
        v3 = new Vuelo("Barcelona, 19.56, 200, 150, VLG256, 22, 11, 2007");
        v4 = new Vuelo("Barcelona, 39.56, 200, 150, UA7810, 24, 11, 2007");
        v5 = new Vuelo("Paris, 70.0, 75, 70, EAS348, 24, 11, 2007");
        Aeropuerto a = new Aeropuerto("barajas");
        a.añadirVuelo(v1);
        a.añadirVuelo(v2);
        a.añadirVuelo(v3);
        a.añadirVuelo(v4);
        a.añadirVuelo(v5);
        
    }
    
}
/*
Madrid, 12.37, 155, 100, IB1123, 22, 11, 2007
Barcelona, 19.56, 200, 150, VLG256, 22, 11, 2007
Valencia, 2.1, 150, 150, RYA803, 22, 11, 2007
Paris, 10.0, 85, 85, UA894, 23, 11, 2007
Madrid, 22.37, 155, 154, IB2365, 23, 11, 2007
Bilbao, 29.56, 200, 150, EAS286, 23, 11, 2007
Valencia, 22.4, 100, 100, VLG127, 24, 11, 2007
Paris, 70.0, 75, 70, EAS348, 24, 11, 2007
Madrid, 32.37, 250, 250, AIF389, 24, 11, 2007
Barcelona, 39.56, 200, 150, UA7810, 24, 11, 2007
Londres, 28.4, 100, 90, IB6511, 25, 11, 2007
Paris, 80.0, 75, 75, RYA212, 25, 11, 2007*/