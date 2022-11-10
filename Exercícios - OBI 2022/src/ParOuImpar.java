import java.util.Scanner;

public class ParOuImpar {
    static int mymethod(int p, int d1, int d2){
        boolean par;

         if ((d1 + d2)%2 == 0)
            par = true;
        else
            par = false;
        
        if(p ==0 && par == true)
            return 0;
        else if(p ==0 && par == false)
            return 1;
        else if(p ==1 && par == true)
            return 1;
        else if(p ==1 && par == false)
            return 0;

        return p;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p = input.nextInt();

        if(p != 0 && p != 1){
            System.out.println("Valor inválido!");
            System.exit(0);
        }

        int d1 = input.nextInt();
        int d2 = input.nextInt();

        System.out.println(mymethod(p, d1, d2));

        input.close();
    }
}
