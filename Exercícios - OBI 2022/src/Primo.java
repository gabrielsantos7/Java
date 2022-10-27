import java.util.Scanner;

public class Primo {
    static boolean verifica(int a){
        
        if(a ==1 || a==2)
            return true;
        else{
            for (int i = 2; i < a; i++) {
                if(a % i == 0)
                    return false;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número: ");
        int a = input.nextInt();
        System.out.println(verifica(a));
        input.close();
    }
}
