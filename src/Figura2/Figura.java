package Figura2;




public abstract class Figura {

    
    private String nombre;

    private Punto puntoA;

    public Figura(String nombre, Punto puntoA) {
        this.nombre = nombre;
        this.puntoA = puntoA;
    }

    public Punto getPunto(){
        return this.puntoA;
    }
    public void setNombre(String nombre){
       this.nombre =  nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public String toString(){
        return String.format("%s",nombre);
    }

    abstract public double getArea();





    


    

    }


    
    




