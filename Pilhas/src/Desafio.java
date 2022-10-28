/*
PROBLEMA: Escreva um programa para verificar se uma expressão matemática tem os parênteses agrupados de forma correta, isto é: (1) se o número de parênteses à esquerda e à direita são iguais e; (2) se todo parêntese aberto é seguido posteriormente por um fechamento de parêntese.

Ex1: As expressões ((A+B) ou A+B( violam a condição 1
Ex2: As expressões )A+B( – C ou (A+B)) – (C + D violam a condição 2

Expressões para testar:
"((A+B)"
"((AB)*(C+D))"")A+B( – C"
"(Y/((2*X)+A))" 
*/

import java.util.Scanner;
import java.util.Stack;
public class Desafio {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        Stack <Character> pilha = new Stack <Character>();

        int cont1 = 0;
        int cont2 = 0;
        System.out.println("Digite a operação com parênteses: ");
        String a = input.nextLine();
        char[] vetor = new char[a.length()];

            for (int i=0; i<a.length(); i++){
                char c = a.charAt(i);
                vetor[i] = c;
            }

            for(int i=0; i<vetor.length; i++){
                if(vetor[i] == ')'){
                    cont2++;
                }else if(vetor[i] == '(')
                    cont1++;
            }
            if(cont1 != cont2){
                System.out.println(false);
                System.exit(0);
            }else{
                for(int i=0; i<vetor.length; i++){
                    if(vetor[i] == '('){
                        pilha.push(vetor[i]);
                    }else if(vetor[i] == ')')
                        if(pilha.isEmpty() == true){
                            System.out.println(false);
                            System.exit(0);
                        }
                        else
                            pilha.pop();
                }
            }
            if(pilha.isEmpty() == false)
                System.out.println(false);
            else
                System.out.println(true);
            
        input.close();
    }
}
