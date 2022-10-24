public class Ex2 {
    public static void main(String[] args) {
        String txt = "Gabriel Santos";
        
        // O método indexOf() retorna a primeira ocorrência de alguma letra ou símbolo
        System.out.println("Primeira ocorrência de G: Posição "+txt.indexOf("G"));

        // O método lenght() retorna o tamanho da String
        System.out.println("O tamanho da String é de: "+txt.length());

        // O método charAt() retorna um character localizado em uma determinada posição da String (Recebe o parâmetro da posição da String que vai ser retornado) 
        char c = txt.charAt(13);
        System.out.println("A posição 13 possui o caractere: "+c);
    }
}
