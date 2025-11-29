package UnidadDos.Arrays;


   import java.util.Scanner;

public class E9 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Bienvenido al sistema de temperaturas ***");
        System.out.println("__________________________________________________________________");
        // Declaración de los vectores para almacenar las temperaturas 
        float[] tempMinima = new float[5];
        float[] tempMaxima = new float[5];
        String[] dias = {"Dia1", "Dia2", "Dia3", "Dia4", "Dia5"};
        // Vector para almacenar las temperaturas medias
        float[] tempMedia = new float[5];
        int tamañoVector = tempMaxima.length;
        // Inicializacióon de los vectores con un ciclo for 
        for (int i = 0; i < tamañoVector; i++) {
            System.out.print("Ingrese la temperatura mínima del dia " + dias[i] + ": ");
            tempMinima[i] = consola.nextFloat(); 
            System.out.print("Ingrese la temperatura máxima del dia " + dias[i] + ": ");
            tempMaxima[i] = consola.nextFloat(); 
            // Calculamos la temperatura media para cada dia
            tempMedia[i] = (tempMaxima[i] + tempMinima[i]) / 2;
        }
        
        // Temperatura media de cada dia
        System.out.println("Temperaturas medias de cada dia: ");
        for (int i = 0; i < tamañoVector; i++) {
            System.out.println("La temperatura media del dia " + dias[i] + " es: " + tempMedia[i]);
        }
        //Determinar los dias con menos temperaturas
        float minGlobal = 0f;
        String dia = null;
        for (int i = 0; i < tamañoVector; i++) {
            if (tempMinima[i] < minGlobal) {
                minGlobal = tempMinima[i];
            }
            dia = dias[i];
        }
        System.out.println("\nEl dia con la temperatura minima es: " + dia);
        System.out.println("_________________________________________________________");
        // Buscar una temperatura
        System.out.print("Ingrese la temperatura que desea buscar: ");
        float tempBuscada = consola.nextFloat();
        boolean encontrada = false;
        System.out.print("Días con temperatura máxima de " + String.format("%.2f", tempBuscada) + "°C: ");
        boolean primerDiaCoincidente = true;
        for (int i = 0; i < 5; i++) {
            if (tempMaxima[i] == tempBuscada) {
                if (!primerDiaCoincidente) {
                    System.out.print(", ");
                }
                System.out.print(dias[i]);
                encontrada = true;
                primerDiaCoincidente = false;
            }
        }

        if (!encontrada) {
            System.out.println("No se encontraron días con esa temperatura máxima.");
        } else {
            System.out.println();
        }





        consola.close();
    }
}

