import java.util.Scanner;
public class Diretor extends Funcionario implements Autenticavel{

    private String CartaoCorp;


    public Diretor(String cartaoCorp) {
        this.CartaoCorp = cartaoCorp;
    }


    public String getCartaoCorp() {
        return CartaoCorp;
    }

    public void setCartaoCorp(String cartaoCorp) {
        this.CartaoCorp = cartaoCorp;
    }

    //O requisito de autenticação para o diretor é que a senha contenha um . e um @
    @Override
    public void autenticar() {
        Scanner input = new Scanner(System.in);
        String c;

        for(;;){
            System.out.print("Digite sua senha para diretor: ");
            c = input.nextLine();

            if(c.contains(".")==false && c.contains("@")==false){
                System.out.println("Algo deu errado. Tente novamente.\n");

            }else if(c.contains(".")==false && c.contains("@")==true){
                System.out.println("Algo deu errado. Tente novamente.\n");

            }else if(c.contains(".")==true && c.contains("@")==false){
                System.out.println("Algo deu errado. Tente novamente.\n");

            }else{
                System.out.println("Acesso liberado.\n");
                break;
            }

        }
        input.close();

    }

}

