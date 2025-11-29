package UnidadUno.ArraysCasosDeUsos;

public class siete {
    int[][] tablero = {
    {1, 0, 1},
    {0, 1, 0},
    {1, 0, 1}
};

    public siete() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
