package UnidadDos.EjerciciosLogica; 
import java.util.HashMap;
import java.util.Map;

public class PalindromoVerificador {

    public static boolean puedeSerPalindromo(int numero) {
        // Convertir el número a una cadena y luego a un array de caracteres
        String numStr = Integer.toString(numero);
        char[] digitos = numStr.toCharArray();

        // Crear un mapa para contar la frecuencia de cada dígito
        Map<Character, Integer> conteoDigitos = new HashMap<>();
        for (char digito : digitos) {
            conteoDigitos.put(digito, conteoDigitos.getOrDefault(digito, 0) + 1);
        }

        // Verificar si puede ser un palíndromo
        int contadorImpares = 0;
        for (int frecuencia : conteoDigitos.values()) {
            if (frecuencia % 2 != 0) {
                contadorImpares++;
            }
            // Si hay más de un dígito con frecuencia impar, no es posible formar un palíndromo
            if (contadorImpares > 1) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        // Ejemplos de prueba
        System.out.println(puedeSerPalindromo(5));         // true
        System.out.println(puedeSerPalindromo(2121));      // true
        System.out.println(puedeSerPalindromo(1331));      // true
        System.out.println(puedeSerPalindromo(3357665));   // true
        System.out.println(puedeSerPalindromo(1294));      // false
    }
}
