import java.util.Locale;
import java.util.Scanner;

public class exer1_6 {
    public static void main(String[] args){
        // 1 Sanduiche, inclui: 2 FatiaQueijo, 1 FatiaPresunto, 1 RodelaBurguer. Cada fatia Queijo/Presunto = 50g, 
        // RodelaBurguer = 120g. Input-Quan.Sanduba, Output-Quant.Queijo/Presunto/RodelaBurguer em KG.
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);


        System.out.print("Quantos sandubas você quer? ");
        int sanduba = sc.nextInt();

        float queijo = 0.010f;
        float presunto = 0.005f;
        float rodelaburguer = 0.120f;

        queijo = (queijo * 10) * sanduba;
        presunto = (presunto * 10) * sanduba;
        rodelaburguer = (rodelaburguer) * sanduba;
        System.out.println("Quantos Kg de queijo, presuntoo e carne, serão necessários para " + sanduba + " sandubas?");
        // "%.2fkg\n", queijo | O "kg" aparece na frente nesse caso
        System.out.printf("%.2fkg\n", queijo);
        System.out.printf("%.2fkg\n",presunto);
        System.out.printf("%.2fkg\n",rodelaburguer);
        sc.close();
    }
}
