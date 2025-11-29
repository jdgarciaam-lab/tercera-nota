package UnidadDos.Funcionalidades;
public class EjemploDos {

    public static class Sobrecarga {
        public int sumar(int a, int b) {
            return a + b;
        }

        public double sumar(double a, double b) {
            return a + b;
        }

        public int sumar(int a, int b, int c) {
            return a + b + c;
        }
    }

    public static void main(String[] args) {
        Sobrecarga calc = new Sobrecarga();

        System.out.println("Suma de dos enteros: " + calc.sumar(5, 10));
        System.out.println("Suma de dos doubles: " + calc.sumar(5.5, 10.5));
        System.out.println("Suma de tres enteros: " + calc.sumar(5, 10, 15));
    }
}
