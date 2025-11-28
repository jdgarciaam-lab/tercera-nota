package UnidadUno.ListaDeDatosArrays.Ejemplos;

public class basico {
   
    public static void main(String[] args) {
        // Declarar e inicializar el array
        int[] numeros = {10, 20, 30, 40, 50};

        // Acceder a elementos del array
        System.out.println("El primer número es: " + numeros[0]); // Imprime 10
        System.out.println("El segundo número es: " + numeros[1]); // Imprime 20

        // Modificar un elemento del array
        numeros[2] = 100;
        System.out.println("El tercer número ahora es: " + numeros[2]); // Imprime 100
    }
}
