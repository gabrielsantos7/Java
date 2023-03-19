import java.util.InputMismatchException;
import java.util.Scanner;

public class Exemplo2{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double z;

        try{
            System.out.print("Divisor: ");
            int x = input.nextInt();
            System.out.print("Dividendo: ");
            int y = input.nextInt();

            z = (double) x / y;
            System.out.println ("Resultado: " + z);

        }catch (InputMismatchException e){
            System.out.println ("Formato inválido!");
            System.out.println("\n Detalhes do erro:"+ e.getMessage());

        }catch (ArithmeticException e){
            System.out.println ("Operação inválida!");
            System.out.println("\n Detalhes do erro:"+ e.getMessage());
        }

        input.close();
    }
}