public class ex6 {
    static void checkAge(int idade) {

        if (idade < 18) {
            System.out.println("Você é menor de idade! Não pode acessar este site!");
        } else {
            System.out.println("Acesso ao site permitido. Seja bem-vindo!");
        }
    
    }
    
    public static void main(String[] args) {
        checkAge(20); 
    }
}
