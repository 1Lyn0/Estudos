public class Random {

    public static void main(String[] args) {

        java.util.Random gerador = new java.util.Random();

        int numeroNegativo = gerador.nextInt(-100, 100);

        System.out.println(numeroNegativo);
    }
}