import javax.swing.JOptionPane;

public class Endereco {
    private String cidade;
    private String estado;
    private String bairro;
    private String rua;
    private String numero;
    private String complemento;

    public Endereco(String cidade, String estado, String bairro, String rua, String numero, String complemento) {
        this.cidade = cidade;
        this.estado = estado;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
        this.complemento = complemento;
    }

    public String getCidade() {
        return cidade;
    }

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

    public String imprimee() {
        JOptionPane.showMessageDialog(null, "\nINFORMAÇÕES DO ENDEREÇO:\n\nCidade: " + cidade + "\nEstado : " + estado + "\nBairro: " + bairro + "\nRua : " + rua+ "\nNúmero : " + numero + "\nComplemento : " + complemento + "\n", "Endereço", 1);

        return "";
    }
}
