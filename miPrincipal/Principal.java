package miPrincipal;
 
import  demoArreglos.DemoArreglos;
import  sumaArreglos.SumaArreglos;

import java.util.Scanner;
public class Principal {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcion;
        do{
          System.out.println("**************************************");
          System.out.println("      MENU DE OPCIONES UNIDAD IV     ");
          System.out.println("**************************************");
          System.out.println("1) Demostracion de arreglos unidimensionales        ");   
          System.out.println("2) Suma de Arreglos");
          System.out.println("3)");
          System.out.println("4)");
          System.out.println("5)");             
          System.out.println("");

          System.out.println("99) Salir ");
          System.out.println("**************************************");
          System.out.print("Selecciona Opcion:");
          opcion = entrada.nextInt();
          switch(opcion){
              case 1:
              DemoArreglos objDemoArreglos = new DemoArreglos();
              objDemoArreglos.demoArreglos();
              break;
              case 2:
              SumaArreglos objSumaArreglos = new SumaArreglos();
              objSumaArreglos.sumaArreglos();
              break;
              case 3:
              
              break;
              case 4:
              
              break;
              case 5:
              
              break;


              case 99:
              System.out.println("Saliste");
              break;
              default:
              System.out.println("Opción inválida");
        }
      } while (opcion != 99);


    }
}