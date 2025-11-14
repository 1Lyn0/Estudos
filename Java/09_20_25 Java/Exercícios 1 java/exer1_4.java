import java.util.Locale;
import java.util.Scanner;

public class exer1_4 {
    public static void main(String[] arg){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Qual o seu salário? ");
        float salario = sc.nextFloat();
        // System.out.print(salario);

        System.out.print("Seu salário inicial é R$ " + salario);
        
        salario *= 1.15f;
        System.out.println(", mas teve um aumento de 15%, seu novo salário é R$ " + salario);
 
        float inss = salario * 0.11f;
        System.out.println("O desconto do INSS foi R$ " + inss);

        float fgts = salario * 0.08f;
        System.out.printf("O desconto do FGTS foi R$ %.2f\n", fgts);
        
        float desconto_total = inss + fgts;
        System.out.println("O desconto total do inss e fgts é R$ " + desconto_total);
        
        salario = salario - inss - fgts;
        System.out.printf("E o salário final é R$ %.2f", salario);
        sc.close();
    }
}
