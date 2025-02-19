import java.util.ArrayList;
import java.util.List;

public class MoverCeros {
    /**
     * Mueve todos los ceros de un array al final, manteniendo el orden de los demás elementos.
     * @param array El array de entrada
     * @return Nuevo array con los ceros movidos al final
     */
    public static Object[] moverCerosAlFinal(Object[] array) {
        List<Object> sinCeros = new ArrayList<>();
        int contadorCeros = 0;

        // Iterar sobre todos los elementos del array
        for (Object elemento : array) {
            if (elemento.equals(0)) {
                // Contar el cero
                contadorCeros++;
            } else {
                // Agregar el elemento distinto de cero a la nueva lista
                sinCeros.add(elemento);
            }
        }

        // Agregar los ceros al final
        for (int i = 0; i < contadorCeros; i++) {
            sinCeros.add(0);
        }

        // Convertir la lista de vuelta a array
        return sinCeros.toArray();
    }

    public static void main(String[] args) {
        Object[] array = {false, 1, 0, 1, 2, 0, 1, 3, "a"};

        // Mover los ceros al final
        Object[] resultado = moverCerosAlFinal(array);

        // Mostrar el resultado
        System.out.print("Resultado: ");
        for (Object elemento : resultado) {
            System.out.print(elemento + " ");
        }
    }
}
