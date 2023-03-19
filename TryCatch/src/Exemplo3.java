import javax.swing.JOptionPane;

public class Exemplo3 {
    public static void main(String[] args) {
        String num = JOptionPane.showInputDialog(null, "Digite um número: ");

        try{
            Integer i = new Integer(num);
            JOptionPane.showMessageDialog(null, "O número digitado foi: "+i, "Valor digitado", JOptionPane.INFORMATION_MESSAGE);

        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Não foi possível atribuir esse valor a um número inteiro.", "Erro", JOptionPane.ERROR_MESSAGE);

            System.out.println("O erro retornado foi: "+e.getMessage());
        }
    }
}
