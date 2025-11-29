package UnidadDos.ContadoresAcumuladores;

public class EjemploSeis {
    int[] numeros = {-3, 5, -1, 9, -7, 4};

    public static void main(String[] args) {
        EjemploSeis ejemplo = new EjemploSeis();
        ejemplo.analizarNumeros();
    }

    public void analizarNumeros() {
        int contadorPositivos = 0;
        int contadorNegativos = 0;
        int contadorCeros = 0;
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        for (int numero : numeros) {
            if (numero > 0) {
                contadorPositivos++;
                sumaPositivos += numero;
            } else if (numero < 0) {
                contadorNegativos++;
                sumaNegativos += numero;
            } else {
                contadorCeros++;
            }
        }

        System.out.println("Positivos: " + contadorPositivos + " | Suma: " + sumaPositivos);
        System.out.println("Negativos: " + contadorNegativos + " | Suma: " + sumaNegativos);
        System.out.println("Ceros: " + contadorCeros);
    }
}
