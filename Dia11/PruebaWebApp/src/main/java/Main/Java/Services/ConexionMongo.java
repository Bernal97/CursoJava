
package Main.Java.Services;

import com.mongodb.Mongo;
import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import java.util.ArrayList;
import java.util.List;
import org.bson.Document;

public class ConexionMongo {
    
    
    public static void main (String [] args){
        //Comandos MongoDB 
        MongoClient mongoClient = MongoClients.create();        
        MongoDatabase baseDatos = mongoClient.getDatabase("DevPlaceDia11");
        //baseDatos.create lo saco porque al ejecutarlo la primera vez se crea,
        //y tira error en una 2da ejecucion
        MongoCollection<Document> datosUsuario = baseDatos.getCollection("baseUsuarios");

    }
}
