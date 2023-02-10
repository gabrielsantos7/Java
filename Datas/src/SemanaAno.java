import java.util.Calendar;

public class SemanaAno {
    public static void main(String[] args) {
        Calendar data = Calendar.getInstance();

        int diaSemana = data.get(Calendar.DAY_OF_WEEK);
        int diaAno = data.get(Calendar.DAY_OF_YEAR);

        int SemanaMes = data.get(Calendar.WEEK_OF_MONTH);
        int semanaAno = data.get(Calendar.WEEK_OF_YEAR);

        switch (diaSemana) {
            case 1:
                System.out.println("Hoje é Domingo!");
                break;

            case 2:
                System.out.println("Hoje é Segunda-Feira!");
                break;

            case 3:
                System.out.println("Hoje é Terça-Feira!");
                break;

            case 4:
                System.out.println("Hoje é Quarta-Feira!");
                break;

            case 5:
                System.out.println("Hoje é Quinta-Feira!");
                break;

            case 6:
                System.out.println("Hoje é Sexta-Feira!");
                break;

            case 7:
                System.out.println("Hoje é Sábado!");
                break;

            default:
                break;
        }

        System.out.println(diaAno + " dia do ano.");
        System.out.println(SemanaMes + " semana do mês.");
        System.out.println(semanaAno + " semana do ano.");

    }
}
