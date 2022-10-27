import java.util.Scanner;

public class Campeonato {
    static void v (int pc, int pf, int sc, int sf){
        
        if(pc > pf){
            System.out.println("C");
        }else if (pc < pf){
            System.out.println("F");
        }else if( pc == pf){
            if(sc > sf){
                System.out.println("C");
            }else if(sc < sf){
                System.out.println("F");
            }else{
                System.out.println("=");
            }
        }
    }
    
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int vc = input.nextInt(); int ec = input.nextInt(); int sc = input.nextInt(); int vf = input.nextInt(); int ef = input.nextInt(); int sf = input.nextInt();
        int pc = (vc * 3) +ec;
        int pf = (vf * 3) +ef;

        input.close();

        v(pc, pf, sc, sf);

    }
}
