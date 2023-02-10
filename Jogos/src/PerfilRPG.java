// Cria um perfil de RPG medieval que sorteia um nome a partir de um vetor de Strings.
import javax.swing.JOptionPane;

public class PerfilRPG {
    static String mymethod(String a){
        String vetor [] = {"Cavaleiro", "Mago", "Necromante", "Bárbaro", "Paladino", "Bruxo", "Escudeiro", "Bardo", "Gladiador", "Monge", "Arqueiro"};
        int tam = vetor.length;
        int sorteio = (int) (Math.random() * tam );
            return vetor[sorteio];
    }

    static String mymethod2(String a){
        String vetor [] = {"Fogo", "Água", "Terra", "Vento", "Luz", "Trevas", "Gelo", "Fumaça", "Raio", "Cura", "Praga"};
        int tam = vetor.length;
        int sorteio = (int) (Math.random() * tam );
            return vetor[sorteio];
    }

    static String mymethod3(String a){
        String vetor [] = {"Humanos", "Ogros", "Orcs", "Elfos", "Anões", "Gnomos", "Goblins", "Slimes", "Gigantes", "Druidas", "Fadas", "Demônios", "Vampiros"};
        int tam = vetor.length;
        int sorteio = (int) (Math.random() * tam );
            return vetor[sorteio];
    }

    static String mymethod4(String a){
        String vetor [] = {"elion", "ius", "son", "van", "ion", "orn", "omir", "rick", "ardy", "vid", "nicus", "oldus", "ake", "land"};
        int tam = vetor.length;
        int sorteio = (int) (Math.random() * tam );
        String nome = a + vetor[sorteio];
            return nome;
    }

    public static void main (String[] args){

        String a = JOptionPane.showInputDialog(null, "Digite seu nome: ", "Perfil de RPG", 3);
        JOptionPane.showMessageDialog(null, mymethod4(a)+" será um "+mymethod(a)+" da raça dos "+mymethod3(a)+ " com o poder elemental "+mymethod2(a)+".", "Resultado", 1);
        
    }
}
