//Realiza a multiplicação de matrizes com o tamanho e os valores definidos pelo usuário.
import javax.swing.JOptionPane;

public class TesteFinal {

    public static void imprimeA(int[][] a, int linhaA, int colunaA){
        System.out.println("Matriz A:");
        for (int i = 0; i < linhaA; i++) {
            System.out.println("");
            for (int j = 0; j < colunaA; j++) {
                System.out.print(a[i][j]+" ");

            }  
        }
    }

    public static void imprimeB(int[][] b, int linhaB, int colunaB){
        System.out.println("\n\nMatriz B:");
        for (int i = 0; i < linhaB; i++) {
            System.out.println("");
            for (int j = 0; j < colunaB; j++) {
                System.out.print(b[i][j]+" ");
            }
            
        }
    }

    public static void multiplica(int[][] a, int[][] b, int [][] c, int linhaA, int colunaA, int colunaB){
        System.out.println("\n\nMatriz C:");
        for(int i=0; i<linhaA; i++){ //esse for externo percorrerá as linhas da matriz resultante (C) e as linhas da matriz A

            for(int j=0; j<colunaB; j++){ //esse for interno percorrerá as colunas da matriz resultante (C) assim como as colunas da matriz B

                for(int k=0; k<colunaA; k++){ // esse for mais interno percorrerá as colunas da matriz A assim como as linhas da matriz B
                    c[i][j] += a[i][k] * b[k][j];

                }
            }
        }

        for (int i = 0; i < linhaA; i++) {
            System.out.println("");
               for(int j = 0; j < colunaB; j++) {
                  System.out.print(c[i][j]+" ");        
                }
        }
    }
    
    public static void main(String[] args ) {

        int linhaA = Integer.parseInt(JOptionPane.showInputDialog("Digite Quantas linhas a matriz A deve ter."));
        int colunaA = Integer.parseInt(JOptionPane.showInputDialog("Digite Quantas colunas a matriz A deve ter."));

        int linhaB = Integer.parseInt(JOptionPane.showInputDialog("Digite Quantas linhas a matriz B deve ter."));
        int colunaB = Integer.parseInt(JOptionPane.showInputDialog("Digite Quantas colunas a matriz B deve ter."));

        int [][] a = new int[linhaA][colunaA];
        int [][] b = new int[linhaB][colunaB];
        int [][] c = new int[linhaA][colunaB];

        if(linhaA != colunaB){
           JOptionPane.showMessageDialog(null, "Não é possível realizar a multiplicação entre as duas matrizes. \nA matriz A não possui a quantidade de linhas que B possui de colunas. Tente novamente.");
        }else{
            for (int i = 0; i < linhaA; i++) { //percorre as linhas da coluna A
                for (int j = 0; j < colunaA; j++) { //percorre as colunas da matriz A
                    int i1 = i+1;
                    int j1 = j+1;
                    a[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da Matriz A na linha "+i1+" e coluna "+j1+":"));
                   
                }
                
            }
    
            imprimeA(a, linhaA, colunaA);
    
            for (int i = 0; i < linhaB; i++) { //percorre as linhas da coluna B
                for (int j = 0; j < colunaB; j++) { //percorre as colunas da matriz B
                    int i1 = i+1;
                    int j1 = j+1;
                    b[i][j] = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor da Matriz B na linha "+i1+" e coluna "+j1+":"));
                   
                }
                
            }
            
            imprimeB(b, linhaB, colunaB);
            JOptionPane.showMessageDialog(null, "A operação de multiplicação foi realizada com sucesso. \nVerifique o resultado.");
            multiplica(a, b, c, linhaA, colunaA, colunaB);

        }

        
    }
}

