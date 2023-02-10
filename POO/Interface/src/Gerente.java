import java.util.Scanner;
public class Gerente extends Funcionario implements Autenticavel {

    //O requisito de autenticação para o gerente é que a senha possua um .
    @Override
    public void autenticar() {
        Scanner input = new Scanner(System.in);
        String b;

        for(;;){
            System.out.print("Digite sua senha para gerente: ");
            b = input.nextLine();

            if(b.contains(".")==false){
                System.out.println("Algo deu errado. Tente novamente.\n");
            }else{
                System.out.println("Acesso liberado.\n");
                break;
            }

        }
        input.close();
    }
    
}
