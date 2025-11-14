import java.util.Locale;
import java.util.Scanner;

public class exer1_1
{
    public static void main(String[] args){
         
        // Comando de escrita em inglês para usar o " . "
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Quantos metros o terreno possui de frente? ");
        float frente = sc.nextFloat();

        System.out.print("Quantos metros o terreno possui de lateral? ");
        float lateral = sc.nextFloat();
        
        System.out.print("Qual o valor do m²? ");
        float valor_area = sc.nextFloat();
        
        float area = frente * lateral;
        float area_preco = area * valor_area;
        System.out.printf("O metro quadrado da area é " + area + "m² custando R$ %.2f", area_preco);
        
        // System.out.println(area);
        // System.out.println(frente);
        // System.out.println(lateral);
        sc.close();
    }

} 