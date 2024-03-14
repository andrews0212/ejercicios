package Feria;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      PuertaEntrada pt = new PuertaEntrada();
      try {
          System.out.println(pt.ComprobarAltura());
      } catch (AlturaNegativa e){
          System.out.println(e);
      } catch (AlturaMinimaNoValida e){
          System.out.println(e);
      } catch (AlturaMaximaNoValida e){
          System.out.println(e);
      } catch (PuertaException e){
          System.out.println(e);
      } catch (Exception e){
          System.out.println(e);
      } finally {
          System.out.println("siguiente en la cola");
      }
    }
}
