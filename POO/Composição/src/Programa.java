import javax.swing.*;

public class Programa {
    public static void main(String []  args) {

        //Cria um vetor que armazenará as informações do usuário
        Cliente[] lista_clientes = new Cliente[100];
        
        //Cria manualmente um array do objeto Cliente passando as informações do usuário como parâmetros
        Cliente c00 = new Cliente("Marcos", "000-000-000-00");

        //Mostra as informações que form passadas como parâmetro usando a função imprime de Cliente.
        System.out.println(c00.imprime());

        for(int i=0 ; ;i++){

            //Pede as informações ao usuário
            long inputId = Integer.parseInt(JOptionPane.showInputDialog("Digite o código do cliente "));
            String inputNome = JOptionPane.showInputDialog("Digite o nome do cliente ");
            String inputCPF = JOptionPane.showInputDialog("Digite o CPF do cliente ");
            String inputCidade = JOptionPane.showInputDialog("Digite a cidade do cliente ");
            String inputEstado = JOptionPane.showInputDialog("Digite o estado do cliente ");
            String inputBairro = JOptionPane.showInputDialog("Digite o bairro do cliente ");
            String inputRua = JOptionPane.showInputDialog("Digite a rua do cliente ");
            String inputNumero = JOptionPane.showInputDialog("Digite o numero do complemento do cliente ");
            String inputComplemento = JOptionPane.showInputDialog("Digite o complemento do cliente ");

            /*Cria um novo objeto do tipo Endereco que recebe as variáveis criadas acima como parâmetro do 
            objeto e00. Que depois são passados aos parâmetros do construtor de Endereco que são 
            atribuídos aos atributos da classe Endereco.*/
            Endereco e00 = new Endereco(inputCidade, inputEstado, inputBairro, inputRua, inputNumero, inputComplemento);

            //Adiciona estes valores recebidos no vetor que já havia sido criado, incluindo os valores do Endereço
            lista_clientes[i] = new Cliente(inputId, inputNome, inputCPF, e00);

            JOptionPane.showMessageDialog(null, lista_clientes[i].imprime()+lista_clientes[i].getEndereco().imprimee());

            //Mecanismos para parar a repetição
            int rodar = JOptionPane.showConfirmDialog( null,"Deseja continuar?");
                if(rodar != 0){
                    break;                
                }
        }        

    }    
}

