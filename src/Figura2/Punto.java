package Figura2;

public class Punto {
    private int x;
    private int y;

    public Punto(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;
    }
    public double getDistancia(Punto punto2){
        return Math.sqrt(Math.pow((punto2.getX() - this.getX()), 2) + Math.pow((punto2.getY() - this.getY()), 2));
    }

}
