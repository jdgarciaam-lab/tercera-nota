package UnidadDos.Funcionalidades;

public class EjemploSeis {

    public class Externa {
        private String mensaje = "¡Hola desde la clase externa!";

        public class Interna {
            public void mostrarMensaje() {
                System.out.println(mensaje);
            }
        }
    }

    public static void main(String[] args) {
        EjemploSeis outer = new EjemploSeis();

        // Crear objeto de Externa
        Externa externa = outer.new Externa();

        // Crear objeto de Interna
        Externa.Interna interna = externa.new Interna();

        interna.mostrarMensaje();
    }
}
