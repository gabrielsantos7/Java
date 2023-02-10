import java.util.Random;

public class Cliente {
    private long id;
    private String nome;
    private String cpf;
    private Endereco endereco;
    
    public Cliente(long id, String nome, String cpf, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
    }
    
    // Uma classe pode ter mais de um construtor, desde que não receba os mesmos parâmetros na mesma ordem.
    public Cliente(long id, String nome, String cpf) {
        this.id = id;
        this.nome = nome;
        this.cpf = cpf;
        
    }

    public Cliente(String nome, String cpf ) {
        Random gerador = new Random();
        this.id = gerador.nextInt(999999);
        this.nome = nome;
        this.cpf = cpf;
    }
    public Endereco getEndereco(){
        return endereco;
    }
    
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public long getId() {
        return id;
    }


    public void setId(long id) {
        this.id = id;
    }


    public String getNome() {
        return nome;
    }


    public void setNome(String nome) {
        this.nome = nome;
    }


    public String getCpf() {
        return cpf;
    }


    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    
    public String imprime() {
        return "Cliente [ ID: " + id + " | NOME: " + nome + " | CPF: " + cpf + "]\n";
    }
    
}
