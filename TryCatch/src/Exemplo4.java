import javax.swing.JOptionPane;

public class Exemplo4 {
    public static void main(String[] args) {
        int [] values = {0, 10, 20, 30, 40, 50};

        String var = JOptionPane.showInputDialog(null, "Digite um número: ", "Selecionar posição no vetor", JOptionPane.QUESTION_MESSAGE);

        try{
            int i = Integer.parseInt(var);
            JOptionPane.showMessageDialog(null, "O valor na posição "+i+" é: "+values[i], "Valor", JOptionPane.INFORMATION_MESSAGE);
        
        }catch(IndexOutOfBoundsException e){
            JOptionPane.showMessageDialog(null, "Não é possível acessar esta posição no vetor.", "Erro", JOptionPane.ERROR_MESSAGE);

            e.printStackTrace();
        }
    }
}
