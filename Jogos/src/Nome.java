import java.util.Scanner;

public class Nome {

    static String mymethod( ){
        String vetor [] = {"Betim", "Marcelão", "Zé", "Chicão", "Elias", "Ribamar", "Jaspion", "Arlindo", "Jaiminho", "Juvenal", "Sergim", "Tião", "Pedrão", "Dedé", "Mané", "Bira", "Zéquinha"};
        int sorteio = (int) (Math.random() * vetor.length );
            return vetor[sorteio];
    }

    static String mymethod2( ){
        String vetor [] = {"da Viola", "do Pé Inchado", "Bom de Gole", "Vira-Copo", "Caganeira", "Gambá", "Doido", "Alma Penada", "das Mandingas", "Cai Torto", "Chifrudo", "Bola Murcha", "do Goró", "Cana Brava", "Corno Manso", "Vaca Véia"};
        int sorteio = (int) (Math.random() * vetor.length );
            return vetor[sorteio];
    }

    static String mymethod3( ){
        String vetor [] = {"Mestre", "Esfaqueador", "Invocador", "Psicopata", "Manipulador", "Mago", "Ocultista", "Ilusionista", "Capuz", "Demônio", "Atirador", "Agente", "Justiceiro", "Ninja"};
        int sorteio = (int) (Math.random() * vetor.length );
            return vetor[sorteio];
    }

    static String mymethod4( ){
        String vetor [] = {"Macabro", "Mascarado", "Desconhecido", "Possuído", "Dissimulado", "Cruel", "das Lâminas", "da Montanha", "do Poço", "da Escuridão", "da Magia Negra"};
        int sorteio = (int) (Math.random() * vetor.length );
            return vetor[sorteio];
    }

    static String mymethod5( ){
        String vetor [] = {"Capitão", "Klaus", "Corsário", "Moe", "Willie", "Bartholomew", "Edward", "Joe", "Wally", "Francis", "Marujo", "Fantasma", "Drake", "John", "Jack", "Aventureiro", "Náufrago", "Navegador", "Caçador"};
        int sorteio = (int) (Math.random() * vetor.length);
            return vetor[sorteio];
    }

    static String mymethod6( ){
        String vetor [] = {"dos Sete Mares ", "Pé de Âncora", "Corta-Tempestade", "Cabeça de Crustáceo", "Caveira Dourada", "do Baú da Morte", "Caolho", "Cruel", "Impiedoso", "Alma Negra", "sem Coração", "da Maré do Luar", "Perna de Pau", "Mão de Gancho", "da Maldição Incurável"};
        int sorteio = (int) (Math.random() * vetor.length );
            return vetor[sorteio];
    }
    public static void main(String[] args) {

        System.out.println ("Descubra seu nome...\n");
        System.out.println ("\nEscolha uma opção: \n1- Nome de Cachaceiro\n2- Nome de Assassino\n3- Nome de Pirata");
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        switch (a) {

            case 1:
            System.out.println ("Seu nome de Cachaceiro é: "+mymethod() + " "+mymethod2());
                break;

            case 2:
            System.out.println ("Seu nome de Assassino é: "+mymethod3() + " "+mymethod4());
                break;

            case 3:
            System.out.println ("Seu nome de Pirata é: "+mymethod5() + " "+mymethod6()); 
                break;

            default:
            System.out.println ("Escolha uma opção válida!");
                break;
        }
        input.close();

        //for(int i=0; i < 20; i++){}
    }
}
