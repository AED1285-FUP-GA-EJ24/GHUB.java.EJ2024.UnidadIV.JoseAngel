package lecturaAccederArreglo;
//Proposito: Dar entrada a los elementos y posterior visualizacion de un arreglo bidimensional
//Autor: Jose Angel
//Fecha: 31/05/2024
import java.util.Scanner;
public class LecturaAccederArreglo{
    //El metodo declarado como estatico pertenece a la clase y no a los objetos
    public static void lecturaAccederArreglo(){
      int v[][] = new int [3][5];
      //Se invoca el metodo leer
      leer(v);
      visualizacion(v);

    }
    
    public static void leer (int v[][]){
        int i,j;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Entrada de datos de la matriz");
        for(i=0;i<v.length;i++){
            System.out.println("Fila: " +i);   
            for(j=0;j<v[i].length;j++){
                v[i][j]=teclado.nextInt();
            }    
        }
    }
    public static void visualizacion(int v[][]){
        int i,j;
        System.out.println("\n\t Matriz leída \n");
        for(i=0;i<v.length;i++){
            for(j=0;j<v[i].length;j++){
                System.out.print(v[i][j]+"");
            }
            System.out.println();
        }

    }
}