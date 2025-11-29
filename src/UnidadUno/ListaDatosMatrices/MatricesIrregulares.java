package UnidadUno.ListaDatosMatrices;

public class MatricesIrregulares {
    public static void main(String[] args) {
        int[][] matrizIrregular = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };

        for (int i = 0; i < matrizIrregular.length; i++) {
            for (int j = 0; j < matrizIrregular[i].length; j++) {
                System.out.print(matrizIrregular[i][j] + " ");
            }
            System.out.println();
        }
    }
}
