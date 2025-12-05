package utilitarios;

public class Calculadora {

    public static double calcularAreaCirculo(double raio) {
        return 3.14159 * raio * raio;
    }

    public static double calcularAreaRetangulo(double largura, double altura) {
        return largura * altura;
    }

    public static double calcularAreaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

}