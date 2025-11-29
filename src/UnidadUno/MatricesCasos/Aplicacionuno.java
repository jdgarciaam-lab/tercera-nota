package UnidadUno.MatricesCasos;

public class Aplicacionuno {
    double[][] precios = {
    {10.5, 12.0, 11.8}, // Precios del producto 1 en las tres tiendas
    {15.0, 13.5, 14.0}, // Precios del producto 2
    {20.5, 19.0, 21.0}, // Precios del producto 3
    {30.0, 29.5, 28.5}  // Precios del producto 4
};

    public void calcularPromedios() {
        for (int i = 0; i < precios.length; i++) {
            double suma = 0;
            for (int j = 0; j < precios[i].length; j++) {
                suma += precios[i][j];
            }
            System.out.println("El promedio de precios del producto " + (i + 1) + " es: " + (suma / precios[i].length));
        }
    }
}
