package Try_cash;


public class Main {


    static void dos(int n ){
        double c;
        c = 12 / n;
    }

    static void uno(){
        try {
            dos(0);
        } catch (Exception e){
            System.out.println("capturado 1");
            throw e; // propagar el error // esto sirve como para que continue el error y no desaparezca
        }
    }

    public static void main(String args[]){

    uno();


    }
}
