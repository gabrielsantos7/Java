/* Quadrado dos números perfeitos */
/* GRUPO: Déborah Letícia, Gabriel Santos, Kauã Lima, Kayllane Santos e Maxsuel Santos */ 

import java.util.Scanner;

public class Teste4 {

    static void line() {
        System.out.println("\n=======*=======*=======*=======*=======*=======*=======*=======*=======*=======*=======*=======*=======*\n");
    }
    public static void main(String[] args) throws InterruptedException {
        Scanner in = new Scanner(System.in);

        int resp = 0, ver_sqrt = 0;
        double raiz = 1, sqrt_result = 0, sqrt_sn = 0;

        line();

        do {
            System.out.print("[ 1 ] Ver os 100 primeiros quadrados perfeitos\n[ 2 ] Ver os 1000 primeiros quadrados perfeitos\n[ 3 ] Ver um quadrado perfeito específico\n[ 4 ] Ver se um número é ou não um quadrado perfeito\n[ 5 ] Sair\n");

            line();

            System.out.print("Opção: ");
            resp = in.nextInt();

            line();

            switch(resp) {
                case 1:
                    System.out.printf("Os 100 primeiros quadrados perfeitos:\n\n");

                    for(int i = 1; i <= 100; i++) {
                        raiz = Math.pow(i, 2);
                        System.out.printf("%.0f -> ", raiz);
                    } System.out.print("FIM.\n");

                    line();
                    Thread.sleep(3000);
                    break;

                case 2:
                    System.out.printf("Os 1000 primeiros quadrados perfeitos:\n\n");

                    for(int i = 1; i <= 1000; i++) {
                        raiz = Math.pow(i, 2);
                        System.out.printf("%.0f -> ", raiz);
                    } System.out.print("FIM.\n");

                    line();
                    Thread.sleep(3000);
                    break;

                case 3:
                    System.out.print("Informe a posição do quadrado perfeito que você quer ver: ");
                    ver_sqrt = in.nextInt();
                    line();
                    /**/
                    sqrt_result = Math.pow(ver_sqrt,2);
                    System.out.printf("O %dº número com raíz quadrada perfeita é: %.0f\n", ver_sqrt, sqrt_result);
                    line();
                    Thread.sleep(3000);
                    break;

                case 4:
                    System.out.print("Informe o número para ver se é ou não um quadrado perfeito: ");
                    sqrt_sn = in.nextDouble();
                    double sqrt_sn_result = sqrt_sn;
                    line();

                    sqrt_sn = Math.sqrt(sqrt_sn);
                    double round_sqrt = Math.round(sqrt_sn);

                    if(sqrt_sn / round_sqrt != 1) {
                        System.out.printf("O número %.0f NÃO é um quadrado perfeito.\n", sqrt_sn_result);
                    } else {
                        System.out.printf("O número %.0f É um quadrado perfeito. Sua raíz quadrada é: %.0f\n", sqrt_sn_result, Math.sqrt(sqrt_sn_result));
                    }

                    line();
                    Thread.sleep(3000);
                    break;

                case 5:
                    System.out.println("[ SAINDO... ]");
                    line();
                    Thread.sleep(4000);
                    System.out.println("[ Fim da execução do programa. ]");
                    line();
                    break;

                default:
                    System.out.println("[ Entrada de dados inválida... ]");
                    line();
                    Thread.sleep(3000);
                    break;
            }

        } while(resp!=5);

        in.close();
    }
}

