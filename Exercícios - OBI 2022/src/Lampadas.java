import java.util.Scanner;
public class Lampadas {

    static void mymethod(int n) {
        Scanner input = new Scanner(System.in);
        boolean a = false, b = false;
        int c;
        for (int i = 0; i < n; i++) {
          c = input.nextInt();
            if(c == 1){
                if(a == false)
                    a = true;
                else
                    a = false;

            }else if(c == 2){
                if(a == false)
                    a = true;
                else
                    a = false;

                if(b == false)
                    b = true;
                else
                    b = false;
                
            }  
            
        }
        
        if(a == false)
            System.out.println(0);
        else
            System.out.println(1);

        if(b == false)
            System.out.println(0);
        else
            System.out.println(1);

        input.close();
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        mymethod(n);
        input.close();
    }


}
