package UnidadDos.ContadoresAcumuladores;

public class EjemploCuatro {
    int[] calificaciones = {80, 90, 70, 85, 95};
    int sumaCalificaciones = 0;  // Inicializamos el acumulador

    public static void main(String[] args) {
        EjemploCuatro ejemplo = new EjemploCuatro();
        for (int calificacion : ejemplo.calificaciones) {
            ejemplo.sumaCalificaciones += calificacion;  // Acumulamos las calificaciones
        }

        double promedio = (double) ejemplo.sumaCalificaciones / ejemplo.calificaciones.length;
        System.out.println("El promedio de calificaciones es: " + promedio);
    }
}


