package UnidadUno.ArraysCasosDeUsos;

public class dos {
    public static void main(String[] args) {
        int[] numeros = {3, 7, 9, 15, 20};
        int buscado = 9;
        boolean encontrado = false;

        for (int numero : numeros) {
            if (numero == buscado) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("El número " + buscado + " se encontró en el array.");
        } else {
            System.out.println("El número " + buscado + " no está en el array.");
        }
    }
}
