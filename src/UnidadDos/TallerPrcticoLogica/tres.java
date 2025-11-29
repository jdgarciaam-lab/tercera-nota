package UnidadDos.TallerPrcticoLogica;

public class tres {
    public class Fibonacci {
    public static void main(String[] args) {
        long a = 0, b = 1;
        for (int i = 0; i < 50; i++) {
            System.out.print(a + " ");
            long siguiente = a + b;
            a = b;
            b = siguiente;
        }
    }
}

}
