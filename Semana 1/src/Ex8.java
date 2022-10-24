import java.util.Scanner;
public class Ex8 {
    public static void main(String[] args) {
        // Para receber dados do usuário, importamos a classe Scanner 
        Scanner input = new Scanner(System.in);
        System.out.print("Digite o seu nome: ");

        // Em seguida, criamos uma variável do tipo dos dados que queremos receber
        String a = input.nextLine();
        System.out.printf("Bem vindo, %s!",a);

        //Por fim, devemos fechar a variável Scanner que criamos.
        input.close();
    }
}
