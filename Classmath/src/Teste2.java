//Resolve uma equação de segundo grau
import java.util.Scanner;
public class Teste2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o valor de A: ");
        double a = input.nextDouble();

        System.out.print("Digite o valor de B: ");
        double b = input.nextDouble();

        System.out.print("Digite o valor de C: ");
        double c = input.nextDouble();

        double x1 = 0;
        double x2 = 0;

        if(a == 0){
            System.out.println("Não é uma equação de segundo grau pois o valor de A é '0'");
        }else{
            double delta = Math.pow(b,2) - (4 * a * c);
            if(delta < 0)
                System.out.println("O valor de Delta é negativo("+delta+"). Logo não possui raízes reais.");
            else{
                x1 = (-b + Math.sqrt(delta)) / (2 * a);
                x2 = (-b - Math.sqrt(delta)) / (2 * a);

                System.out.println("Valor de Delta:"+delta+"\nX' = "+x1+"\nX'' = "+x2);
            }

        }
        
        input.close();


    }
}
