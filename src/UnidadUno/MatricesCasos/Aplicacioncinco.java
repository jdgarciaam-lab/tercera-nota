package UnidadUno.MatricesCasos;

public class Aplicacioncinco {
    int[][] distancias = {
    {0, 10, 15, 20},
    {10, 0, 35, 25},
    {15, 35, 0, 30},
    {20, 25, 30, 0}
};
 
    public static void main(String[] args) {
        Aplicacioncinco app = new Aplicacioncinco();
        app.mostrarDistancia();
    }

    public void mostrarDistancia() {
        for (int i = 0; i < distancias.length; i++) {
            for (int j = 0; j < distancias[i].length; j++) {
                System.out.print(distancias[i][j] + " ");
            }
            System.out.println();
        }
    }
}