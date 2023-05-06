
public class Aluno{
    private String nome;
    private char sexo;
    private String cpf;
    private String rg;
    private String matricula;

    public Aluno(String nome, char sexo, String cpf, String rg, String matricula) {
        this.nome = nome;
        this.sexo = sexo;
        this.cpf = cpf;
        this.rg = rg;
        this.matricula = matricula;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
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

    
    public String imprimeAluno() {
        return "INFORMAÇÕES DO USUÁRIO:\n\nNome do aluno: " + nome + "\nSexo do aluno: " + sexo + "\nCPF do aluno: " + cpf + "\nRG do aluno: " + rg + "\nMatrícula do aluno: " + matricula;
    }
}
    

