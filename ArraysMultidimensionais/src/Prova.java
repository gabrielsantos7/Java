public class Prova {
    public static void main(String[] args) {
        int[][] a = {{2,1,2}, {1,3,1}, {1,3,1}};
        int[][] b = {{1,0,0}, {0,1,0}, {0,0,1}};
        int[][] c = new int[10][10];

        for(int i=0; i<a.length; i++){
            for (int j = 0; j < b[i].length; j++) {
                for (int k = 0; k < b.length; k++) 
                    c[i][j] += a[i][k] * b[k][j];
                
            }
        }

        for (int i = 0; i < a.length; i++) {
                for(int j=0; j<b[i].length; j++)
                    System.out.print(c[i][j]);
                    System.out.println();
            
        }
    }
}
