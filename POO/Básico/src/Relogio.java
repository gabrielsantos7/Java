public class Relogio {
    public int horas;
    public int minutos;

    public Relogio(int horas, int minutos){
        this.horas = horas;
        this.minutos = minutos;
    }

    public int getHoras() {
        return horas;
    }


    public void setHoras(int horas) {
        this.horas = horas;
    }

    public int getMinutos() {
        return minutos;
    }


    public void setMinutos(int minutos) {
        this.minutos = minutos;
    }

    public String imprime(){
        return "Horas: " +horas+ "\nMinutos: "+minutos+ "\n";
    }
}
