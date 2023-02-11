import javax.swing.JOptionPane;

public class Aluno extends Pessoa {
    private String cpf;
    private String rg;
    private String matricula;
    private Avaliacao avaliacao;

    public Aluno(String nome, String sexo, String rg, String cpf,  Endereco endereco,
            DataNascimento datanascimento, Avaliacao avaliacao) {
        super(nome, sexo, endereco, datanascimento);
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.datanascimento = datanascimento;
        this.cpf = cpf;
        this.rg = rg;
        this.avaliacao = avaliacao;
    }

    public Aluno(String nome){
        super(nome);
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public Avaliacao getAvaliacao(){
        return avaliacao;
    }

    public void setAvaliacao(Avaliacao avaliacao){
        this.avaliacao = avaliacao;
    }

    
    public String imprimeAluno() {
        JOptionPane.showMessageDialog(null, "INFORMAÇÕES DO USUÁRIO:\n\nNome do aluno: " + nome + "\nSexo do aluno: " + sexo + "\nCPF do aluno: " + cpf + "\nRG do aluno: " + rg, "Usuário", 1);
        return "";
    }
    
}