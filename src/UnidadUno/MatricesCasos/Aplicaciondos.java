package UnidadUno.MatricesCasos;

public class Aplicaciondos {
    public static void main(String[] args) {
        char[][] tablero = {
            {'X', 'O', 'X'},
            {'O', 'X', 'O'},
            {' ', ' ', 'X'} // espacios vacíos
        };
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }
}
