package OOP;
import java.util.Scanner;


public class MiniJuego {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Crear a Iron Man y Ultron
        Hero ironman = new Hero("Iron Man", 25, 30, 120);
        Villano ultron = new Villano("Ultron", 28, 25, 140);

        System.out.println("╔═══════════════════════════════╗");
        System.out.println("║      MARVEL TECH WARS         ║");
        System.out.println("╚═══════════════════════════════╝\n");

        ironman.mostrarEstadisticas();
        ultron.mostrarEstadisticas();

        boolean juegoActivo = true;
        int opcion;

        do {

            if (ironman.resistencia <= 0) {
                System.out.println("\n Ultron va ganando la batalla… el mundo se enceuntra en peligro");
                break;
            }

            if (ultron.resistencia <= 0) {
                System.out.println("\nIron Man ha ganado El mundo se encuentra a salvo una vez más.");
                break;
            }

            // Menú del juego
            System.out.println("\n--- ELIGE EL TURNO ---");
            System.out.println("1. Iron Man ataca con los Repulsores");
            System.out.println("2. Iron Man usa su ataque Rayo del Pecho (Especial)");
            System.out.println("3. Ultron ataca con el Golpe Mecánico");
            System.out.println("4. Ultron usa el atque Mecha-Hack (Especial)");
            System.out.println("5. Iron Man se repara");
            System.out.println("6. Ultron se autorepara");
            System.out.println("7. Mostrar estadísticas de personajes");
            System.out.println("8. Salir del apartado");
            System.out.print(" Elige la opcion: ");

            opcion = scanner.nextInt();

            switch (opcion) {
                case 1 -> ironman.atacar(ultron);
                case 2 -> ironman.rayoDelPecho(ultron);
                case 3 -> ultron.atacar(ironman);
                case 4 -> ultron.mechahack(ironman);
                case 5 -> ironman.repararse();
                case 6 -> ultron.repararse();
                case 7 -> {
                    ironman.mostrarEstadisticas();
                    ultron.mostrarEstadisticas();
                }
                case 8 -> {
                    System.out.println("Gracias por jugar MARVEL TECH WARS");
                    juegoActivo = false;
                }
                default -> System.out.println("Opción incorrecta");
            }

        } while (juegoActivo);

        scanner.close();
    }
}

// CLASE PRINCIPAL: PERSONAJE

class Personaje {
    protected String nombre;
    protected int poder;
    protected int velocidad;
    protected int resistencia;

    public Personaje(String nombre, int poder, int velocidad, int resistencia) {
        this.nombre = nombre;
        this.poder = poder;
        this.velocidad = velocidad;
        this.resistencia = resistencia;
    }

    public void atacar(Personaje enemigo) {
        System.out.println(nombre + " ataca causando " + poder + " de daño.");
        enemigo.resistencia -= poder;
        if (enemigo.resistencia < 0) enemigo.resistencia = 0;
        System.out.println("➡ " + enemigo.nombre + " ahora tiene " + enemigo.resistencia + " de resistencia.");
    }

    public void mostrarEstadisticas() {
        System.out.println("\n────────── ESTADÍSTICAS ──────────");
        System.out.println("Nombre: " + nombre);
        System.out.println("Poder: " + poder);
        System.out.println("Velocidad: " + velocidad);
        System.out.println("Resistencia: " + resistencia);
        System.out.println("──────────────────────────────────\n");
    }

    public void repararse() {
        resistencia += 20;
        System.out.println(nombre + " se repara y ahora tiene " + resistencia + " de resistencia.");
    }
}

// NOMBRE DEL HÉROE: IRON MAN
class Hero extends Personaje {

    public Hero(String nombre, int poder, int velocidad, int resistencia) {
        super(nombre, poder, velocidad, resistencia);
    }

    // Ataque especial único del heroe IRON MAN
    public void rayoDelPecho(Personaje enemigo) {
        int daño = poder + (velocidad * 2);
        System.out.println("⚡ " + nombre + " dispara su RAYO DEL PECHO causando " + daño + " de daño total.");
        enemigo.resistencia -= daño;
        if (enemigo.resistencia < 0) enemigo.resistencia = 0;
        System.out.println("➡ " + enemigo.nombre + " ahora tiene " + enemigo.resistencia + " de resistencia.");
    }
}

// NOMBRE DEL VILLANO: ULTRON

class Villano extends Personaje {

    public Villano(String nombre, int poder, int velocidad, int resistencia) {
        super(nombre, poder, velocidad, resistencia);
    }

    // Ataque especial exclusivo del villano Ultron
    public void mechahack(Personaje enemigo) {
        int daño = (poder * 2) + 10;
        System.out.println(" Ultron usa MECHA-HACK bloqueando la armadura y causando " + daño + " de daño.");
        enemigo.resistencia -= daño;
        if (enemigo.resistencia < 0) enemigo.resistencia = 0;
        System.out.println(enemigo.nombre + " ahora tiene " + enemigo.resistencia + " de resistencia.");
    }
}
