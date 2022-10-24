import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        // Um array é um conjunto de variáveis de um mesmo tipo. Cada item ocupa uma posição no array.
        String[] frutas = {"Abacaxi", "Morango", "Banana", "Goiaba"};

        // Imprime o array Frutas na posição 0
        System.out.println(frutas[0]);
        System.out.println();

        // Percorre todas as posições do vetor e mostra seus valores
        for(int i=0; i<frutas.length; i++ ){
            System.out.println(frutas[i]);
        }
        System.out.println();

        // Percorre todas as posições do vetor e mostra seus valores na mesma linha
        for(int i=0; i<frutas.length; i++ ){
            System.out.print(frutas[i]+" ");
        }
        System.out.println();
        
        // O método Arrays.toString() retorna uma representação de Strings do vetor.
        System.out.println(Arrays.toString(frutas));

        /*
         * System.out.println() ->  Imprime saltando uma linha
         * System.out.print() ->  Imprime na mesma linha
         * System.out.printf() ->  Permite imprimir texto e variáveis
         */
    }
}
