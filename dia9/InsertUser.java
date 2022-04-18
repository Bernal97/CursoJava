
package Challenges.dia9;
import java.sql.*;
import java.util.Scanner;
public class InsertUser {
  
    public InsertUser() throws SQLException{
         Scanner sc = new Scanner(System.in);
         String firstName, lastName, direction, date;
         Codigo_Ventas BD = new Codigo_Ventas();
         
         System.out.println("Ingrese su nombre");
         firstName = sc.next();
         System.out.println("Ingrese su apellido");
         lastName = sc.next();
         System.out.println("Ingrese su direccion");
         direction = sc.next();
         
         
         if(BD.getConnection() != null){
             String query = "INSERT INTO users (first_name,last_name,direction, date) values(?,?,?,?)";
             PreparedStatement st = BD.getConnection().prepareStatement(query);
             st.setString(1, firstName); 
             st.setString(2, lastName);
             st.setString(3, direction);
             st.setString(4, "0000-2010-10-10");
             st.executeUpdate();
         }
        
    }
    
        
    }
   

