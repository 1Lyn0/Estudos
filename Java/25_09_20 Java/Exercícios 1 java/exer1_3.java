import java.util.Locale;
import java.util.Scanner;

public class exer1_3 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantos cavalos tem? ");
        int cavalos = sc.nextInt();
        // System.out.print(cavalos);

        System.out.print("Qual o valor de cada ferradura? ");
        float preco_ferradura = sc.nextFloat();
        // System.out.printf("%.2f", preco_ferradura);

        int cavalo_ferradura = cavalos * 4;
        float valor_total = cavalo_ferradura * preco_ferradura;
        System.out.printf("Vão ser necessárias " + cavalo_ferradura + " ferraduras, para " + cavalos + " cavalos, o valor total disso ficará R$ %.2f", valor_total);
        sc.close();
    }
    
}
