package principal;

import java.util.Scanner;
import java.lang.Math;
import utilitarios.Calculadora;

public class App {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String mensagem = "";
        int opcao = 0;

        exibirMenu();

        try {
            System.out.println("Digite o número da opção desejada");
            opcao = teclado.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Digite o raio(m): ");
                    double raio = teclado.nextDouble();

                    double areaCirculo = Calculadora.calcularAreaCirculo(raio);

                    mensagem = "Área do círculo: " + Math.round(areaCirculo);
                    break;

                case 2:
                    System.out.println("Digite a largura(m): ");
                    double larg = teclado.nextDouble();
                    System.out.println("Digite a altura(m): ");
                    double altRet = teclado.nextDouble();

                    double areaRetangulo = Calculadora.calcularAreaRetangulo(larg, altRet);

                    mensagem = "Área do retângulo: " + areaRetangulo + " metros.";
                    break;

                case 3:
                    System.out.println("Digite a base: ");
                    double base = teclado.nextDouble();
                    System.out.println("Digite a altura: ");
                    double altTri = teclado.nextDouble();

                    double areaTriangulo = Calculadora.calcularAreaTriangulo(base, altTri);

                    mensagem = "Área do triângulo: " + areaTriangulo + " metros.";
                    break;

                default:
                    System.out.println("Opção Inválida");
                    teclado.close();
                    return;
            }
        } catch (Exception e) {
            System.out.println("Erro: Entrada inválida");
            teclado.close();
            return;
        }
        System.out.println(mensagem);
        teclado.close();
        
    }
    static void exibirMenu(){
        System.out.println("== Sistema Geométrico ==");
        System.out.println("1 - Círculo");
        System.out.println("2 - Retângulo");
        System.out.println("3 - Triângulo");
    }
}