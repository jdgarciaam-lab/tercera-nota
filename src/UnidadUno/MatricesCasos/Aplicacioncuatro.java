package UnidadUno.MatricesCasos;
public class Aplicacioncuatro {
    public static void main(String[] args) {
        int[][] calificaciones = {
            {85, 90, 78, 92}, // Calificaciones del estudiante 1
            {88, 76, 95, 89}, // Calificaciones del estudiante 2
            {90, 88, 82, 91}  // Calificaciones del estudiante 3
        };

        for (int i = 0; i < calificaciones.length; i++) {
            int suma = 0;
            for (int j = 0; j < calificaciones[i].length; j++) {
                suma += calificaciones[i][j];
            }
            System.out.println("Promedio del estudiante " + (i + 1) + ": " + (suma / calificaciones[i].length));
        }
    }
}