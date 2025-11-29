package UnidadDos.Arrays;


    import java.util.Scanner;

public class E8_2 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in);
        System.out.println("*** Bienvenido al Sistema de edades de alumnos ***");
        System.out.println("_________________________________________________________________");
        // Asumimos que el curso tiene 10 estudiantes 
        int edadMinima = 18;
        // Creacion ded los vectores 
        String[] nombreEstudiantes = new String[10];
        int[] edadEstudiantes = new int[10];
        int tamañoVector = nombreEstudiantes.length;
        // Contador para determinar cuantos estudiantes se registran en el sistema
         int cantEstuIngresados = 0;
        // Pedimos los datos por teclado con un ciclo for (inicializamos los vectores)
        for (int i = 0; i < tamañoVector; i++) {
            System.out.print("Por favor, ingrese el nombre del estudiante " + (i + 1) + " :");
            nombreEstudiantes[i] = consola.nextLine();
            // Con esta condicion validamos si se quiere seguir tomando datos o si se quiere terminar
            if (!nombreEstudiantes[i].equals("*")) {
                System.out.print("Por favor, ingrese la edad del estudiante " + (i + 1) + " :");
                edadEstudiantes[i] = consola.nextInt();
                consola.nextLine(); // Limpiar el buffer
                cantEstuIngresados ++;
            }else {
                break;
            }
        }
        // Creamos otra condicion para determinar los estudiantes mayores de edad y los más mayores
         System.out.println("Los estudiantes mayores de edad son: ");
         for (int i = 0; i < cantEstuIngresados; i++) {
            if (edadEstudiantes[i] == edadMinima) {
                System.out.print(nombreEstudiantes[i] + ",  ");
            }
         }
         System.out.println("\nLos estudiantes más mayores son: ");
         for (int i = 0; i < cantEstuIngresados; i++) {
            if (edadEstudiantes[i] > edadMinima) {
                System.out.print(nombreEstudiantes[i] + ", edad: " + edadEstudiantes[i] + " | ");
            }
         }
        
        consola.close();
    }
}

