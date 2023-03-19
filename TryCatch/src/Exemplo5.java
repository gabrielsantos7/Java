public class Exemplo5 {
    public static void main(String[] args) {
        int x = 0;

        try{
            int y = 100 / x;
            System.out.println ("Resultado: " + y);

        }catch (ArithmeticException e){
            System.out.println ("Operação inválida!");
            System.out.println("\n Detalhes do erro: "+ e.getMessage());

        }finally{
            System.out.println ("Execução finalizada!");
        }
    }
}
