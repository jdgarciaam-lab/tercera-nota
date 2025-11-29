package UnidadUno.ArraysCasosDeUsos;
public class uno {

public int[] calificaciones = {85, 90, 78, 92, 88};
int suma = 0;

public static void main(String[] args) {
    uno instance = new uno();
    for (int calificacion : instance.calificaciones) {
        instance.suma += calificacion;
    }

    double promedio = instance.suma / (double) instance.calificaciones.length;
    System.out.println("El promedio de las calificaciones es: " + promedio);
}
}