public class Programa {
    public static void main(String[] args) {

        // Cria um objeto chamado funcionario
          Funcionario funcionario = new Funcionario(1232342, 89, "João", "888.777.666-555");

          // Poderíamos também instanciar um objeto Pessoa e passar seus atributos como parâmetro do objeto Funcionario. Mas totalmente desnecessário.

          System.out.println(funcionario.imprime());

          
      }
}
