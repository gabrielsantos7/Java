## TryCatch

<br>

A linguage Java oferece muitos recursos para lidar com erros e exceções. Uma das maneiras de lidar com erros em Java é usando o bloco `try-catch`.

O bloco `try-catch` é uma construção da linguagem Java que permite ao programador lidar com exceções e erros que podem ocorrer durante a execução do programa. O bloco `try` contém o código que pode gerar uma exceção ou um erro, enquanto o bloco `catch` é responsável por lidar com a exceção ou erro e tomar uma ação apropriada.

Existem muitas classes de erro em Java, que representam diferentes tipos de exceções ou erros que podem ocorrer durante a execução de um programa. Aqui estão as 20 principais classes de erro em Java:

1. `ArithmeticException`: essa exceção é lançada quando ocorre uma operação matemática inválida, como uma divisão por zero.
2. `ArrayIndexOutOfBoundsException`: essa exceção é lançada quando um índice inválido é usado para acessar um elemento de um array.
3. `ClassCastException`: essa exceção é lançada quando ocorre uma tentativa de conversão de um objeto para um tipo incompatível.
4. `IllegalArgumentException`: essa exceção é lançada quando um argumento inválido é passado para um método.
5. `IllegalStateException`: essa exceção é lançada quando o estado atual de um objeto ou sistema não é compatível com a operação solicitada.
6. `IndexOutOfBoundsException`: essa exceção é lançada quando um índice inválido é usado para acessar um elemento de uma coleção.
7. `NullPointerException`: essa exceção é lançada quando um valor nulo é usado onde não é permitido.
8. `NumberFormatException`: essa exceção é lançada quando uma string não pode ser convertida para um tipo numérico.
9. `SecurityException`: essa exceção é lançada quando ocorre uma violação de segurança.
10. `StringIndexOutOfBoundsException`: essa exceção é lançada quando um índice inválido é usado para acessar um caractere em uma string.
11. `UnsupportedOperationException`: essa exceção é lançada quando uma operação não é suportada.
12. `IOException`: essa exceção é lançada quando ocorre um erro de entrada/saída.
13. `InterruptedException`: essa exceção é lançada quando uma thread é interrompida enquanto está em um estado de espera.
14. `ClassNotFoundException`: essa exceção é lançada quando uma classe não pode ser encontrada durante a execução do programa.
15. `IllegalAccessException`: essa exceção é lançada quando ocorre uma tentativa de acesso a um campo ou método que não é acessível.
16. `InstantiationException`: essa exceção é lançada quando ocorre uma tentativa de criar uma instância de uma classe abstrata ou de uma interface.
17. `NegativeArraySizeException`: essa exceção é lançada quando um array é criado com um tamanho negativo.
18. `OutOfMemoryError`: esse erro é lançado quando não há memória suficiente disponível para alocar um objeto.
19. `StackOverflowError`: esse erro é lançado quando a pilha de chamadas de método fica sem espaço disponível.
20. `NoClassDefFoundError`: esse erro é lançado quando uma classe que era acessível durante a compilação não está disponível durante a execução.

### Lista de Arquivos

- Exemplo 1 ao 5: Exemplos propostos em sala de aula
- Exercicio1: Recebe uma String e a transforma em maiúsculo, tratando a exceção de ela estar vazia usando o `NullPointerException`.

- Exercicio2: Cria um formulário que recebe dois números e realiza a divisão entre eles, tratando exceções com `ArithmeticException` e `NumberFormatException`.
