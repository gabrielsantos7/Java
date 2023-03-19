import java.util.Scanner;

public class Exemplo1{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Divisor: ");
        int x = input.nextInt();
        System.out.println("Dividendo: ");
        int y = input.nextInt();

        double z;

        try{
            z = (double) x / y;
            System.out.println ("Resultado: " + z);

        }catch (ArithmeticException e){

            System.out.println ("Operação inválida!");

            System.out.println("\n Detalhes do erro: "+ e.getMessage());
        }

        input.close();
    }
}