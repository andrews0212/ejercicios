package Alumno;

import java.util.Arrays;
import java.util.Scanner;

public class Aula {
    static Alumno[] todosLosAlumnos = new Alumno[4];

    static Alumno alumno1 = new Alumno("Andrews", 1, "smr", new int[]{5,5,5,5});
    static Alumno alumno2 = new Alumno("Jose", 1, "smr", new int[]{1,3,4,5});
    static Alumno alumno3 = new Alumno("Juan", 1, "smr", new int[]{7,8,9,10});
    static Alumno alumno4 = new Alumno("Jesus", 1, "smr", new int[]{7,8,9,10});
    static Alumno alumno5 = new Alumno("Javier", 1, "smr", new int[]{1,3,4,5});

    static void agregarAlummno(Alumno alumno, int posicion){
    if (posicion >= 0 && posicion < todosLosAlumnos.length){
        todosLosAlumnos[posicion] = alumno;
    }
    }
//    static void agregarAlumno(){
//        Scanner teclado = new Scanner(System.in);
//        boolean xor;
//        xor = true;
//        for (int i = 0; i < todosLosAlumnos.length && xor; i++) {
//
//                todosLosAlumnos[i] = new Alumno();
//                System.out.println("dime el nombre");
//                todosLosAlumnos[i].setNombre(teclado.next());
//                System.out.println("dime el curso");
//                todosLosAlumnos[i].setCurso(teclado.nextInt());
//                System.out.println("dime la seccion");
//                todosLosAlumnos[i].setGrupo(teclado.next());
//                System.out.println("Quieres añadir otro alumno");
//                teclado.nextLine();
//                xor = teclado.nextBoolean();
//
//
//        }
//    }

    static void imprimeMejorNotas(){
        double media = 0;
        int posicion = 0;
        for (int i = 0; i < todosLosAlumnos.length; i++) {
            if (media == todosLosAlumnos[i].getMedia()){
                System.out.printf("%s tiene la misma media", todosLosAlumnos[i].getNombre());
                System.out.println();
            }  else if (media < todosLosAlumnos[i].getMedia()){
                media = todosLosAlumnos[i].getMedia();
                posicion = i;
            }


        }
        System.out.printf("la mejor nota es de %s de %s", media, todosLosAlumnos[posicion].getNombre());
    }
    static void imprimeAprobados(){
        System.out.println("Alumnos Aprobado");
        for (int i = 0; i < todosLosAlumnos.length; i++){

            if (todosLosAlumnos[i].isAprobado()){
                System.out.println(todosLosAlumnos[i]);
            }
        }
    }
    public static void main(String[] args){

        todosLosAlumnos[0] = alumno1;
        todosLosAlumnos[2] = alumno2;
        todosLosAlumnos[1] = alumno3;
        todosLosAlumnos[3] = alumno4;

        for (int i = 0; i < todosLosAlumnos.length; i++){
            System.out.println(todosLosAlumnos[i]); // esto funciona porque en el objeto tienes un toString
        }
        System.out.println(todosLosAlumnos[0].getNotas()[1]);
        imprimeAprobados();
        imprimeMejorNotas();

//        alumno5.colocarNotas();
//        alumno4.colocarNotas();
//        alumno3.colocarNotas();
//        alumno2.colocarNotas();
//
//        alumno1.colocarNotas();
//        System.out.println(alumno2.toString());
//        alumno2.mostrarNotas();
//        System.out.println(alumno1.toString());
//        alumno1.mostrarNotas();
//
//        agregarAlummno(alumno1, 0);
//        agregarAlummno(alumno2, 1);
//        System.out.println(Arrays.toString(todosLosAlumnos));


    }
}
