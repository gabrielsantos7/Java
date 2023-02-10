import java.util.Scanner;
public class CacaNiquel {

    static void myMethod (int b){
        String vetor [] = {"Uva", "Cereja", "Banana", "Limão", "Maçã"};
        int sorteio1 = (int) (Math.random() * b );
        int sorteio2 = (int) (Math.random() * b );
        int sorteio3 = (int) (Math.random() * b );
        String f1 = vetor[sorteio1];
        String f2 = vetor[sorteio2];
        String f3 = vetor[sorteio3];

            System.out.println(f1+ " - "+f2+ " - "+f3);
                if(f1 == f2 && f2 == f3){
                    System.out.println("Você venceu!\n");
                } else{
                    System.out.println("Você perdeu!\n");
        }
    }
    public static void main (String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        
        System.out.println("Caça-Níquel\n\nSelecione uma destas opções:\n1- Fácil\n2- Médio\n3-Difícil ");
        int a = input.nextInt();
        int b = a+2;
        
            System.out.println("Selecione a opção de quantas rodadas você deseja jogar: \n1: 5 rodadas\n2: 10 rodadas\n3: 15 rodadas");
            int rod = input.nextInt();
            int rep = rod * 5;
                for(int i=0; i <rep;i++){
                    myMethod(b);
                    Thread.sleep(1700);
                }
    input.close();
    }
}
