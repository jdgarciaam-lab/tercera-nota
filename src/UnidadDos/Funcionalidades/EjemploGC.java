package UnidadDos.Funcionalidades;

public class EjemploGC {
   
    public static void main(String[] args) {
        // Creamos un objeto
        EjemploGC obj = new EjemploGC();

        // El objeto ya no tiene referencia después de ser nulo
        obj = null;

        // El recolector de basura podrá liberar la memoria de este objeto
        System.gc();  // Sugerimos a la JVM iniciar el Garbage Collection
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("El objeto se está eliminando");
    }
}

