package OOP.GestionParqueadero.app;
public class App {
    public static void main(String[] args) {
        GestionParqueadero gestion = new GestionParqueadero();

        gestion.agregarEspacio(1, "carro");
        gestion.agregarEspacio(2, "carro");
        gestion.agregarEspacio(3, "moto");
        gestion.agregarEspacio(4, "moto");
        gestion.agregarEspacio(5, "carro");

        gestion.registrarVehiculo("ABC123", "carro", "Juan Perez");
        gestion.registrarVehiculo("XYZ789", "moto", "Maria Garcia");
        gestion.registrarVehiculo("DEF456", "carro", "Pedro Lopez");
        gestion.registrarVehiculo("GHI789", "moto", "Ana Martinez");

        gestion.mostrarEspaciosDisponibles();

        System.out.println("\n=== Asignando Espacios ===");
        gestion.asignarEspacio("ABC123", 1);
        gestion.asignarEspacio("XYZ789", 3);

        System.out.println("\n=== Intentando asignar moto en espacio de carro ===");
        gestion.asignarEspacio("GHI789", 2);

        System.out.println("\n=== Intentando asignar carro en espacio de moto ===");
        gestion.asignarEspacio("DEF456", 4);

        gestion.mostrarTodosLosEspacios();

        System.out.println("\n=== Liberando Espacio 1 ===");
        gestion.liberarEspacio(1);

        gestion.mostrarEspaciosDisponibles();

        System.out.println("\n=== Asignando vehiculo al espacio liberado ===");
        gestion.asignarEspacio("DEF456", 1);

        gestion.mostrarTodosLosEspacios();
    }
}

class GestionParqueadero {
    private static class Espacio {
        int id;
        String tipo;
        boolean ocupado;
        String placa;
        String duenio;

        Espacio(int id, String tipo) {
            this.id = id;
            this.tipo = tipo;
            this.ocupado = false;
        }
    }

    private final java.util.Map<Integer, Espacio> espacios = new java.util.LinkedHashMap<>();
    private final java.util.Map<String, String> vehiculos = new java.util.HashMap<>(); // placa -> tipo
    private final java.util.Map<String, String> propietarios = new java.util.HashMap<>(); // placa -> dueño

    public void agregarEspacio(int id, String tipo) {
        espacios.put(id, new Espacio(id, tipo));
    }

    public void registrarVehiculo(String placa, String tipo, String duenio) {
        vehiculos.put(placa, tipo);
        propietarios.put(placa, duenio);
        System.out.println("Registrado: " + placa + " tipo: " + tipo + " dueño: " + duenio);
    }

    public void mostrarEspaciosDisponibles() {
        System.out.println("\nEspacios disponibles:");
        for (Espacio e : espacios.values()) {
            if (!e.ocupado) {
                System.out.println("Espacio " + e.id + " - " + e.tipo);
            }
        }
    }

    public void asignarEspacio(String placa, int id) {
        Espacio e = espacios.get(id);
        if (e == null) {
            System.out.println("Espacio " + id + " no existe.");
            return;
        }
        String tipoVeh = vehiculos.get(placa);
        if (tipoVeh == null) {
            System.out.println("Vehículo " + placa + " no está registrado.");
            return;
        }
        if (!e.tipo.equalsIgnoreCase(tipoVeh)) {
            System.out.println("Tipo incompatible: espacio " + e.tipo + " vs vehículo " + tipoVeh);
            return;
        }
        if (e.ocupado) {
            System.out.println("Espacio " + id + " ya está ocupado.");
            return;
        }
        e.ocupado = true;
        e.placa = placa;
        e.duenio = propietarios.get(placa);
        System.out.println("Asignado vehículo " + placa + " al espacio " + id);
    }

    public void liberarEspacio(int id) {
        Espacio e = espacios.get(id);
        if (e == null) {
            System.out.println("Espacio " + id + " no existe.");
            return;
        }
        if (!e.ocupado) {
            System.out.println("Espacio " + id + " ya está libre.");
            return;
        }
        System.out.println("Liberando espacio " + id + " ocupado por " + e.placa);
        e.ocupado = false;
        e.placa = null;
        e.duenio = null;
    }

    public void mostrarTodosLosEspacios() {
        System.out.println("\nTodos los espacios:");
        for (Espacio e : espacios.values()) {
            String estado = e.ocupado ? "Ocupado por " + e.placa + " (" + e.duenio + ")" : "Libre";
            System.out.println("Espacio " + e.id + " - " + e.tipo + " - " + estado);
        }
    }
}
