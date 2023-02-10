import java.util.Scanner;

public class App {

    public static void cliente(){
        Cliente C = new Cliente("Gabriel", "88877777", "gab@gmail.com");
        C.autenticar();
    }

    public static void diretor(){
        Diretor D = new Diretor("CZZ-1543-8789-1B");
        D.autenticar();
    }

    public static void gerente(){
        Gerente G = new Gerente();
        G.autenticar();
    }

    public static void semAutenticar(){
        System.out.println("Você não precisa fazer a Autenticação. Acesso liberado.\n");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;
        System.out.println("\nSeja bem-vindo ao programa da Empresa.");
        for(;;){

            System.out.println("\nEscolha sua opção de login:\n\nDigite 1 para Cliente.\nDigite 2 para Diretor.\nDigite 3 para Engenheiro.\nDigite 4 para Gerente.\nDigite 5 para Secretário.\nDigite 6 para encerrar programa.");

            System.out.print("\nQual opção você escolhe? ");

            opcao = input.nextInt();

            if(opcao==6){
                System.out.println("Encerrando programa...\n");
                    break;
            }

            switch (opcao) {
                case 1:
                    cliente();
                    break;
            
                case 2:
                    diretor();
                    break;

                case 3:
                    semAutenticar();
                    break;

                case 4:
                    gerente();
                    break;

                case 5:
                    semAutenticar();
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente!");
            }
                    input.close();
            break;
        }

    }
}


