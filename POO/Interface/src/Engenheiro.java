public class Engenheiro extends Funcionario {
    private String formacao;
    private String diploma;


    public Engenheiro(String formacao, String diploma) {
        this.formacao = formacao;
        this.diploma = diploma;
    }


    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }
    
    public String getDiploma() {
        return diploma;
    }

    public void setDiploma(String diploma) {
        this.diploma = diploma;
    }


}

