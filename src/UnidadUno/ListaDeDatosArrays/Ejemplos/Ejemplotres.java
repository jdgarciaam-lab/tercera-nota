package UnidadUno.ListaDeDatosArrays.Ejemplos;

public class Ejemplotres {

    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        imprimirArray(numeros); // Llama a la función y pasa el array
    }

    public static void imprimirArray(int[] array) {
        for (int numero : array) {
            System.out.println("Número: " + numero);
        }
    }
}
