package UnidadDos.EjerciciosLogica;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// Clase que representa una Persona con atributos id, nombre y edad
class Persona {
    private String id;
    private String nombre;
    private int edad;

    // Constructor de la clase
    public Persona(String id, String nombre, int edad) {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
    }

    // Método toString para imprimir la información de la persona
    @Override
    public String toString() {
        return "{id: \"" + id + "\" nombre: \"" + nombre + "\", edad: " + edad + "}";
    }
}

// Clase Transformador que contiene el método para transformar los datos
public class Transformador {

    public static List<Persona> transformar(Map<String, List<Object>> data) {
        List<Persona> listaPersonas = new ArrayList<>();
        List<Object> nombres = data.get("nombres");
        List<Object> edades = data.get("edades");

        // Crear objetos Persona y añadirlos a la lista
        for (int i = 0; i < nombres.size(); i++) {
            String id = String.valueOf(i + 1);
            String nombre = (String) nombres.get(i);
            int edad = (int) edades.get(i);

            Persona persona = new Persona(id, nombre, edad);
            listaPersonas.add(persona);
        }

        return listaPersonas;
    }

    public static void main(String[] args) {
        // Ejemplo de datos de entrada
        Map<String, List<Object>> data = Map.of(
            "nombres", List.of("Bruno", "Andrea"),
            "edades", List.of(20, 19)
        );

        // Transformar los datos y mostrar el resultado
        List<Persona> resultado = transformar(data);
        System.out.println(resultado);
    }
}
