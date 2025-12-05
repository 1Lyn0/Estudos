import java.util.Scanner;

public class Exercicio1Notas {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Double nota1, nota2, media;
        int cont=0;

        System.out.print("Insira a primeira nota do aluno: ");
        nota1 = sc.nextDouble();
        cont++;

        System.out.print("Insira a segunda nota do aluno: ");
        nota2 = sc.nextDouble();
        cont++;

        media = (nota1 + nota2)/cont;

        if (media < 7) {
            System.out.println("Reprovado");
        } else if (media == 10) {
            System.out.println("Aprovado com distinção");
        } else if (media >= 7) {
            System.out.println("Aprovado");
        }
        sc.close();
    }
}
