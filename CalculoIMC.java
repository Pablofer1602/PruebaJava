public class CalculoIMC {
    /**
     * Calcula el IMC en función del peso y la altura y devuelve la clasificación correspondiente.
     * @param peso Peso de la persona en kilogramos
     * @param altura Altura de la persona en metros
     * @return Clasificación del IMC ("Infrapeso", "Normal", "Sobrepeso", "Obeso")
     */

    public static String calcularIMC(double peso, double altura) {
        // Cálculo del IMC
        double imc = peso / (altura * altura);

        // Clasificación según los criterios dados
        if (imc <= 18.5) {
            return "Infrapeso";
        } else if (imc <= 25.0) {
            return "Normal";
        } else if (imc <= 30.0) {
            return "Sobrepeso";
        } else {
            return "Obeso";
        }
    }

    public static void main(String[] args) {
        double peso = 50.0;    // Peso de prueba (Cambiar los valores del peso para probar diferentes resultados)
        double altura = 1.75;  // Altura de prueba (Cambiar los valores de la altura para probar diferentes resultados)

        // Llamada a la función y muestra del resultado
        String resultado = calcularIMC(peso, altura);
        System.out.println("Resultado IMC: " + resultado);
    }
}
