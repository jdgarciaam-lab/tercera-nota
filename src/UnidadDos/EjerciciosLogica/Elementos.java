package UnidadDos.EjerciciosLogica;
 import java.util.ArrayList;
import java.util.HashMap;

public class Elementos {
   


    // Método para obtener elementos que aparecen un número par de veces en la lista
    public static <T> ArrayList<T> elementosConCantidadPar(ArrayList<T> lista) {
        // Mapa para contar las ocurrencias de cada elemento
        HashMap<T, Integer> contadorElementos = new HashMap<>();

        // Contar las ocurrencias de cada elemento
        for (T elemento : lista) {
            contadorElementos.put(elemento, contadorElementos.getOrDefault(elemento, 0) + 1);
        }

        // Lista para almacenar los elementos con una cantidad par de apariciones
        ArrayList<T> elementosPares = new ArrayList<>();

        // Añadir a la lista los elementos con conteo par
        for (T elemento : contadorElementos.keySet()) {
            if (contadorElementos.get(elemento) % 2 == 0) {
                elementosPares.add(elemento);
            }
        }

        return elementosPares;
    }

    // Método main para probar la función con ejemplos
    public static void main(String[] args) {
        // Ejemplo 1: Lista de strings
        ArrayList<String> lista1 = new ArrayList<>();
        lista1.add("A");
        lista1.add("B");
        lista1.add("A");
        lista1.add("C");
        lista1.add("C");
        lista1.add("C");
        lista1.add("C");
        System.out.println(elementosConCantidadPar(lista1)); // -> ["A", "C"]

        // Ejemplo 2: Lista de enteros
        ArrayList<Integer> lista2 = new ArrayList<>();
        lista2.add(1);
        lista2.add(2);
        lista2.add(3);
        lista2.add(1);
        lista2.add(2);
        System.out.println(elementosConCantidadPar(lista2)); // -> [1, 2]
    }
}


