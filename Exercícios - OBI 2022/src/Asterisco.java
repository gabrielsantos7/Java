import java.util.Scanner;

public class Asterisco {

    static void imprime(int a){
        for(int i=0; i < a; i++){  
        
            for(int j=0; j <= i; j++){
                System.out.print( "*");
            }
            System.out.println( " ");
        }
        
        for(int i=0; i < a; i++){  
        
            for(int j=a-1; j > i; j--){
                System.out.print( "*");
            }
            System.out.println( " ");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Digite um número: ");
        int a = input.nextInt();

        imprime(a);
        
        input.close();
        
    }  
}
