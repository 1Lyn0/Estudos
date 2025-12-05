import java.util.Scanner;

public class OperadorTernarioParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 7;
        String resultado;

        System.out.print("Digite um número: ");
        numero = sc.nextInt();

        resultado = (numero % 2 == 0)? "par" : "impar";

        System.out.println("O número " + numero + " é: " + resultado);
        sc.close();
    }
}