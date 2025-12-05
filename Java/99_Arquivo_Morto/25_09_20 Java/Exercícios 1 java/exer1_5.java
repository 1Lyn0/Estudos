import java.util.Locale;
import java.util.Scanner;

public class exer1_5 {
    public static void main(String[] args){
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantidade de fragos: ");
        int frango = sc.nextInt();
        float anel_chip = 4.00f, anel_alimento = 3.50f;
        float preco_frango = (((anel_alimento * 2) + anel_chip) * frango);
        System.out.print("Com " + frango + " frangos. O valor total fica R$ " + preco_frango);
        // // Converte o " , " para " . "
        // String frango = sc.nextLine().replace(",",".");
        // // Converte a String para double
        // double frango2 = Double.parseDouble(frango);
        // System.out.print(frango2);
        sc.close();
    }
}
