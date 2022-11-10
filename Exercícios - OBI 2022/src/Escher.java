import java.util.Scanner;

public class Escher {

    static void mymethod(int num){
        
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[num];
        int[] vetor2 = new int[num];
        int[] soma= new int[num/2];
        int j=0;
        int r = 0;
        if(num % 2 == 0){

            for(int i = 0; i < num; i++){
                vetor[i] = input.nextInt();
            }

            for (int i = vetor.length -1; i >= 0; i--) {
                vetor2[j] = vetor[i];
                j++;
            }

            for (int i = 0; i <vetor2.length / 2; i++){
                soma[i] = vetor[i] + vetor2[i];
            }

            for(int i = 1; i <vetor2.length / 2; i++){
                if(soma[i] != soma[i-1])
                    r = 1;
            }

            if(r == 1)
                System.out.println("N");
            else
                System.out.println("S");

        }else
            System.out.println("N");
        input.close();
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int num = input.nextInt();
        mymethod(num);
        input.close();
    }
}
