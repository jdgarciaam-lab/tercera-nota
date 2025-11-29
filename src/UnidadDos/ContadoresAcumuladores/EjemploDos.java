package UnidadDos.ContadoresAcumuladores;
public class EjemploDos {
    static int[] numeros = {1, 2, 3, 4, 5, 6}; // Hacer estática
    static int contadorPares = 0; // Hacer estática

    public static void main(String[] args) {
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                contadorPares++;
            }
        }
        System.out.println("Cantidad de números pares: " + contadorPares);
    }
}
