import javax.swing.JOptionPane;

public class Oficial21 {
  public static void main(String[] args) {

    int sum = 0, sum2 = 0;
    int i =1, j=1;
    int res;
    int randomNum;
    int randomNum2;

    JOptionPane.showMessageDialog(null, "Seja bem-vindo, jogador. \n\nVocê vai disputar esse jogo com nosso computador, Karen <3\n\nRegras: Sortearemos 1 número aleatório por rodada, e quem \nchegar mais perto de 21 vence! ", "VINTE E UM", 1);

    String j1 = JOptionPane.showInputDialog(null, "Digite seu nome: ", "Nome do Jogador", 3);
  
      do{
          randomNum = (int)(1+ Math.random() * 10);
          sum += randomNum;
            if(sum > 21){
              JOptionPane.showMessageDialog(null, "O número "+i+" sorteado foi: "+randomNum+"\nTotal de pontos:"+sum,"Vencedor", 1);

              JOptionPane.showMessageDialog(null, "Você passou de 21! Karen venceu!", "Vencedor", 1);

              System.exit(0);
            }

          res = JOptionPane.showConfirmDialog(null, "O número "+i+ " sorteado foi: "+randomNum+"\nTotal de pontos:"+sum+"\nDeseja sortear mais uma carta?", j1, 1);
          i++; 

      }while(res == 0);

      while(sum2 < sum){

            randomNum2 = (int)(1+ Math.random() * 10);  
            sum2 += randomNum2;

            JOptionPane.showMessageDialog(null, "O número "+(j)+" sorteado foi: "+randomNum2+" \nTotal de pontos: "+sum2, "Karen", 1);

              if(sum2 > 21){
                JOptionPane.showMessageDialog(null, "Karen passou de 21! "+j1+" venceu!", "Vencedor", 1);
                System.exit(0);
              }
              j++;
      }

      if(sum == sum2){
        JOptionPane.showMessageDialog(null, "Os dois estão com o mesmo valor! Empate!", "Vencedor", 1);

      }else if(sum == 21){
        JOptionPane.showMessageDialog(null, "VINTE E UM! "+j1.toUpperCase()+" VENCEU!", "Vencedor", 1);

      }else if(sum2 == 21){
        JOptionPane.showMessageDialog(null, "VINTE E UM! KAREN VENCEU!", "Vencedor", 1);
      }
      
      else if(sum < 21 && sum2 < 21){
        if(sum > sum2){
          JOptionPane.showMessageDialog(null, j1+" venceu!", "Vencedor", 1);

        }else{
          JOptionPane.showMessageDialog(null, "Karen venceu!", "Vencedor", 1);
        }

      }else if(sum < 21 && sum2 > 21){
          if(sum < sum2){
            JOptionPane.showMessageDialog(null, j1+" venceu!", "Vencedor", 1);
              
          }else{
            JOptionPane.showMessageDialog(null, "Karen venceu!", "Vencedor", 1);
            
          }      

      }
          
    }
  }
