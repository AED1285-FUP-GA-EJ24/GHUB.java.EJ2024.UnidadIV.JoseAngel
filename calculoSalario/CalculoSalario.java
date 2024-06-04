package calculoSalario;
import java.util.Scanner;
public class CalculoSalario{
    public static void calcular(){
        //creo objeto Scanner;
        Scanner teclado = new Scanner(System.in);
        double salarioActual, nuevoSalario, aumento, aumentoTotal=0, salarioConAumento=0;

        final int N;
        System.out.print("¿cuántos empleados capturara?");
        N=teclado.nextInt();
        for(int i=1; i<=N;i++){
            System.out.println("Datos del empleado : "+i);
            do {
                System.out.println("Ingrese el salario actual del empleado (debe ser un número positivo): ");
                salarioActual = teclado.nextDouble();
                if (salarioActual < 0) {
                    System.out.println("El salario no puede ser negativo. Inténtelo de nuevo.");
                }
            } while (salarioActual < 0);
        
            if (salarioActual <= 9000) {
                aumento = 0.2; 
            } else if (salarioActual <= 15000) {
                aumento = 0.1; 
            } else if (salarioActual <= 20000) {
                aumento = 0.05; 
            } else {
                aumento = 0; 
            }

            salarioConAumento = salarioActual + (salarioActual * aumento);
            nuevoSalario = salarioActual + (salarioActual * aumento);
            System.out.println("");
            System.out.println("El nuevo salario del empleado es: $" + nuevoSalario);
            System.out.println("El aumento es: $" + salarioActual * aumento);
            System.out.println("");
            aumentoTotal += salarioActual * aumento;
        }
        System.out.println("");
        System.out.println("El aumento total de todos los empleados = $" + aumentoTotal);
        System.out.println("El total de los salarios con el aumento incluido = $" + (aumentoTotal + salarioConAumento));

        }
    }
     
     


    