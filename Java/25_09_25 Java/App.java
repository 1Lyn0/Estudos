import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        int valor1, valor2;

        Scanner teclado= new Scanner(System.in);

        System.out.print("Digite o valor 1:");
        valor1 = teclado.nextInt();
        System.out.print("Digite o valor 2:");
        valor2 = teclado.nextInt();

        float resultado = 0;

        try {
            resultado = valor1/valor2;
        } catch (Exception e) {
            System.err.println("O valor 2 não pode ser zero.");
            System.exit(0);
        
        System.out.println("O resultado é: " + resultado);
        }
    }
}