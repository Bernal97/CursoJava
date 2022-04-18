
package Challenge.dia10;

import com.mongodb.BasicDBObject;
import com.mongodb.client.FindIterable;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;

import org.bson.Document;



public class BaseDatosConMongoDB {
    
    
    public static void main (String [] args){
        //Comandos MongoDB 
        MongoClient mongoClient = MongoClients.create();
        List<Document> database = mongoClient.listDatabases().into(new ArrayList<>());       
        MongoDatabase baseDatos = mongoClient.getDatabase("DevPlaceDia10");
        //baseDatos.create lo saco porque al ejecutarlo la primera vez se crea,
        //y tira error en una 2da ejecucion
        MongoCollection<Document> datosUsuario = baseDatos.getCollection("baseUsuarios");
        
        //Datos arbitrarios a ingresar
        String DNI = "", Nombre = "", Apellido = "", Domicilio = "";       
        Scanner sc = new Scanner (System.in);
        
        
        System.out.println("Bienvenido a esta base de datos");
        System.out.println("Que desea hacer?");
        int opcion;
       
        do{
            System.out.println("1- Registrar Datos");
            System.out.println("2- Consultar Datos");
            System.out.println("3- Eliminar Datos");
            System.out.println("4- Listar Todo en general");
            System.out.println("0- Salir");
            opcion = sc.nextInt();
            switch(opcion){
                case 0: System.out.println("Gracias, vuelva prontos"); break;
                case 1: System.out.println("Ingrese los datos correspondientes");
                        DNI = sc.next();
                        Nombre = sc.next();
                        Apellido = sc.next();
                        Domicilio = sc.next();
                        Document documento = new Document("DNI", DNI).append("Nombre", Nombre).append("Apellido", Apellido).append("Domicilio", Domicilio);
                        datosUsuario.insertOne(documento);
                        break;
                case 2: 
                    System.out.println("Ingrese el DNI a buscar");
                    DNI = sc.next();
                    Document findDocument = new Document("DNI", DNI);
                    FindIterable buscar = baseDatos.getCollection("baseUsuarios").find(findDocument);
                    System.out.println(buscar.first());
                    break;
                    
                case 3:
                    System.out.println("Ingrese el DNI a eliminar");
                    DNI = sc.next();
                    Document findDocument1 = new Document("DNI", DNI);
                    datosUsuario.findOneAndDelete(findDocument1);
                    break;
                case 4: 
                        System.out.println(datosUsuario.find());
                        break;
                   }
                           
       }while (opcion != 0);        
       }
}
