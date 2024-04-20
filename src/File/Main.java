package File;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Main {

            

public static void reader() throws IOException{

    FileReader fileReader = new FileReader("./src/File/texto.txt");
    int c = fileReader.read();
    BufferedReader br = new BufferedReader(fileReader);
    String linea;
    //Scanner sc;
    linea = br.readLine();
   
    while(linea != null){
//      sc  = new Scanner(linea)
//      String descripcion = sc.next().useDelimiter("\\s*-\\s*");
//      Double Precio = sc.nextDouble();

// luego podemos crear el objeto
        linea= br.readLine();
    }

    // esto es igual que lo de arriba

    // while((linea = br.readLine()) != null){

    // }


    // while (c != -1){
    //     char letra = (char)c;
    //     System.out.print(letra);
    //     c = fileReader.read();
    // }
    fileReader.close();
    br.close();
    System.out.println();

}


    static void write() throws IOException{
        //String cadena = "ho\u2211la mundo";
        File f = new File("./src/File/texto.txt");
        String cadena = "qlq vieja";
        FileWriter fw = new FileWriter(f);
        fw.write(cadena);
        System.out.println("El fichero se ha escrito correctamente");
        fw.close();
    }


    public static void main(String[] args) throws IOException {
     //   System.out.println(Arrays.toString(args));
     reader();
     write();
    //  String carpeta = args[0];
    //  File f = new File(carpeta);
    //  File[] list = f.listFiles();
    //  System.out.println(Arrays.toString(list));
    //  for (File fi : list){
        
    //     System.out.println(fi.getName());
    //     System.out.println();

    //     if (fi.isDirectory()){
            
    //         System.out.println(Arrays.toString(fi.list()));
    //         System.out.println();
    //     }
    //  }
    }


    // System.out.println(f.getName() + " " + f.getAbsolutePath() + " " + (f.getTotalSpace() / Math.pow(10, 6)) + "MB" + " " + (f.getTotalSpace() / Math.pow(10, 9)) + "GB" + " " + f.mkdir()) ;
    
    }

