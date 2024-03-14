package Agenda;

import java.util.ArrayList;
import java.util.Comparator;

public class Agenda{

    private ArrayList<Amigo> agenda;

    public ArrayList<Amigo> getAgenda() {
        return agenda;
    }

    public Agenda(){
        this.agenda = new ArrayList<>();
    }
    public void añadirAmigo(String nombre, String apellido, int telefono, String correoElectronico){
    this.agenda.add(new Amigo(nombre, apellido, telefono, correoElectronico));
    }
    public void añadirAmigo(String nombre, int telefono){
        this.agenda.add(new Amigo(nombre, telefono));
    }
    public void añadirAmigo(Amigo amigo){
        this.agenda.add(amigo);
    }
    public void editarNumero(String nombre, int telefono){

        for (int i = 0; i < agenda.size(); i++){
            if (nombre.equals(agenda.get(i).getNombre())){
                agenda.set(i,new Amigo(agenda.get(i).getNombre(), telefono));
            }
        }
    }
    public void eliminarAmigo(String nombre){
       for (int i = 0; i < agenda.size(); i++){
         if (nombre.equalsIgnoreCase(agenda.get(i).getNombre())){
             agenda.remove(i);
         }
       }
    }
    public void mostrarAgenda(){
        for (int i = 0; i < agenda.size(); i++){
            System.out.printf(String.valueOf(agenda.get(i)));
            System.out.println();
        }

    }
//    public Amigo mostrarAmigos(String nombre){
//        for (int i = 0; i < agenda.size(); i++){
//            if (nombre.equalsIgnoreCase(agenda.get(i).getNombre())){
//                return  agenda.get(i);
//            }
//        }
//        return null;
//    }
        public Amigo mostrarAmigos(String nombre){
        int posicion;
        if (this.agenda.indexOf(new Amigo(nombre, 0)) == -1){
            return null;
            } else {
            posicion = this.agenda.indexOf(new Amigo(nombre, 0));
            return this.agenda.get(posicion);
        }

    }



    @Override
    public String toString() {
        return "Agenda{" +
                "agenda=" + agenda +
                '}';
    }
}
