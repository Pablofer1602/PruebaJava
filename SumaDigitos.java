public class SumaDigitos {
    /**
     * Calcula la suma de los dígitos de todos los números de 1 a N (ambos incluidos).
     * @param n Número límite
     * @return Suma de los dígitos
     */
    public static int sumaDigitosHastaN(int n) {
        int sumaTotal = 0;

        // Iterar sobre todos los números del 1 al N
        for (int i = 1; i <= n; i++) {
            int numero = i;

            // Sumar los dígitos del número
            while (numero > 0) {
                sumaTotal += numero % 10;  // Extraer el dígito
                numero /= 10;  // Eliminar el último dígito
            }
        }

        return sumaTotal;
    }

    public static void main(String[] args) {
        int n = 12;  // Cambia el valor de 'n' para probar diferentes resultados

        // Calcular y mostrar el resultado
        int resultado = sumaDigitosHastaN(n);
        System.out.println("Suma de los dígitos del 1 al " + n + ": " + resultado);
    }
}
