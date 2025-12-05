import java.util.Scanner;
// Lista de Exercícios 4: Switch Case
// Converta os códigos abaixo para utilizarem uma estrutura switch case caso seja possível. Implemente também o try catch:
// Código 01:

public class DiasDaSemanaIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número de 1 a 7: ");

        int dia = scanner.nextInt();

        if (dia == 1) {
            System.out.println("Domingo");
        } else if (dia == 2) {
            System.out.println("Segunda-feira");
        } else if (dia == 3) {
            System.out.println("Terça-feira");
        } else if (dia == 4) {
            System.out.println("Quarta-feira");
        } else if (dia == 5) {
            System.out.println("Quinta-feira");
        } else if (dia == 6) {
            System.out.println("Sexta-feira");
        } else if (dia == 7) {
            System.out.println("Sábado");
        } else {
            System.out.println("Dia inválido");
        }

        scanner.close();
    }
}