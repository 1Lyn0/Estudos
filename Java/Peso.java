import java.util.Scanner;
import java.util.InputMismatchException;

public class Peso {
    public static void main(String[] args) {
        Double peso, altura, imc;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Insira seu peso em kg: ");
            peso = sc.nextDouble();

            System.out.print("Insira sua altura em metros: ");
            altura = sc.nextDouble();

            if ((peso < 0 || peso == 0) || (altura < 0 || altura == 0) ) {
            System.out.println("Insira números acima de 0!");
            } else {
                imc = peso / (altura * altura);
                System.out.printf("Seu IMC resultou em: %.2f, ou seja, ", imc);
            if (imc < 18.5) {
                System.out.println("Abaixo do peso");
            } else if (imc < 25) {
                System.out.println("Peso normal");
            } else if (imc < 30) {
                System.out.println("Sobrepeso");
            }  else if (imc < 35) {
                System.out.println("Obesidade grau 1");
            } else if (imc < 40) {
                System.out.println("Obesidade grau 2");
            } else {
                System.out.println("Obesidade grau 3 (obesidade mórbida)");
            }
        }    
            sc.close();
        } catch(InputMismatchException e) {
            System.out.println("Insira apenas números, utilizando a ( , ) para números decimais");
        } finally {
            System.out.println("Programa finalizado");
        }
        sc.close();
    }
}