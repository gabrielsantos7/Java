import java.util.Arrays;

public class Teste1 {
   public static void main(String[] args) {
      int[][] matriz = { {1, 2, 3, 4}, {5, 6, 7} };
      
      System.out.println("Mostrando a matriz");
      for (int i = 0; i < matriz.length; ++i) { //percorre as linhas da matriz
      System.out.println("");
         for(int j = 0; j < matriz[i].length; ++j) { //percorre as colunas da matriz
            System.out.print(matriz[i][j]+" ");        
         }
      }

      System.out.println("\n\nMostrando o comprimento da matriz");
      for(int i=0; i<matriz.length; i++){
         for(int j=0; j<matriz[i].length; j++){
             System.out.print(matriz.length+" ");
         }
     }
     
     System.out.println("\n\nMostrando o cumprimento da matriz na posição i");
     for(int i=0; i<matriz.length; i++){
         for(int j=0; j<matriz[i].length; j++){
             System.out.print(matriz[i].length+" ");
         }
     }

     // Formatando o array Multidimensional para String
     String formated = Arrays.deepToString(matriz);
        System.out.println("\n\nString formatada: "+ formated);
   }
}