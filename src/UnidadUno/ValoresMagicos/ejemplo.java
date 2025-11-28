package UnidadUno.ValoresMagicos;

public class ejemplo {
   
    public static void main(String[] args) {
        double precioBase = 100;
        double descuento = precioBase * 0.15; // Valor mágico
        double iva = precioBase * 0.19; // Valor mágico
        double precioFinal = precioBase - descuento + iva;
        System.out.println("El precio final es: " + precioFinal);
    }
}

