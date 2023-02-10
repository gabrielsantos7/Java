import java.util.Scanner;
public class Cliente implements Autenticavel, Consumidor{
    private String nome;
    private String telefone;
    private String email;


    public Cliente(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    //O requisito de autenticação para o usuário é a senha não estar em branco.
    @Override
    public void autenticar() {
        Scanner input = new Scanner(System.in);
        String a="";

            for(;;){
                System.out.print("Digite sua senha de acesso para cliente: ");
                a = input.nextLine();
                    if(a==""){
                        System.out.println("O campo da senha está em branco. Tente novamente.\n");

                    }else if(a!=""){
                        System.out.println("Acesso liberado.\n");
                        break;
                    }
            }
        input.close();
    }


    @Override
    public void exigirNotaFiscal() {
        System.out.println("Eu sou um consumidor! Exijo nota fiscal!!!");
    }
    
}

