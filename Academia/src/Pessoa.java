public class Pessoa {
    protected String nome;
    protected String sexo;
    protected Endereco endereco;
    protected DataNascimento datanascimento;

    public Pessoa(String nome, String sexo, Endereco endereco, DataNascimento datanascimento) {
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.datanascimento = datanascimento;
    }

    protected Pessoa(String nome){
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public DataNascimento getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(DataNascimento datanascimento) {
        this.datanascimento = datanascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String imprime() {
        return "\n[Nome: " + nome + " | Sexo: " + sexo + "]\n";
    }

}
