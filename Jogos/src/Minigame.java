/* 
-Gerar dois numeros aleatorios entre 5 e 8
-Pedir ao usuario para tentar descobrir
-3 tentativas
*/
import java.util.Scanner;
public class Minigame {
    public static void main (String [] args){
        int randomNum=(int)(5+ (Math.random() * 4));  // 5 to 8;
        int randomNum2=(int)(5+ (Math.random() * 4));  // 5 to 8;
        int a,b;
        int i=0;
        int j;
        Scanner input = new Scanner (System.in); 

        do{
            System.out.print("Digite dois números entre 5 e 8, separados por espaço: ");
                a = input.nextInt(); b = input.nextInt();

            if(randomNum == a && randomNum2 == b){
                System.out.println("Você venceu!!");
                    break;
            }else if(randomNum == b && randomNum2 == a){
                System.out.println("Você venceu!!");
                    break;
            }else{
                System.out.println("Voce perdeu. Tente novamente.");
            }
            System.out.println("Voce escolheu os números "+a+ " e " +b+ "\n");
                i++;
                j = 3 -i;
            System.out.println("Restam "+j+" tentativas");
        }while(j !=0);
            System.out.println("Foram sorteados os números "+randomNum+ " e "+randomNum2);
            System.out.println("Fim de jogo.");
                input.close();
    }

}


