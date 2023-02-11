import javax.swing.JOptionPane;

   public class Programa {
      
      public static void main(String[] args) throws Exception {

         for(;;){

         String resposta = (JOptionPane.showInputDialog(null, "Informe o que você deseja fazer: \n\nDigite 1 para cadastrar. \nDigite 2 para vizualizar a disponibilidade dos instrutores. \nDigite 3 para fechar o programa.\n", "Página Principal", 1));

         if(resposta.equals("3")){
            JOptionPane.showMessageDialog(null, "O programa está sendo encerrado. \nA academia Toca do Ogro \nagradece pela preferência!", "Encerramento do programa", 2);
            break;
         }

         switch (resposta){
            case "1":
            Aluno[] lista_alunos = new Aluno[1000];

            int cont = 0;

            JOptionPane.showMessageDialog(null, "Bem-Vindo à Academia Toca do Ogro. \nÉ um prazer ter você, cliente, \nacessando nossa plataforma de cadastro. ", "Plataforma de Cadastro", 1);

                for(; ; ) {
                   String nome = JOptionPane.showInputDialog(null, "Digite seu nome: ", "Nome", 3);
                   String sexo = JOptionPane.showInputDialog(null,"Digite seu sexo: ", "Sexo", 3);
                   String cpf = JOptionPane.showInputDialog(null, "Digite seu CPF: ", "CPF", 3);
                   String rg = JOptionPane.showInputDialog(null, "Digite seu RG: ", "RG", 3);
         
                   int dia = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o dia do mês que você nasceu: ", "Dia do mês", 3));
                   int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o mês que você nasceu: ", "Mês", 3));
                   int ano = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano que você nasceu: ", "Ano", 3));
         
                   String cidade = JOptionPane.showInputDialog(null, "Informe o nome da sua cidade: ", "Cidade", 3);
                   String estado = JOptionPane.showInputDialog(null, "Digite o nome do estado onde você mora: ", "Estado", 3);
                   String bairro = JOptionPane.showInputDialog(null, "Digite o nome do seu bairro: ", "Bairro", 3);
                   String rua = JOptionPane.showInputDialog(null, "Digite o nome da rua onde você mora: ", "Rua", 3);
                   String numero = JOptionPane.showInputDialog(null, "Digite o número da casa onde você mora: ", "Número", 3);
                   String complemento = JOptionPane.showInputDialog(null, "Informe o tipo de complemento em que você vive: ", "Complemento", 3);

                   float peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o seu peso: ", "Peso", 3));
                   float altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a sua altura: ", "Altura", 3));
         
                  DataNascimento d00 = new  DataNascimento (dia, mes, ano);
         
                  Endereco e00 = new Endereco(cidade, estado, bairro, rua, numero, complemento);

                  Avaliacao av00 = new Avaliacao(peso, altura);

                  Aluno a00 = new Aluno(nome, sexo, rg, cpf, e00, d00, av00);
         
                  JOptionPane.showMessageDialog(null, "Cadastro realizadado com Sucesso! \nVerifique a seguir suas informações cadastradas.", "Sucesso!", 1);
         
                  System.out.println(a00.imprimeAluno()+a00.getEndereco().imprimee()+a00.getDatanascimento().imprimeData()+a00.getAvaliacao().imprimePA());

                  Object[] options = {"SIM", "NÃO"};
         
                  int resp = JOptionPane.showOptionDialog(null,"Você deseja cadastrar mais algum aluno?", "Selecione uma opção", JOptionPane.DEFAULT_OPTION, JOptionPane.QUESTION_MESSAGE,  null, options, options[0]);
         
                    if(resp!= 0){
                       break;
                     }
         
                  lista_alunos[cont] = new Aluno(cpf, rg, nome, sexo, e00, d00, av00);
         
                  cont++;
               }

            break;

            case "2":
              Instrutor i00 = new Instrutor("Mateuzinho", "22244133", "Mateus Santos");

              Instrutor i01 = new Instrutor("Maria marombinha", "22244135", "Maria Antônia");

              Instrutor i02 = new Instrutor("Ana maromba", "22244130", "Ana Maria");  
              
              System.out.println(i00.imprimeInstrutor()+ i01.imprimeInstrutor()+i02.imprimeInstrutor());

            break;

            default:
            JOptionPane.showMessageDialog(null, "Ops, parece que você digitou uma opção inválida. \nQue tal tentar novamente?", "Opção Inválida!", 0);
         }
      }
      }
   }


   