
package Challenges.dia9;
import java.sql.*;
import java.util.Scanner;
public class Codigo_Ventas {
        String urlServer = "jdbc:mysql://localhost:3306/mydb";
        String userDb = "root";
        String passwordDb = "";
        Connection conectar = null;
        
     public void conexionDb(){
        
        try{
            conectar = DriverManager.getConnection(urlServer, userDb,passwordDb);
            System.out.println("Se conecto bien");
            
        }
        catch(SQLException e){
            System.out.println("Fallo increiblemente");
        }
    }
     
     public Connection getConnection(){
         return this.conectar;
     }
    
    
    
    public static void main (String[] args){
        Codigo_Ventas conexion = new Codigo_Ventas();
        conexion.conexionDb();
        

    
}
    
}
