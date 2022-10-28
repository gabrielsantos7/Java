import java.util.Scanner;

public class Basquete{

    static int mymethod(int d){
        int r=0;

        if(d <= 800)
            r = 1;
        else if(d > 800 && d <= 1400)
            r = 2;
        else if(d > 1400 && d <= 2000)
            r = 3;
        else{
            System.out.println("Valor inválido!");
            System.exit(0);
        }
  
        return r;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        System.out.println(mymethod(d));

        input.close();
    }
}