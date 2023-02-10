public class Programa {
    public static void main(String[] args) {
        Relogio r = new Relogio(17, 25);
        System.out.println(r.imprime());

        System.out.println("Agora são: "+r.getHoras()+ ":"+r.getMinutos());
    }
}
