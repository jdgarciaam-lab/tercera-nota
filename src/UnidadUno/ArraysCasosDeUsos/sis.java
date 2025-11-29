package UnidadUno.ArraysCasosDeUsos;

public class sis {

    public static void main(String[] args) {
        int[] numeros = {3, 7, 3, 9, 3, 1, 3};
        int contador = 0;

        for (int numero : numeros) {
            if (numero == 3) {
                contador++;
            }
        }

        System.out.println("El número 3 aparece " + contador + " veces.");
    }
}
