package UnidadDos.Funcionalidades;

public class EjemploCinco {

    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Esto lanza una excepción
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        } finally {
            System.out.println("Este bloque se ejecuta siempre.");
        }
    }
}
