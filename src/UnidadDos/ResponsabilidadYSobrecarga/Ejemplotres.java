package UnidadDos.ResponsabilidadYSobrecarga;

public class Ejemplotres {
    static class Calculadora {
        // Responsabilidad: Sumar dos números
        public int sumar(int a, int b) {
            return a + b;
        }

        // Sobrecarga para sumar tres números
        public int sumar(int a, int b, int c) {
            return a + b + c;
        }

        // Sobrecarga para sumar dos números tipo double
        public double sumar(double a, double b) {
            return a + b;
        }

        // Responsabilidad: Restar dos números
        public int restar(int a, int b) {
            return a - b;
        }
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        // Usando el método sobrecargado 'sumar'
        System.out.println("Suma de 2 enteros: " + calc.sumar(5, 10));
        System.out.println("Suma de 3 enteros: " + calc.sumar(5, 10, 15));
        System.out.println("Suma de 2 doubles: " + calc.sumar(5.5, 10.5));

        // Usando el método 'restar'
        System.out.println("Resta de 2 enteros: " + calc.restar(20, 10));
    }
}
 

