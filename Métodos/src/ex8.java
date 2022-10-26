import java.util.Scanner;
public class ex8 {
    static double num( double a, double b, double D){
        return (-b + (Math.sqrt(D))) / (2*a);
    }
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        double a, b, D;
        System.out.println("Digite o valor de A: ");
            a = myObj.nextDouble();
        
        System.out.println("Digite o valor de B: ");
            b = myObj.nextDouble();

            System.out.println("Digite o valor de D: ");
            D = myObj.nextDouble();

            myObj.close();
        System.out.println("O resultado da equação é: " +num(a, b, D));


    }
}
