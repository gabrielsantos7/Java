class Funcionario extends Pessoa {
    protected long idFuncionario;
    protected int cargaHoraria;
    // atributos de Funcionario


    // Não precisa declarar os atributos herdados de Pessoa

    public Funcionario (long idFuncionario, int cargaHoraria, String nome, String cpf){

        // Informa quais são os atributos herdados da super classe
        super(nome, cpf);

        this.idFuncionario = idFuncionario;
        this.cargaHoraria =  cargaHoraria;
    }

    public long getIdFuncionario() {
        return idFuncionario;
    }


    public void setIdFuncionario(long idFuncionario) {
        this.idFuncionario = idFuncionario;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }


    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String imprime(){
        return "Nome: "+nome+ " \nCPF: "+cpf+ " \nID: "+idFuncionario+" \nCarga Horária: "+cargaHoraria+ " horas semanais";
    }
    
    
}
