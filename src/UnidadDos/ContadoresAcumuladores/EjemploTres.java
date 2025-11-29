package UnidadDos.ContadoresAcumuladores;

public class EjemploTres {
    int suma = 0;  // Inicializamos el acumulador

    public static void main(String[] args) {
        EjemploTres ejemplo = new EjemploTres();
        for (int i = 1; i <= 5; i++) {
            ejemplo.suma += i;  // Acumulamos el valor de i en cada iteración
        }

        System.out.println("La suma total es: " + ejemplo.suma);
    }
}
