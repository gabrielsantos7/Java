// Realiza a soma do quadrado dos números digitados
import java.util.Scanner;

public class Teste1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
            
            double a, b,x;
            System.out.print("Digite o valor do cateto adjacente: ");
            a = input.nextDouble();
            
            System.out.print("Digite o valor do cateto oposto: ");
            b = input.nextDouble();
            
            x = Math.sqrt((Math.pow(a,2)) + (Math.pow(b,2)));
            
            System.out.println("O valor da hipotenusa é de: " +x);
            
        input.close();
    }
}

