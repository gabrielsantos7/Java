import java.util.Arrays;

public class Ex6 {
    public static void main(String[] args) {
        // Um array multidimensional é um array de arrays, um conjunto de vetores. É representado por linhas e colunas.
        int [][] matriz = {{1,2,3,4}, {5,6,7}};
        
        // Imprime o valor da linha 0 e coluna 0
        System.out.println(matriz[0][0]);
        System.out.println();

        // O for externo percorre as linhas
        for(int i=0; i<matriz.length; i++){
            //O for interno percorre as colunas
            for(int j=0; j<matriz[i].length; j++){
                System.out.println(matriz[i][j]);
            }
        }

        //Para mostrar no formato de matriz
        for(int i=0; i<matriz.length; i++){
            System.out.println();
            for(int j=0; j<matriz[i].length; j++){
                System.out.print(matriz[i][j]+" ");
            }
        }
        
        System.out.println();
        System.out.println();

        // O método Arrays.deepToString() pode converter um array multimensional em String e mostrá-lo no formato de matriz 
        System.out.println(Arrays.deepToString(matriz));
        System.out.println();

        /*
         * No for interno, usamos a condição de i < matriz[i].lenght, que retorna a quantidade de elementos presentes em cada linha. Por exemplo, na primeira linha, temos 4 elementos, já na segunda, apenas 3.
         */

    }
}
