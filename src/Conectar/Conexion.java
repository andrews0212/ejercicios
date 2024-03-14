package Conectar;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {

    private  Connection con;
    private String drive = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/tienda";
    private String usuario = "root";
    private String contraseña = "";
    public Conexion() {

        try{
            Class.forName(drive);
            con = DriverManager.getConnection(url,usuario, contraseña);
        } catch (Exception e){
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Conexion cn = new Conexion(); // la conexion con la bd
        Statement st; // El objeto utilizado para ejecutar una instrucción SQL estática y devolver los resultados que produce.
        ResultSet rt; // esto lo que funciona para mostrar los resultados
        try {
            st = cn.con.createStatement();
            rt = st.executeQuery("select * from producto");
            while (rt.next()){
                System.out.println(rt.getInt("id") + " " + rt.getString("nombre") + " " + rt.getDouble("precio") + " " + rt.getInt("id_fabricante"));
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}
