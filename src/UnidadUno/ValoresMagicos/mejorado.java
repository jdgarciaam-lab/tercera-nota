package UnidadUno.ValoresMagicos;

public class mejorado {
    
    // Definimos constantes descriptivas
    final static double PORCENTAJE_DESCUENTO = 0.15;
    final static double PORCENTAJE_IVA = 0.19;

    public static void main(String[] args) {
        double precioBase = 100;
        double descuento = precioBase * PORCENTAJE_DESCUENTO;
        double iva = precioBase * PORCENTAJE_IVA;
        double precioFinal = precioBase - descuento + iva;
        System.out.println("El precio final es: " + precioFinal);
    }
}
