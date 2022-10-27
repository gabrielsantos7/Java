import java.util.Scanner;

public class Morango {
    static int area (int b1, int alt1, int b2, int alt2){
        
        if (b1 * alt1 > b2 * alt2){
            return (b1 * alt1);
        }else{
            return (b2 * alt2);
        }
    
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
            int b1 = input.nextInt();
            int alt1 = input.nextInt();
            int b2 = input.nextInt();
            int alt2 = input.nextInt();

            input.close();

        int r = area(b1, alt1, b2, alt2);
        System.out.println(r);

    }
}
