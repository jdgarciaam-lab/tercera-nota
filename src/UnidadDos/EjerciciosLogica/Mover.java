package UnidadDos.EjerciciosLogica;


    import java.util.ArrayList;
import java.util.List;

public class Mover {

    public static List<Object> moverCeros(List<Object> input) {
        List<Object> resultado = new ArrayList<>();

        // Añadir elementos distintos de cero al resultado
        for (Object elemento : input) {
            if (!(elemento instanceof Integer && (Integer) elemento == 0)) {
                resultado.add(elemento);
            }
        }

        // Añadir los ceros al final
        for (Object elemento : input) {
            if (elemento instanceof Integer && (Integer) elemento == 0) {
                resultado.add(0);
            }
        }

        return resultado;
    }

    public static void main(String[] args) {
        List<Object> input = List.of(false, 1, 0, 1, 2, 0, 1, 3, "a");
        List<Object> resultado = moverCeros(input);
        System.out.println(resultado);
    }
}


