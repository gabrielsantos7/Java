public class Programa {
    public static void main (String[] args){
        Oficina O = new Oficina();
        Veiculo V;

            for(int i=0; i<4; ++i){
                V = O.proximo();
                O.manter(V);
                System.out.println();
            }
    }
}
