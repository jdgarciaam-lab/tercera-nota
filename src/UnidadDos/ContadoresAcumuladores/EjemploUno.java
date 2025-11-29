package UnidadDos.ContadoresAcumuladores;

public class EjemploUno {
    int contador = 0;  // Inicializamos el contador

    public static void main(String[] args) {
        EjemploUno ejemplo = new EjemploUno();
        for (int i = 0; i < 10; i++) {
            ejemplo.contador++;  // Incrementamos el contador en cada iteración
        }

        System.out.println("El contador es: " + ejemplo.contador);
    }
}
