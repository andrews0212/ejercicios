package Try_cash.calculadora;

import java.util.Scanner;

public class Calculadora {


       public double n1,n2;
       public char  operacion;
       public Scanner teclado = new Scanner(System.in);

       public Calculadora() {
       }

       public void usar() {


           System.out.println("dime el numero1");
           n1 = teclado.nextDouble();
           System.out.println("dime el numero2");
           n2 = teclado.nextDouble();
           System.out.println("dime la operacion");
           operacion = teclado.next().toUpperCase().charAt(0);

           if (operacion == 'S') {
               sumar(n1, n2);
           } else if (operacion == 'R') {
               restar(n1, n2);
           } else if (operacion == 'M') {
               multiplicar(n1, n2);
           } else if (operacion == 'D') {
               dividir(n1, n2);
           }
       }

       public double sumar(double n1, double n2){
           return n1 + n2;
       }
    public double restar(double n1, double n2){
        return n1 - n2;
    }
    public double multiplicar(double n1, double n2){
        return n1 * n2;
    }
    public double dividir (double n1, double n2) throws IllegalArgumentException{
           if(n2 == 0){
               throw new IllegalArgumentException("no se puede  dividir con 0");
           }
           return n1 / 2;
    }
}
