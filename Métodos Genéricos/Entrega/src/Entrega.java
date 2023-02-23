import java.util.Scanner;

public class Entrega {

    static int qtdViagens(int x, int y, int z){
        if(x == y && y == z)
            return 3;
        else if((x != y) && (y != z) && (y != z))
            return 1;
        else if((x + y) >= z)
            return 2;
        else
            return 1;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int x, y, z;

        x = input.nextInt();
        y = input.nextInt();
        z = input.nextInt();

        if(x > 0 && x <= y && y <= z && z <= 1000) 
        // Ordena em ordem crescente ao mesmo tempo que já verifica se os números estão entre 0 e 1000
            System.out.println(qtdViagens(x, y, z));
        else
            System.out.println(-1);

        input.close();
    }
}
