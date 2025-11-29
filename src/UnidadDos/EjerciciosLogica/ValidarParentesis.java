package UnidadDos.EjerciciosLogica;
import java.util.Stack;

public class ValidarParentesis {

    public static boolean esValido(String s) {
        // Crear una pila para rastrear los paréntesis
        Stack<Character> stack = new Stack<>();

        // Recorrer cada carácter del string
        for (char c : s.toCharArray()) {
            // Si es un paréntesis de apertura, agregarlo a la pila
            if (c == '(') {
                stack.push(c);
            }
            // Si es un paréntesis de cierre
            else if (c == ')') {
                // Verificar si la pila está vacía, en ese caso el orden es inválido
                if (stack.isEmpty()) {
                    return false;
                }
                // Sacar el paréntesis de apertura correspondiente
                stack.pop();
            }
        }

        // Verificar si la pila está vacía al final (todos los paréntesis han sido emparejados)
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        // Ejemplos de prueba
        System.out.println(esValido("()"));              // true
        System.out.println(esValido(")(()))"));          // false
        System.out.println(esValido("("));               // false
        System.out.println(esValido("(())((()())())"));  // true
    }
}
