import javax.swing.JOptionPane;

public class DataNascimento {
    private int dia;
    private int mes;
    private int ano;

    public DataNascimento(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAnos(int ano) {
        this.ano = ano;
    }

    public String imprimeData() {
        String diaFormatado = "", mesFormatado = "";

        if(dia < 10)
            diaFormatado = "0"+dia;
        else
            diaFormatado = ""+dia;

        if(mes < 10)
            mesFormatado = "0"+mes;
        else
            mesFormatado = ""+mes;
        
        JOptionPane.showMessageDialog(null, "\nDATA DE NASCIMENTO: \n\n[ " + diaFormatado + " / " + mesFormatado + " / " + ano + " ]\n\n", "Nascimento", 1);
        return "";
    }
}