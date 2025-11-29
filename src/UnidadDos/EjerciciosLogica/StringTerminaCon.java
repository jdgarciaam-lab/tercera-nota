package UnidadDos.EjerciciosLogica;
public class StringTerminaCon {
    public static boolean terminaCon(String str, String ending) {
        return str.endsWith(ending);
    }

    // Versión alternativa sin usar el método endsWith
    public static boolean terminaConManual(String str, String ending) {
        // Si el final es más largo que el string original, no puede terminar con él
        if (ending.length() > str.length()) {
            return false;
        }

        // Comparar los últimos caracteres del string con el ending
        return str.substring(str.length() - ending.length()).equals(ending);
    }

    public static void main(String[] args) {
        // Pruebas usando endsWith
        System.out.println(terminaCon("abc", "bc"));     // true
        System.out.println(terminaCon("abc", "d"));      // false
        System.out.println(terminaCon("hola", "ola"));   // true
        System.out.println(terminaCon("hola", "hola"));  // true
        System.out.println(terminaCon("hola", ""));      // true

        // Pruebas usando la versión manual
        System.out.println(terminaConManual("abc", "bc"));     // true
        System.out.println(terminaConManual("abc", "d"));      // false
        System.out.println(terminaConManual("hola", "ola"));   // true
        System.out.println(terminaConManual("hola", "hola"));  // true
        System.out.println(terminaConManual("hola", ""));      // true
    }
}
