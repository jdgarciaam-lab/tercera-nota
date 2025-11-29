package UnidadUno.ListaDeDatosArrays.Ejercicios;
import java.util.Scanner;

public class ejercicio {


    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        // Arreglo para guardar 5 valores ingresados por el usuario
        int[] valores = new int[5];
        int total = 0;

        // Solicitar los números
        System.out.println("Digite 5 números para calcular el promedio:");

        for (int i = 0; i < valores.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            valores[i] = entrada.nextInt();
            total += valores[i]; // Sumar cada número ingresado
        }

        // Cálculo del promedio
        double promedio = total / (double) valores.length;

        // Mostrar el resultado
        System.out.println("\nEl promedio de los números ingresados es: " + promedio);

        entrada.close();
    }
}


