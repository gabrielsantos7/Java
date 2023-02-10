import java.util.Calendar;
public class DiaMesAno {
    public static void main(String[] args) {
        Calendar data = Calendar.getInstance();
        
        int diaMes = data.get(Calendar.DAY_OF_MONTH);
        int mes = data.get(Calendar.MONTH); 
        int ano = data.get(Calendar.YEAR);
  
        switch (mes) {
            case 0:
            System.out.println("Hoje é: " +diaMes+ " de Janeiro de " +ano);
                break;

            case 1:
            System.out.println("Hoje é: " +diaMes+ " de Fevereiro de " +ano);
                break;

            case 2:
            System.out.println("Hoje é: " +diaMes+ " de Março de " +ano);
                break;
        
            case 3:
            System.out.println("Hoje é: " +diaMes+ " de Abril de " +ano);
                break;

            case 4:
            System.out.println("Hoje é: " +diaMes+ " de Maio de " +ano);
                break;
            
            case 5:
            System.out.println("Hoje é: " +diaMes+ " de Junho de " +ano);
                break;
        
            case 6:
            System.out.println("Hoje é: " +diaMes+ " de Julho de " +ano);
                break;

            case 7:
            System.out.println("Hoje é: " +diaMes+ " de Agosto de " +ano);
                break;

            case 8:
            System.out.println("Hoje é: " +diaMes+ " de Setembro de " +ano);
                break;

            case 9:
            System.out.println("Hoje é: " +diaMes+ " de Outubro de " +ano);
                break;
                
            case 10:
            System.out.println("Hoje é: " +diaMes+ " de Novembro de " +ano);
                break;

            case 11:
            System.out.println("Hoje é: " +diaMes+ " de Dezembro de " +ano);
                break;

            default:
                break;
        }

    }
}
