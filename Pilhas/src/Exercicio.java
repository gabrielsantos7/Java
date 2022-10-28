import java.util.Stack;

public class Exercicio {
    public static void main(String []args) {
        // Inserir 10 inteiros [9, 6, 34, 65, 10, 5, 34, 3, 11, 87]
        Stack <Integer> pilha = new Stack <Integer>();
        pilha.push(9);
        pilha.push(6);
        pilha.push(34);
        pilha.push(65);
        pilha.push(10);
        pilha.push(5);
        pilha.push(34);
        pilha.push(3);
        pilha.push(11);
        pilha.push(87);
        
        //Remover 3 valores, imprimindo-os  ao final de cada remoção
        for(int i=0; i < 3; i++)
        System.out.println(i+" Valor removido: "+pilha.pop());
        
         //Imprimir o valor do topo sem removê-lo
        System.out.println(pilha.peek());
        
        //Remover 5 valores, imprimindo-os  ao final de cada remoção
        for(int i=0; i < 5; i++)
            System.out.println(i+" Valor removido: "+pilha.pop()+"\n");
        
        //Verificar se a pilha está vazia
        if(pilha.isEmpty() == true)
            System.out.println("A pilha está vazia.");
        else
            System.out.println("A pilha não está vazia.");
        
        //Verificar quantidade de elementos da pilha
        System.out.println("\nA quantidade de elementos da pilha é: "+pilha.size());
        
        /* //Remover 3 valores, imprimindo-os  ao final de cada remoção
          for(int i=0; i < 3; i++)
            System.out.println(i+" Valor removido: "+pilha.pop());
            Dá erro pois a pilha tem apenas 2 posições, enquanto desejamos remover 3.
         */
        
            
    }
}

