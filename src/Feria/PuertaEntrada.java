package Feria;

public class PuertaEntrada {

    private boolean puertaAbre;
    private Sensor sensor;

    public PuertaEntrada() {
        sensor = new Sensor();
       this.puertaAbre = false;
    }

    public boolean ComprobarAltura() throws PuertaException{
       if (sensor.obtenerAltura() < 0){
           throw new AlturaNegativa();
       }
       else if ( sensor.obtenerAltura() > 190){
           throw new AlturaMaximaNoValida();
       }
       else if (sensor.obtenerAltura() < 150){
           throw new AlturaMinimaNoValida();
       }
       if (sensor.obtenerAltura() >= 150 && sensor.obtenerAltura() <= 190){
           return true;
       } else {
           return false;
       }
    }
}
