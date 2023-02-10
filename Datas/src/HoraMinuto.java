import java.util.Calendar;
public class HoraMinuto {
    public static void main(String[] args) throws Exception {
        Calendar data = Calendar.getInstance();
        int hora = data.get(Calendar.HOUR_OF_DAY); 
        int minutos = data.get(Calendar.MINUTE);

        if(hora >= 0 && hora < 12) {
            System.out.println("Bom dia!");
        }else if(hora >= 12 && hora < 18) {
        	System.out.println("Boa tarde!");
        }else {
        	System.out.println("Boa noite!");
        }

        System.out.println("Agora são: "+hora+ ":"+minutos);

        
    }
}
