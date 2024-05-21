package demoArreglos;
import java.util.Scanner;
public class DemoArreglos{
    
    public void demoArreglos(){
        System.out.println("Demostración de arreglos unidimensionales");
        /*
         * tipo [] identificador o tipo identificador []
         * 
         * sintaxis 
         * tipo nombreArreglo [] = new tipo[numeroDeElementos]
         * o
         * tipo NombreArreglo[];
         * nombreArreglo = new tipo[numeroDeElementos]
         */
        //Se declara un arreglo de tamaño 10
        //inicializando

        int c[] = new int[10];
        c[0]=2;
        c[1]=4;
        c[2]=6;
        c[3]=8;
        c[4]=10;
        c[5]=12;
        c[6]=14;
        c[7]=16;
        c[8]=18;
        c[9]=20;
        for(int i=0;i<10;i++){
            System.out.println("Valor de c["+i+"] = "+c[i]);

        }
        int a[] = new int[10];
        final int n=20; //final es un valor constante
        float [] vector; //Declaro arreglo
        vector = new float[n]; // creo el arreglo

        //Impresion del arreglo
        for(int i=0;i<10;i++){
            System.out.println("Valor del vector["+i+"] = "+vector[i]);
        }

        //lectura de arreglos por teclado
        Scanner teclado = new Scanner(System.in);
        for(int i=0;i<10;i++){
            System.out.println("Introduce el valor del elemento vector["+i+"] = ");
            vector[i]=teclado.nextFloat();
        }

        //Impresion del teclado leido
        for(int i=0;i<10;i++){
            System.out.println("Valor de vector["+i+"] = "+c[i]);
        }

        //Subindice o indice de un arreglo
        //Se utiliza INDEXACION basada en 0
        int []mes = new int [12];

        float []salarios;
        salarios = new float [25];

        mes[4] = 5;
        System.out.println(salarios[mes[4]*3]); // Accede al elemento salario[15]

        //Tamaño de un arreglo
        //se hace a travez de un atributo length

        double []v = new double [15];
        System.out.println(v.length); //Escribe 15, el número de elementos de v
        
    }
}