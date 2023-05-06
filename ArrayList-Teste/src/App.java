import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        GerenciadorAluno gerenciaAluno = new GerenciadorAluno();

        while (true) {
            String resposta = (JOptionPane.showInputDialog("Informe o que você deseja fazer:\nDigite 1 para cadastrar.\n Digite 2 para apagar um cadastro.\n Digite 3 para pesquisar um cadastro.\n Digite 4 listar todos os Alunos cadastrados\n Digite 5 para fechar o programa.\n"));

            switch (resposta){
                case "1":
                    while (true) {
                        String nome = JOptionPane.showInputDialog("Nome: ");
                        char sexo = JOptionPane.showInputDialog("Sexo: ").toUpperCase().charAt(0);
                        String cpf = JOptionPane.showInputDialog("CPF: ");
                        String rg = JOptionPane.showInputDialog("RG: ");
                        String matricula = JOptionPane.showInputDialog("Matrícula: ");

                        Aluno aluno = new Aluno(nome, sexo, cpf, rg, matricula);
                        gerenciaAluno.inserirAluno(aluno);

                        int resp = JOptionPane.showConfirmDialog(null,"Você deseja cadastrar mais algum aluno?");
         
                        if(resp!= 0){
                            break;
                        }
                    }
                
                    break;

                case "2":
                    String matricula = JOptionPane.showInputDialog("Digite a matrícula do aluno que você deseja remover: ");
                    gerenciaAluno.removerAluno(matricula);

                    break;

                case "3":
                    String pesquisarNome = JOptionPane.showInputDialog("Digite o nome do Cadastro que você deseja pesquisar: ");
                    gerenciaAluno.pesquisarAluno(pesquisarNome);
                         
                    break;

                case "4":
                    gerenciaAluno.listarAlunos();
                         
                    break;
    
                case "5":
                    JOptionPane.showMessageDialog(null, "O programa está sendo encerrado. A academia Toca do Ogro agradece pela preferência!");

                    break; 
    
                    default:
                    JOptionPane.showMessageDialog(null, "Ops, parece que você digitou uma opção inválida. Que tal tentar novamente?");
                    
            }
            if(resposta.equals("5")){
                break;
            }
        }
        
    }
}
