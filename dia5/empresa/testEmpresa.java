
package Challenges.dia5.empresa;
import java.util.Scanner;
public class testEmpresa {
    
    
        static void empleados(Empleado[] a, int count){
            Scanner sc = new Scanner (System.in);
            int op;
            if(a[0] == null){
                System.out.println("No hay un Empleado registrado, arme uno acontinuacion");
                crearEmpleado(a, count);
            } else {
                do{
                    System.out.println("1- Crear un nuevo Empleado");
                    System.out.println("2- Mostrar datos de Empleado");
                    System.out.println("3- Asignarle Supervisor");
                    System.out.println("4- Incrementarle Salario");
                    System.out.println("0- Atras");
                    op = sc.nextInt();
                    switch(op){
                        case 0: System.out.println("Retrocediendo"); break;
                        case 1: crearEmpleado(a, count); break;
                        case 2: for (int x = 0; x < count; x++){
                                System.out.println(a[x].toString());
                                }   
                                break;
                        case 3: System.out.println("Seleccione al empleado que le asignara un supervisor");
                                for(int x = 0; x < count; x++){
                                    System.out.println(a[x].getNombre());
                                }
                                int ele = sc.nextInt();
                                System.out.println("Ingrese el nombre y apellido del supervisor");
                                String nomb = sc.next();
                                String ape = sc.next();
                                Supervisor b = new Supervisor (nomb, ape);
                                a[ele].asignarSupervisor(b);
                                break;
                        case 4: System.out.println("Seleccione al empleado que le aumentara el salario");
                                for(int x = 0; x < count; x++){
                                    System.out.println(a[x].getNombre());
                                }
                                int ele2 = sc.nextInt();
                                System.out.println("Cuanto le aumentara?");
                                Double salario = sc.nextDouble();
                                a[ele2].incrementarSalario(salario);
                                break;
                        default: System.out.println("Opcion Incorrecta");
                    }
                }while(op != 0);
            }
        }
    
        
        
        //Modulos Constructores
        
        static void crearEmpleado(Empleado[] a, int count){
            Scanner sc = new Scanner(System.in);
                a[0] = new Empleado();
                System.out.println("Ingrese su nombre");
                a[0].setNombre(sc.next());
                System.out.println("Ingrese su apellido");
                a[0].setApellido(sc.next());
                System.out.println("Ingrese su DNI");
                a[0].setDNI(sc.nextInt());
                System.out.println("Ingrese su nro de contacto");
                a[0].setTelefonoContacto(sc.next());
                System.out.println("Ingrese su direccion");
                a[0].setDireccion(sc.next());
                count++;
        }
    public static void main (String [] args){
        
        Scanner sc = new Scanner(System.in);
        Empleado[] a = new Empleado[10];
        int count = 0, op;
        do{
            System.out.println("1- Acceder a Empleados");
            System.out.println("2- Acceder a Secretarios");
            System.out.println("3- Acceder a Vendedores");
            System.out.println("4- Acceder a Jefes de Zona");
            System.out.println("0- Salir");
            op= sc.nextInt();
            switch(op){
                case 0: System.out.println("Adios"); break;
                case 1: empleados(a, count); break;
                
            }
        }while (op != 0);
    }
}
