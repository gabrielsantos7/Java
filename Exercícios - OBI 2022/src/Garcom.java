import java.util.Scanner;

public class Garcom {

    static int mymethod(int bandejas){
        Scanner input = new Scanner(System.in);
        int latas;
        int copos;
        int cont=0;

        for (int i=0; i<bandejas; i++){
            latas = input.nextInt(); copos = input.nextInt();
            
            if(latas > copos){
                cont += copos;
            }
        }

        input.close();
        return cont;
    }

    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int bandejas = input.nextInt();

        System.out.println(mymethod(bandejas)+ " copos foram quebrados.");
        input.close();

        }



    }
