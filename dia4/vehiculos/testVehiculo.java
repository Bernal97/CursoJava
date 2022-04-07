
package Challenges.dia4.vehiculos;
import java.util.Scanner;
public class testVehiculo {
    
    
    static void funcionesTransporte(Particular a){
        Scanner teclado = new Scanner (System.in);
        int op;
        double KM;
        do{
            System.out.println("1- Ver caracteristicas");
            System.out.println("2- Acelerar");
            System.out.println("3- Desacelerar");
            System.out.println("4- Modificar");
            System.out.println("0- Atras");
            op = teclado.nextInt();
            System.out.println();
            switch(op){
                case 0: System.out.println("Retrocediendo");
                case 1: System.out.println(a.toString()); break;
                case 2: System.out.println("Cuanto desea acelerar?");
                        KM = teclado.nextDouble();
                        a.acelerar(KM);break;
                case 3: System.out.println("Cuanto desea desacelerar?");
                        KM = teclado.nextDouble();
                        a.desacelerar(KM); break;
                case 4: System.out.println("Modificar Patente");
                        a.setMatricula(teclado.next());break;
                default: System.out.println("Opcion Invalida"); break;
                        
            }
        }while (op != 0);
    }
    
    static void funcionesCarga(Carga b){
        Scanner teclado = new Scanner (System.in);
        int op;
        double KM;
        do{
            System.out.println("1- Ver caracteristicas");
            System.out.println("2- Acelerar");
            System.out.println("3- Desacelerar");
            System.out.println("4- Modificar");
            System.out.println("5- Poner Remolque");
            System.out.println("6- Quitar Carga");
            System.out.println("7- Verificar Carga");
            System.out.println("0- Atras");
            op = teclado.nextInt();
            System.out.println();
            switch(op){
                case 0: System.out.println("Retrocediendo"); break;
                case 1: System.out.println(b.toString()); break;
                case 2: System.out.println("Cuanto desea acelerar?");
                        KM = teclado.nextDouble();
                        b.acelerar(KM);break;
                case 3: System.out.println("Cuanto desea desacelerar?");
                        KM = teclado.nextDouble();
                        b.desacelerar(KM); break;
                case 4: System.out.println("Modificar Patente");
                        b.setMatricula(teclado.next());break;
                
                case 5: 
                        System.out.println("Ingrese el tipo");
                        String tipo = teclado.next();
                        System.out.println("Ingrese el peso");
                        double KG = teclado.nextDouble();                  
                        Remolque carguita = new Remolque(tipo, KG);
                        b.ponRemolque(carguita);break;
                case 6: if(!b.verificarCarga()){
                            System.out.println("No posee carga alguna");
                        }else {
                            b.quitarRemolque();
                            System.out.println("Carga liberada");
                        }
                        break;
                case 7: if(b.verificarCarga()){
                        Remolque a = b.verCarga();
                        System.out.println(a.toString()); break;                   
                    }else{
                        System.out.println("Usted no posee una carga");break;
                    }
                        
                default: System.out.println("Opcion Invalida"); break;        
                
                
            }
        }while (op != 0);
    }
    
    
    public static void main (String [] args){
         System.out.println("Inicializando vehiculo de transporte y vehiculo de carga");
         Particular auto = new Particular("FGT-123", 4);
         Carga camion = new Carga("TGR-456");
         Scanner teclado = new Scanner (System.in);
         int opcion;
         do{
             System.out.println("1- Acceder al vehiculo de transporte");
             System.out.println("2- Acceder al vehiculo de carga");
             System.out.println("0 - Salir");
             opcion = teclado.nextInt();
             System.out.println();
             switch(opcion){
                 case 0: System.out.println("Adios"); break;
                 case 1: funcionesTransporte(auto); break;
                 case 2: funcionesCarga(camion); break;
                 default: System.out.println("Opcion no valida"); break;
             }
         }while (opcion != 0);
    }
   
    
}
