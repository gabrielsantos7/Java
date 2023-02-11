import javax.swing.JOptionPane;

public class Instrutor extends Pessoa {
    private String apelido;
    private String matricula;
    private String cpf;
    private String rg;

    public Instrutor(String apelido, String matricula, String cpf, String rg, String nome, String sexo, Endereco endereco, DataNascimento datanascimento) {
        super(nome, sexo, endereco, datanascimento);
        this.apelido = apelido;
        this.matricula = matricula;
        this.cpf = cpf;
        this.rg = rg;
        this.endereco = endereco;
    }

    protected Instrutor(String apelido, String matricula, String nome){
        super(nome);
        this.apelido = apelido;
        this.matricula = matricula;
        this.nome = nome;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
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

    public String imprime() {
        return "[Apelido: " + apelido + "]\n";
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public DataNascimento getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(DataNascimento datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String imprimeInstrutor() {
        JOptionPane.showMessageDialog(null, "INFORMAÇÕES DOS INSTRUTORES\n\nApelido do instrutor: " + apelido + "\n" + "Nome do instrutor: " + nome + "\n" + "Matrícula do instrutor: " + matricula +  " \n", "Instrutor", 1);
        
        return "";
    }

}
