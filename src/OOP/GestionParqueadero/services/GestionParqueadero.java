package OOP.GestionParqueadero.services;

import java.util.List;
import java.util.ArrayList;

public class GestionParqueadero {
    private List<Vehiculo> vehiculos;
    private List<EspacioParqueadero> espacios;

    public GestionParqueadero() {
        this.vehiculos = new ArrayList<>();
        this.espacios = new ArrayList<>();
    }

    public void registrarVehiculo(String placa, String tipo, String propietario) {
        Vehiculo vehiculo = new Vehiculo(placa, tipo, propietario);
        vehiculos.add(vehiculo);
        System.out.println("Vehiculo registrado: " + vehiculo);
    }

    public void agregarEspacio(int numeroEspacio, String tipoPermitido) {
        EspacioParqueadero espacio = new EspacioParqueadero(numeroEspacio, tipoPermitido);
        espacios.add(espacio);
    }

    public void mostrarEspaciosDisponibles() {
        System.out.println("\n=== Espacios Disponibles ===");
        boolean hayDisponibles = false;
        for (EspacioParqueadero espacio : espacios) {
            if (espacio.isDisponible()) {
                System.out.println(espacio);
                hayDisponibles = true;
            }
        }
        if (!hayDisponibles) {
            System.out.println("No hay espacios disponibles");
        }
    }

    public void mostrarTodosLosEspacios() {
        System.out.println("\n=== Todos los Espacios ===");
        for (EspacioParqueadero espacio : espacios) {
            System.out.println(espacio);
        }
    }

    public void asignarEspacio(String placa, int numeroEspacio) {
        Vehiculo vehiculo = buscarVehiculo(placa);
        if (vehiculo == null) {
            System.out.println("Vehiculo con placa " + placa + " no encontrado");
            return;
        }

        EspacioParqueadero espacio = buscarEspacio(numeroEspacio);
        if (espacio == null) {
            System.out.println("Espacio " + numeroEspacio + " no encontrado");
            return;
        }

        if (!espacio.isDisponible()) {
            System.out.println("El espacio " + numeroEspacio + " ya esta ocupado");
            return;
        }

        if (!espacio.getTipoPermitido().equalsIgnoreCase(vehiculo.getTipo())) {
            System.out.println("Error: El vehiculo tipo " + vehiculo.getTipo() +
                    " no puede ocupar un espacio para " + espacio.getTipoPermitido());
            return;
        }

        espacio.asignarVehiculo(vehiculo);
        System.out.println("Espacio asignado exitosamente");
        System.out.println(espacio);
    }

    public void liberarEspacio(int numeroEspacio) {
        EspacioParqueadero espacio = buscarEspacio(numeroEspacio);
        if (espacio == null) {
            System.out.println("Espacio " + numeroEspacio + " no encontrado");
            return;
        }

        if (espacio.isDisponible()) {
            System.out.println("El espacio " + numeroEspacio + " ya esta disponible");
            return;
        }

        espacio.liberarEspacio();
        System.out.println("Espacio " + numeroEspacio + " liberado exitosamente");
    }

    private Vehiculo buscarVehiculo(String placa) {
        for (Vehiculo vehiculo : vehiculos) {
            if (vehiculo.getPlaca().equalsIgnoreCase(placa)) {
                return vehiculo;
            }
        }
        return null;
    }

    private EspacioParqueadero buscarEspacio(int numeroEspacio) {
        for (EspacioParqueadero espacio : espacios) {
            if (espacio.getNumeroEspacio() == numeroEspacio) {
                return espacio;
            }
        }
        return null;
    }
}

/* Simple domain implementations placed in the same file so the service compiles without external domain classes. */

class Vehiculo {
    private String placa;
    private String tipo;
    private String propietario;

    public Vehiculo(String placa, String tipo, String propietario) {
        this.placa = placa;
        this.tipo = tipo;
        this.propietario = propietario;
    }

    public String getPlaca() {
        return placa;
    }

    public String getTipo() {
        return tipo;
    }

    public String getPropietario() {
        return propietario;
    }

    @Override
    public String toString() {
        return "Vehiculo{placa='" + placa + "', tipo='" + tipo + "', propietario='" + propietario + "'}";
    }
}

class EspacioParqueadero {
    private int numeroEspacio;
    private String tipoPermitido;
    private boolean disponible;
    private Vehiculo vehiculo;

    public EspacioParqueadero(int numeroEspacio, String tipoPermitido) {
        this.numeroEspacio = numeroEspacio;
        this.tipoPermitido = tipoPermitido;
        this.disponible = true;
        this.vehiculo = null;
    }

    public int getNumeroEspacio() {
        return numeroEspacio;
    }

    public String getTipoPermitido() {
        return tipoPermitido;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void asignarVehiculo(Vehiculo v) {
        this.vehiculo = v;
        this.disponible = false;
    }

    public void liberarEspacio() {
        this.vehiculo = null;
        this.disponible = true;
    }

    @Override
    public String toString() {
        return "EspacioParqueadero{numero=" + numeroEspacio + ", tipoPermitido='" + tipoPermitido + "', disponible=" + disponible + ", vehiculo=" + (vehiculo != null ? vehiculo.getPlaca() : "ninguno") + "}";
    }
}
