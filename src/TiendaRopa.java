public class TiendaRopa {
    public static void main(String[] args) {
        
        // Precios originales
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;
        
        // Descuento general del 15%
        double descuentoGeneral = 0.15;
        
        // Calcular primera camiseta y pantalón con 15% de descuento
        double camiseta1 = precioCamiseta - (precioCamiseta * descuentoGeneral);
        double pantalon = precioPantalon - (precioPantalon * descuentoGeneral);
        
        // Segunda camiseta con 15% y luego 5% adicional
        double camiseta2 = precioCamiseta - (precioCamiseta * descuentoGeneral);
        camiseta2 = camiseta2 - (camiseta2 * 0.05);
        
        // Calcular total
        double total = camiseta1 + pantalon + camiseta2;
        
        // Mostrar resultados
        System.out.println("Precio de la primera camiseta: $" + String.format("%.2f", camiseta1));
        System.out.println("Precio del pantalón: $" + String.format("%.2f", pantalon));
        System.out.println("Precio de la segunda camiseta: $" + String.format("%.2f", camiseta2));
        System.out.println("Precio total a pagar: $" + String.format("%.2f", total));
    }
}



