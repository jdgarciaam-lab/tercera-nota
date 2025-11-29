package UnidadDos.Funcionalidades;

public class EjemploCuatro {

    static class MiHilo extends Thread {
        @Override
        public void run() {
            System.out.println("Este es un hilo en ejecución: " + Thread.currentThread().getName());
        }
    }

    public static void main(String[] args) {

        MiHilo hilo1 = new MiHilo();
        MiHilo hilo2 = new MiHilo();

        hilo1.start();
        hilo2.start();
    }
}
