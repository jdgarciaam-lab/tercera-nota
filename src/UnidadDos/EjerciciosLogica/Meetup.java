package UnidadDos.EjerciciosLogica;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Desarrollador {
    String firstName;
    String lastName;
    String country;
    String continent;
    int age;
    String language;

    public Desarrollador(String firstName, String lastName, String country, String continent, int age, String language) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.continent = continent;
        this.age = age;
        this.language = language;
    }

    @Override
    public String toString() {
        return "Desarrollador{" +
                "firstName=" + firstName + "\\" +
                ", lastName=" + lastName + "\\" +
                ", country='" + country + "\\" +
                ", continent='" + continent + "\\" +
                ", age=" + age +
                ", language='" + language + "\\" +
                '}';    
    }
}


public class Meetup {

    public static boolean continentesRepresentados(List<Desarrollador> desarrolladores) {
        Set<String> continentesNecesarios = Set.of("Africa", "Americas", "Asia", "Europe", "Oceania");
        Set<String> continentesEncontrados = new HashSet<>();

        for (Desarrollador dev : desarrolladores) {
            continentesEncontrados.add(dev.continent);
        }

        return continentesEncontrados.containsAll(continentesNecesarios);
    }

    public static long contarJSDesarrolladoresEuropa(List<Desarrollador> desarrolladores) {
        return desarrolladores.stream()
                .filter(dev -> dev.language.equals("JavaScript") && dev.continent.equals("Europe"))
                .count();
    }

    public static List<Desarrollador> agregarSaludo(List<Desarrollador> desarrolladores) {
        for (Desarrollador dev : desarrolladores) {
            System.out.println("Hi " + dev.firstName + ", what do you like the most about " + dev.language + "?");
        }
        return desarrolladores;
    }

    public static Set<String> listarLenguajesRepresentados(List<Desarrollador> desarrolladores) {
        Set<String> lenguajes = new HashSet<>();
        for (Desarrollador dev : desarrolladores) {
            lenguajes.add(dev.language);
        }
        return lenguajes;
    }

    public static void main(String[] args) {
        List<Desarrollador> desarrolladores = List.of(
                new Desarrollador("Fatima", "A.", "Algeria", "Africa", 25, "JavaScript"),
                new Desarrollador("Agustín", "M.", "Chile", "Americas", 37, "C"),
                new Desarrollador("Jing", "X.", "China", "Asia", 39, "Ruby"),
                new Desarrollador("Laia", "P.", "Andorra", "Europe", 55, "Ruby"),
                new Desarrollador("Oliver", "Q.", "Australia", "Oceania", 65, "PHP")
        );

        // Verificar si todos los continentes están representados
        System.out.println("¿Todos los continentes están representados? " + continentesRepresentados(desarrolladores));

        // Contar JavaScript developers de Europa
        System.out.println("Cantidad de desarrolladores de JavaScript en Europa: " + contarJSDesarrolladoresEuropa(desarrolladores));

        // Agregar saludo a cada desarrollador
        agregarSaludo(desarrolladores);

        // Listar lenguajes representados
        System.out.println("Lenguajes representados: " + listarLenguajesRepresentados(desarrolladores));
    }
}
