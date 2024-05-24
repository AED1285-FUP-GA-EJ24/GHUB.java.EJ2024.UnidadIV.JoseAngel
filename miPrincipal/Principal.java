package miPrincipal;
 
import  demoArreglos.DemoArreglos;
import inicializacion.Inicializacion;
import sumaArreglo.SumaArreglo;
import productoArreglo.ProductoArreglo;
import promedio.Promedio;
import promedio.Promedio2;

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
          System.out.println("3) Producto de un arreglo           "); 
          System.out.println("4) Promedio de calificaciones       "); 
          System.out.println("5) Promedio de calificaciones v2    "); 
          System.out.println("6) Inicializacion de arreglos   ");            
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
           SumaArreglo objSumaArreglo = new SumaArreglo();
           objSumaArreglo.sumaArreglo();
           break;
         case 3:
           ProductoArreglo objProductoArreglo = new ProductoArreglo();
           objProductoArreglo.productoArreglo();
           break;
         case 4:
           Promedio objPromedio = new Promedio();
           objPromedio.promedio();
           break;
         case 5:
         Promedio2 objPromedio2 = new Promedio2();
         objPromedio2.promedio();
         break;
         case 6:
         Inicializacion objInicializacion = new Inicializacion();
         objInicializacion.inicializacion();
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