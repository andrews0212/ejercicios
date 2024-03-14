package Collec;
import java.util.*;


public class ListaValores {

    private List<Integer> enteros;

    public ListaValores() {

        this.enteros = new ArrayList<Integer>();
    }

    public ListaValores(int valoresAleatorios) {
        this.enteros = new ArrayList<Integer>();
        for (int i = 1; i <= valoresAleatorios; i++) {
            this.enteros.add((int) ((Math.random() * 12) + 1));
        }

    }

    public boolean entreValores(int numero1, int numero2){

        Iterator<Integer> it = enteros.iterator();
        int numero;
        boolean entre;
        entre = false;
        if (numero1 == numero2) return false;
        if (numero2 == (numero1 + 1)) return false;
        if (numero1 > numero2){
            int aux;
            aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }

        while(it.hasNext()){
            numero = it.next();
            if (numero > numero1 && numero < numero2){
                entre = true;
            }

        }
        return entre;


    }

    public List<Integer> getEnteros() {
        return enteros;
    }

    public void AñadirElementos(ListaValores a) {
        this.enteros.addAll(a.getEnteros());
    }


//    public void MayorMenor() {
//        int aux;
//        for (int i = 0; i < this.enteros.size(); i++) {
//            for (int j = i + 1; j < this.enteros.size(); j++) {
//                if (this.enteros.get(i) < this.enteros.get(j)) {
//                    aux = this.enteros.get(i);
//                    this.enteros.set(i, this.enteros.get(j));
//                    this.enteros.set(j, aux);
//                }
//            }
//
//        }
//    }

    public void MayorMenor(){
        enteros.sort(null);
    }


    public void MenorMayor() {
        int aux;
        for (int i = 0; i < this.enteros.size(); i++) {
            for (int j = i + 1; j < this.enteros.size(); j++) {
                if (this.enteros.get(i) > this.enteros.get(j)) {
                    aux = this.enteros.get(i);
                    this.enteros.set(i, this.enteros.get(j));
                    this.enteros.set(j, aux);
                }
            }

        }
    }

    public int CuentaVecesValor(int valor) {
        int i = 0;
        for (Integer q : this.enteros) {
            if (q == valor) i++;
        }
        return i;
    }

    public int sumaValores(){
        int suma;
        suma = 0;
        Iterator<Integer> it = enteros.iterator();
        while(it.hasNext()){
            suma += it.next();
        }
        return suma;
    }

    /*
    public void MayorMenor(){

        List<Integer> list = this.enteros.stream().sorted(Comparator.reverseOrder()).toList();
        this.enteros = list;

    }

    public void MenorMayor(){
        List<Integer> list = this.enteros.stream().sorted().toList();
        this.enteros = list;
    }
     */

    /*
   public int CuentaVecesValor(int valor){
      return (int) enteros.stream().filter(Predicate.isEqual(valor)).count();
   }
   */

    public boolean todosMayores(int valor){
        int numero;
        int contador;
        contador = 0;

        Iterator<Integer> it = enteros.iterator();
        while(it.hasNext()) {
            numero = it.next();
            if(valor < numero){
                contador++;
            }
        }

        if (contador == enteros.size()){
            return true;
        }else return false;
    }

    public int dameMayor(){
        int numero;
        numero = 0;
        for (Integer valor: enteros) {
            if (numero < valor){
                numero = valor;
            }
        }
        return numero;
    }

    public int dameMenor(){

        int numero;
        numero = this.dameMayor();
        for (Integer valor: enteros) {
            if (valor < numero){
                numero = valor;
            }
        }
        return numero;
    }

    public void MostrarArray(){
       System.out.print("[");
       for (int i: this.enteros) {
           System.out.print(i + " ");
       }
       System.out.println("]");
   }

   public List<Integer> DameValorEntre(int numero1, int numero2){
       int numero;
       boolean entre;
       entre = false;

       Iterator<Integer> it = enteros.iterator();
       if (numero1 == numero2) return null;
       if (numero1 > numero2){
           int aux;
           aux = numero1;
           numero1 = numero2;
           numero2 = aux;
       }
       List<Integer> list = new ArrayList<Integer>();
       while(it.hasNext()){
           numero = it.next();
           if (numero >= numero1 && numero <= numero2){
               list.add(numero);
           }

       }
       return list;

   }
}
