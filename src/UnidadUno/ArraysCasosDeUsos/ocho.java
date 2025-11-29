package UnidadUno.ArraysCasosDeUsos;

import java.util.Arrays;

public class ocho {
    public static void main(String[] args) {
        int[] numeros = {1, 3, 5, 7, 9, 11};
        int buscado = 7;
        int posicion = Arrays.binarySearch(numeros, buscado);

        if (posicion >= 0) {
            System.out.println("Número " + buscado + " encontrado en la posición: " + posicion);
        } else {
            System.out.println("Número no encontrado.");
        }
    }
}
