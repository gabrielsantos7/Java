public class Teste2 {
    public static void main(String[] args) {
        int [][] a = {{2,4,0} , {1,3,2}};
        int [][] b = {{0,3} , {5,0}, {2,1}};
        int [][] c = new int[2][2];

        for(int i=0; i<2; i++){ //esse for externo percorrerá as linhas da matriz resultante (C) e as linhas da matriz A

            for(int j=0; j<2; j++){ //esse for interno percorrerá as colunas da matriz resultante (C) assim como as colunas da matriz B

                for(int k=0; k<3; k++){ // esse for mais interno percorrerá as colunas da matriz A assim como as linhas da matriz B
                    c[i][j] += a[i][k] * b[k][j];

                }
            }
        }

        for (int i = 0; i < c.length; ++i) {
            System.out.println("");
               for(int j = 0; j < c[i].length; ++j) {
                  System.out.print(c[i][j]+" ");        
                }
        }

        
    }
}
