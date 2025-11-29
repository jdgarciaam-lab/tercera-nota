package UnidadDos.TallerPrcticoLogica;

public class cinco {
    public class AreaPoligono {
    public static double calcularArea(String tipo, double base, double altura, double lado) {
        switch (tipo.toLowerCase()) {
            case "triangulo":
                return (base * altura) / 2;
            case "cuadrado":
                return lado * lado;
            case "rectangulo":
                return base * altura;
            default:
                System.out.println("Polígono no soportado");
                return -1;
        }
    }

    public static void main(String[] args) {
        System.out.println(calcularArea("triangulo", 10, 5, 0)); // 25
        System.out.println(calcularArea("cuadrado", 0, 0, 4));   // 16
        System.out.println(calcularArea("rectangulo", 8, 3, 0)); // 24
    }
}

}
