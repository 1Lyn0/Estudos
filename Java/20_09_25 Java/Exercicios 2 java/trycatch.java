public class trycatch {
    public static void main(String[] args){
        //Testa se o código deu erro
        try{
            int resultado = 10 / 0;
        //Captura o erro e executa isso caso tenha dadao erro
            //O que é o "Exception e"? Resposta: Identificar excessao com o codinome "e"
        } catch (Exception e) {
            System.out.println("Não divisivel por zero mas, continua rodando...");
        //Executa independente de ter dado erro ou nao
        } finally{
            System.out.println("bahia finalizado");
        }
    }
}
