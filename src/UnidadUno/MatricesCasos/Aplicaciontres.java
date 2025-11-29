package UnidadUno.MatricesCasos;

public class Aplicaciontres {
    public static void main(String[] args) {
        int[][] imagenGris = {
            {255, 128, 0, 64},
            {64, 255, 128, 0},
            {0, 64, 255, 128},
            {128, 0, 64, 255}
        };
        // Mostrar la matriz invertida
        System.out.println("Matriz de imagen invertida:");
        for (int i = 0; i < imagenGris.length; i++) {
            for (int j = 0; j < imagenGris[i].length; j++) {
                System.out.print(imagenGris[i][j] + " ");
            }
            System.out.println();
        }
    }
}