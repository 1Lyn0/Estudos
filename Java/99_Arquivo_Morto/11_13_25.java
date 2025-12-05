import java.util.Scanner;

public class 11_13_25 {
    public static void mai(String[] args) {
        Scanner teclado = new Scanner(System.in);

        //

        Pessoa pessoa1 = new Pessoa();

        pessoa1.nome = "Ana";
        pessoa1.idade = 28;
        pessoa1.peso = 65.5f;
        pessoa1.corCabelo = "Castanho";

        Pessoa pessoa2 = new Pessoa();

        pessoa2.nome = "Bruno";
        pessoa2.idade = 35;
        pessoa2.peso = 80.0f;
        pessoa2.corCabelo = "Preto";

        // Copia pessoa2
        funcaoX(pessoa2);

        teclado.close();
    }
    // <L21> Cola pessoa2 em "p"
    static String xx(Pessoa p){
        
        p.nome = "";
        return p;
    }
}