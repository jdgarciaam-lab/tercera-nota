package UnidadDos.Funcionalidades;
import java.util.ArrayList;
public class EjemploSiete {
      public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();

        lista.add("Java");
        lista.add("Python");
        lista.add("JavaScript");

        for (String lenguaje : lista) {
            System.out.println(lenguaje);
        }
    }
}


