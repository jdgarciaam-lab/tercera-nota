package UnidadDos.Arrays;

    import java.util.ArrayList;
import java.util.Scanner;

public class E8 {
    public static void main(String[] args) {
        Scanner consola = new Scanner(System.in); 
        // Declaración de los vectores
        ArrayList<String> nombresEstudiantes = new ArrayList<>();
        ArrayList<Integer> edades = new ArrayList<>();
        ArrayList<String> estudiantesMayoresEdad = new ArrayList<>();
        ArrayList<String> masMayor = new ArrayList<>();
        int edadMinima = 18;
        // Ciclo for para pedir los datos y al mismo tiemppo validarlos
        for (int i = 0; i < args.length; i++) {
            System.out.print("Ingrese el nombre del estudiante " + (i + 1) + " : ");
            nombresEstudiantes.add(consola.nextLine());
            if (!nombresEstudiantes.equals("*")) {
                System.out.println("Ingrese la edad del estudiante " + (i + 1) + " : ");
                int edadIndividual = consola.nextInt();
                edades.add(edadIndividual);
            }else{
                break;
            }
        }
        for (int edad : edades) {
            if (edad >= edadMinima) {
                for (String mayoresEdad : nombresEstudiantes) {
                    estudiantesMayoresEdad.add(mayoresEdad);
                }
            }else if (edad > 18) {
                 for (String mayoresEdad : nombresEstudiantes) {
                    masMayor.add(mayoresEdad);
                }
            }
        }
         for (int i = 0; i < args.length; i++) {
            System.out.println("Mayor e edad " + estudiantesMayoresEdad);
            System.out.println("Mas mayor: " + masMayor);
         }


    




        consola.close();
    }
}

