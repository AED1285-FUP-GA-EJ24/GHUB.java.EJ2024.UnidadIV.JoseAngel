package inicializacion;

import java.util.Scanner;

public class Inicializacion {

    public void inicializacion(){
     int arreglos[]; //Crea el arreglo
     arreglos = new int[3]; //Crear un arreglo entero de 3 tamaños
     for(int i=0;i<arreglos.length;i++){
        System.out.println("Elementos"+i+" : "+arreglos[i]+" ");
     }
     System.out.println("");
     double []arreglos2 = new double[5];
     for(int i=0;i<arreglos2.length;i++){
         System.out.println("Elementos"+i+" : "+arreglos2[i]+" ");
     }
     System.out.println("");
     arreglos2[0]=6.5;
     arreglos2[1]=5.5;
     arreglos2[2]=7.1;
     arreglos2[3]=-8.9;
     arreglos2[4]=101.23;
     for(int i=0;i<arreglos2.length;i++){
        System.out.println("Elementos"+i+" : "+arreglos2[i]+" ");
    }
    System.out.println("");
Scanner teclado = new Scanner(System.in);
System.out.println("Ingresa el valor");
for(int j=0;j<arreglos.length;j++){
    System.out.println("Introduce valor del elemento "+j+" = ");
    arreglos[j] = teclado.nextInt();
}
System.out.println("");
for(int j=0;j<arreglos.length;j++){
    System.out.println("Introduce valor del elemento "+j+" = ");
}
//Los arreglos se pueden inicializar con valores constantes en una sentencia
//Que ademas es capaz de determinar su tamaño
System.out.println("");
int numeros[] = {10,20,30,40,50,60}; //Crea un arreglo de tamaño 6
for(int j=0;j<6;j++){
    System.out.println("cuanto vale numero ["+j+"] "+numeros[j]+"");
}
System.out.println("");
int []nms ={3,4,5}; //Crea un arreglo de tamaño 3 y lo inicializa
System.out.println(nms[0]);
System.out.println(nms[1]);
System.out.println(nms[2]);  

System.out.println("");
char c[] = {L,u,i,s};
System.out.println(nms[0]);
System.out.println(nms[1]);
System.out.println(nms[2]);
System.out.println(nms[3]);
System.out.println("");
for(int i=0;i<c.length;i++){
    System.out.println(c[i]+"");
}

    }
}