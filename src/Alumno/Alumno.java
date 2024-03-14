package Alumno;

import java.util.Arrays;

public class Alumno {

    public static int NN = 4;
    // atributos

    // ya por defecto podemos crear
    private String nombre;
    private int curso;
    private String grupo;

    public int[] notas = new int[NN];

    // creamos el constructor
    public Alumno(String nombre, int curso, String grupo, int[] notas) {
        this.nombre = nombre;
        this.curso = curso;
        this.grupo = grupo;
        this.notas = notas;
    }
    public Alumno(){

    }
    public Alumno(Alumno a){
        this.nombre = a.getNombre();
        this.curso = a.getCurso();
        this.grupo = a.getGrupo();
        this.notas = a.getNotas();
    }

    // getter
    public int getCurso() {
        return curso;
    }

    public  String getNombre() {
        return nombre;
    }

    public  String getGrupo() {
        return grupo;
    }

    public int[] getNotas() {
        return notas;
    }
    // setter

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    // con el to String lo que hacemos es cuando instanciamos el objeto podemos llamar un system.out.println(nombre del objeto)

    public String toString() {

        return "nombre : " + nombre + " grupo : " + grupo + " curso : " + curso;
    }

    public boolean isAprobado() {
        boolean ap;
        ap = true;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] < 5) {
                ap = false;
            }
        }
        return ap;
    }


    public  int nSupensos() {
        int contador;
        contador = 0;
        if (!isAprobado()) {
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] < 5) {
                    contador++;
                }
            }
        }
        return contador;
    }

    public  int nAprobado() {
        int contador;
        contador = 0;
        if (isAprobado()) {
            for (int i = 0; i < notas.length; i++) {
                if (notas[i] >= 5) {
                    contador++;
                }
            }
        }
        return contador;
    }
    public void colocarNotas() {
        int[] nota = new int[this.getNotas().length];
        for (int i = 0; i < this.getNotas().length; i++) {
           nota[i] = this.getNotas()[i] = (int) (Math.random()* 10);
        }
        notas = nota;
    }
    public double getMedia() {
        double media=0;
        for(int nota:this.notas) {
            media+=nota;
        }
        return media/NN;
    }

    public int getNotas(int n, int nota) {
       return this.notas[n]= nota;

    }
    public void mostrarNotas(){
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");

        }
        System.out.println("");
    }


}