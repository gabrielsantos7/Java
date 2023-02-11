import java.util.*;
public class Oficina {
    Random R = new Random();

    public Veiculo proximo(){
        Veiculo V;
        int code = R.nextInt();
            if(code % 2 == 0)
                V = new Automovel();
            else
            V = new Bicicleta();

            return V;

    }

    public void manter(Veiculo V){
        V.checklist();
        V.adjust();
        V.cleanup();
    }

}
