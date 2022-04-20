
package PairPrograming.programing.services;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoDatabase;


public class ConexionMongo {
    
    	private static ConexionMongo mDbSingleton;
	private static MongoClient mongoClient;
	static MongoDatabase BaseDatos = null; 
	private static final String dbName="IntentoDataBase"; 
	
	private ConexionMongo() {}
	
	public static ConexionMongo getInstance() {
		if(mDbSingleton==null) {
			mDbSingleton=new ConexionMongo();
		}
		return mDbSingleton;
	}
	
	public MongoDatabase getTestdb(){
		if(mongoClient == null){
			mongoClient = new MongoClient();
		}
		if(BaseDatos==null) {
			BaseDatos= mongoClient.getDatabase(dbName);
			}
		return BaseDatos;
		}
		 
	

}
