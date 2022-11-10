import java.util.Scanner;

public class Album {

    static int mymethod(int n, int m){

        Scanner input = new Scanner (System.in);
        int x;
        int [] a = new int [n+1];
        int cont = 0;

        for(int i=1; i < n+1; i++)
            a [i] = 0;

        for (int i = 0; i < m; i++){
            x = input.nextInt();
            a [x] = 1;
        }

        for (int i = 1; i < n+1; i++){
            if (a[i] == 0){
                cont++;
            }
        }

        input.close();
        return cont;
    }
    
    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);

        int n = input.nextInt();
        int m = input.nextInt();

        System.out.println(mymethod(n, m));

        input.close();
    }
}