import javax.swing.JOptionPane;

public class Exercicio1 {
     /*
      Receba uma String via JOptionPane e mostre o valor todo em letras maiúsculas. 
      Trate a exceção para o caso de nenhum valor ter sido digitado para a String. Trate a exceção NullPointerException.
      */

      public static void main(String[] args) {
            String txt = JOptionPane.showInputDialog(null, "Digite alguma coisa: ", "Digite algo", JOptionPane.QUESTION_MESSAGE);
            String txtUpper;
           
            try{
                  if(txt.equals("")){
                        txt = null;
                  }

                  txtUpper = txt.toUpperCase();
                  JOptionPane.showMessageDialog(null, "O texto em maiúsculo é: "+txtUpper, "Maiúsculo", JOptionPane.INFORMATION_MESSAGE);        

            }catch(NullPointerException e){
                  JOptionPane.showMessageDialog(null, "Não foi possível transformar o texto em maiúsculo.", "ERRO", JOptionPane.ERROR_MESSAGE);
                  System.out.println("ERRO RETORNADO: "+e.getMessage());
            }
      }
}
