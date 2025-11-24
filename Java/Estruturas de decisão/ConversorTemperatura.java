public class ConversorTemperatura {
    public static void main(String[] args) {
        double temperaturaCelsius = 30.0;
        
        // LINHA DO ERRO: O programador tentou guardar o resultado numa variável
        double temperaturaFahrenheit = converterParaFahrenheit(temperaturaCelsius); 
        
        System.out.println("A temperatura final é: " + temperaturaFahrenheit);
    }

    // Definição do método feita pelo programador anterior
    public static double converterParaFahrenheit(double celsius) {
        double resultado = (celsius * 1.8) + 32;
        System.out.println("Convertendo...");
        return resultado;
    }
}