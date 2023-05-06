import java.util.ArrayList;

import javax.swing.JOptionPane;

public class GerenciadorAluno {

    private ArrayList <Aluno> alunos;
    
    public GerenciadorAluno(ArrayList <Aluno> alunos){
        this.alunos = alunos;
    }

    public GerenciadorAluno(){
        this.alunos = new ArrayList <Aluno> ();
    }

    public ArrayList <Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(ArrayList <Aluno> alunos) {
        this.alunos = alunos;
    }
    
    public void inserirAluno (Aluno aluno){
        alunos.add(aluno);
        JOptionPane.showMessageDialog(null, "Seu cadastro foi salvo no Arraylist.", "Cadastro salvo com sucesso", 1);
    }
    
    public void removerAluno(String matricula) {
        boolean alunoEncontrado = false;
    
        for (Aluno aluno : alunos) {
            if (aluno.getMatricula().equals(matricula)) {
                alunos.remove(aluno);
                alunoEncontrado = true;
                JOptionPane.showMessageDialog(null, "O Aluno com a matrícula "+matricula+" foi removido do ArrayList.");
                break;
            }
        }

        if (!alunoEncontrado) {
            JOptionPane.showMessageDialog(null, "Nenhum aluno encontrado com a matrícula informada.", "Aluno não encontrado", JOptionPane.ERROR_MESSAGE);
        }
    
    }
    
    public void pesquisarAluno(String nome) {
        boolean alunoEncontrado = false;

        for (Aluno aluno : alunos) {
            if (aluno.getNome().equals(nome)) {
                JOptionPane.showMessageDialog(null, aluno.imprimeAluno(), aluno.getNome(), JOptionPane.INFORMATION_MESSAGE);
                alunoEncontrado = true;
            }
        }

        if (!alunoEncontrado) {
            JOptionPane.showMessageDialog(null, "O aluno com o nome "+nome+ " não existe.", "Aluno não encontrado", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void listarAlunos() {
        if(!alunos.isEmpty()){
            for (Aluno aluno : alunos){
                JOptionPane.showMessageDialog(null, aluno.imprimeAluno(), aluno.getNome(), JOptionPane.INFORMATION_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Nenhum Aluno foi cadastrado ainda.", "Erro: ArrayList vazio", JOptionPane.ERROR_MESSAGE);
        }
    }
}
