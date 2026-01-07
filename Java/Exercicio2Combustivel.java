import java.util.Scanner;
import java.util.InputMismatchException;

public class Exercicio2Combustivel {
    public static void main(String[] args) throws Exception {
        int alcool, gasolina, tipo, litros = 0;
        Double valorAlcool = 3.90, valorGasolina = 5.50, valorFinal; 
        Scanner sc = new Scanner(System.in);

        try {
            System.out.printf("Escolha meu patrão, aguagolificada ou gasosa?\nDigite 1 para alcool ou 2 para gasolina: ");
            tipo = sc.nextInt();
            
            if (tipo == 1 || tipo == 2) {
                System.out.println("Vai sair no capricho!");
            } else {
                System.out.println("Só 1 ou 2, seu sacana!");
            }
            if (tipo == 1 || tipo == 2) {
                System.out.println("Quantos litros vai querer? ");
                litros = sc.nextInt();
            if (litros < 0) {
                System.out.println("Não tem como beber litros negativos, irmão!");
                System.exit(0);
            }
            }
            // alcool
            if (tipo == 1 && litros <= 20) {
                valorFinal = (litros * valorAlcool) - (litros * (valorAlcool * 0.03)) ;
                System.out.printf("Você tem que pagar: %.2f reais.", valorFinal);
            } else if (tipo == 1 && litros > 20) {
                valorFinal = (litros * valorAlcool) - (litros * (valorAlcool * 0.05)) ;
                System.out.printf("Você tem que pagar: %.2f reais.", valorFinal);
            }

            // Gasolina 
            if (tipo == 2 && litros <= 20) {
                valorFinal = (litros * valorGasolina) - (litros * (valorGasolina * 0.04));
                System.out.printf("Você tem que pagar: %.2f reais.", valorFinal);
            } else if (tipo == 2 && litros > 20) {
                valorFinal = (litros * valorGasolina) - (litros * (valorGasolina * 0.06));
                System.out.printf("Você tem que pagar: %.2f reais.", valorFinal);
            }
        } catch (InputMismatchException ex) {
            System.out.println("Insira apenas números inteiros");
        }
    }
}