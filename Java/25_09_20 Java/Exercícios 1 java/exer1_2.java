import java.util.Locale;
import java.util.Scanner;

public class exer1_2 {
    public static void main(String[] arg){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o valor do salário mínimo atual? ");
        float salario_minimo_atual = sc.nextFloat();
        // System.out.println(salario_minimo_atual);
    
        System.out.print("Qual o seu salário? ");
        float meu_salario = sc.nextFloat();
        // System.out.println(meu_salario);

        float recebe = (meu_salario / salario_minimo_atual);
        System.out.printf("%.1f", recebe);
        sc.close();
    }
}
