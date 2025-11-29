package UnidadDos.Arrays;
 import java.util.Arrays;
public class E5 {
    


    public static void main(String[] args) {
        System.out.println("*** Bienvenido al sitema de orden de  números ***");
        int[] numeros = {1, 45, 60, 54, 0, 30, 5, 3, 7, 2};
        int tamañoVector = numeros.length; 
        // Impresion del vector sin ordenar
        System.out.println("Impresión de los datos sin ordenar:");
        for (int i = 0; i < tamañoVector; i++) {
            System.out.print(numeros[i] + ", ");
        }
        // Ordenamos el vector de forma breve con un metodo
        Arrays.sort(numeros);
        // Impresión del vector con sus datos ordenados
        System.out.println("Impresion de los datos ordenados dde menor a mayor:");
        for (int i = 0; i < tamañoVector; i++) {
            System.out.print(numeros[i] + ", ");
        }
    }

}

