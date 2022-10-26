import java.util.Scanner;

public class ex7 {
    static double num(double a, double b) {
        return (Math.pow(a, 2)) + (Math.pow(b, 2));
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in); 
            
            double a, b;
            System.out.println("Digite o valor de A: ");
            a = myObj.nextDouble();
            
            System.out.println("Digite o valor de B: ");
            b = myObj.nextDouble();
            
            myObj.close();

            System.out.println("A soma do quadrado dos números é: " +num(a, b));
        }
    
}

