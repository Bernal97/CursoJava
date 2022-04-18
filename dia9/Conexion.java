
package Challenges.dia9;
import Challenges.dia8.Ventas.UpdateUser;
import java.util.Scanner;
import java.sql.*;
public class Conexion {
    
    public static void main(String[] args) throws SQLException {
        Scanner sc = new Scanner(System.in);    
        int opcion;
        System.out.println("Bienvenido a esta base de datos misteriosa");
            do{
                System.out.println("Ingrese una opcion");
                System.out.println("1- Cargar un Usuario");
                System.out.println("2- Eliminar un Usuario");
                System.out.println("3- Modificar un usuario");
                System.out.println("0- Salir");
                opcion = sc.nextInt();
                switch(opcion){
                    case 1: InsertUser insertado = new InsertUser();
                            System.out.println("Usuario insertado (en teoria)");
                            break;
                    case 2: DeleteUser deleteado = new DeleteUser();
                            System.out.println("Usuario Eliminado (en teoria)");
                            break;
                    case 3: UpdateUser actualizado = new UpdateUser();
                            System.out.println("Usuario Actualizado (en teoria)");
                }
                
            }while(opcion != 0);
	 }
}
