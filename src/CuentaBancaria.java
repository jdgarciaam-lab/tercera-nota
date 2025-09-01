public class CuentaBancaria {
    public static void main(String[] args) {
        
        // Datos iniciales
        double saldoInicial = 1000.0;
        double retiroSemanal = 200.0;
        int semanas = 4; // un mes
        
        // Calcular saldo final
        double saldoFinal = saldoInicial - (retiroSemanal * semanas);
        
        // Mostrar resultados
        System.out.println("Saldo inicial: $" + saldoInicial);
        System.out.println("Retiro semanal: $" + retiroSemanal);
        System.out.println("Número de semanas: " + semanas);
        System.out.println("Saldo final en la cuenta: $" + saldoFinal);
    }
}

