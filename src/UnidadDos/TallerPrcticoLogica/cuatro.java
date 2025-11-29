package UnidadDos.TallerPrcticoLogica;

public class cuatro {
    public class NumerosPrimos {
    public static boolean esPrimo(int num) {
        if (num < 2) return false;
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Comprobar un número
        System.out.println(esPrimo(29)); // true

        // Imprimir todos los primos entre 1 y 100
        for (int i = 1; i <= 100; i++) {
            if (esPrimo(i)) {
                System.out.print(i + " ");
            }
        }
    }
}

}
