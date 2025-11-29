package UnidadUno.ListaDatosMatrices;

public class Tablero {
    char[][] tablero = {
    {'X', 'O', 'X'},
    {'O', 'X', ' '},
    {' ', 'O', ' '}
};

    public void mostrarTablero() {
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
