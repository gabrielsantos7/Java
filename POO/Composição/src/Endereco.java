// Classe é um agrupamento / conjunto de atributos e métodos.
// Atributos são os elementos que definem a estrutura de uma classe e basicamente atuam como variáveis, possuem tipo e nome, além de armazenarem dados 

public class Endereco {
    private String cidade;
    private String estado;
    private String bairro;
    private String rua;
    private String numero;
    private String complemento;

    // O construtor é um método de acesso aos atributos. Ou seja, atribue valores iniciais ao objeto
    public Endereco (String cidade, String estado, String bairro,  String rua, String numero, String complemento){
        this.cidade = cidade;
        this.estado = estado;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    // O método get permite acesso, porém não permite modificações. Ele apenas retorna o valor.
    public String getCidade() {
        return cidade;
    }

    
    // O método set permite atribuir e modificar valores, enquanto o construtor não permite tal ação.
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }


    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }


    public String getRua() {
        return rua;
    }


    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }


    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }


    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    //Método que imprime na tela os atributos e seus respectivos valores
    public String imprimee() {
        return "Endereço [ Cidade: " + cidade + " | Estado : " + estado + " | Bairro: " + bairro + " | Rua : "+ rua +" | Número : "+ numero +" | Complemento : "+ complemento +" ]";
    }
}
