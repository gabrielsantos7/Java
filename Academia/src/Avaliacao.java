import javax.swing.JOptionPane;

public class Avaliacao {
    private float peso;
    private float altura;
    private float ombro;
    private float pescoco;
    private float torax;
    private float abdomen;
    private float cintura;
    private float quadril;
    private float antebraco;
    private float braco;
    private float coxa;
    private float panturrilha;
    private float idadeMetabolica;
    private float massaMagra;
    private float massaGorda;
    private float metabolismoBasal;
    private float gorduraVisceral;

    public Avaliacao(float peso, float altura){
        this.peso = peso;
        this.altura = altura;
    }

    public Avaliacao(float peso, float altura, float ombro, float pescoco, float torax, float abdomen, float cintura,
            float quadril, float antebraco, float braco, float coxa, float panturrilha, float idadeMetabolica,
            float massaMagra, float massaGorda, float metabolismoBasal, float gorduraVisceral) {
        this.peso = peso;
        this.altura = altura;
        this.ombro = ombro;
        this.pescoco = pescoco;
        this.torax = torax;
        this.abdomen = abdomen;
        this.cintura = cintura;
        this.quadril = quadril;
        this.antebraco = antebraco;
        this.braco = braco;
        this.coxa = coxa;
        this.panturrilha = panturrilha;
        this.idadeMetabolica = idadeMetabolica;
        this.massaMagra = massaMagra;
        this.massaGorda = massaGorda;
        this.metabolismoBasal = metabolismoBasal;
        this.gorduraVisceral = gorduraVisceral;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getOmbro() {
        return ombro;
    }

    public void setOmbro(float ombro) {
        this.ombro = ombro;
    }

    public float getPescoco() {
        return pescoco;
    }

    public void setPescoco(float pescoco) {
        this.pescoco = pescoco;
    }

    public float getTorax() {
        return torax;
    }

    public void setTorax(float torax) {
        this.torax = torax;
    }

    public float getAbdomen() {
        return abdomen;
    }

    public void setAbdomen(float abdomen) {
        this.abdomen = abdomen;
    }

    public float getCintura() {
        return cintura;
    }

    public void setCintura(float cintura) {
        this.cintura = cintura;
    }

    public float getQuadril() {
        return quadril;
    }

    public void setQuadril(float quadril) {
        this.quadril = quadril;
    }

    public float getAntebraco() {
        return antebraco;
    }

    public void setAntebraco(float antebraco) {
        this.antebraco = antebraco;
    }

    public float getBraco() {
        return braco;
    }

    public void setBraco(float braco) {
        this.braco = braco;
    }

    public float getCoxa() {
        return coxa;
    }

    public void setCoxa(float coxa) {
        this.coxa = coxa;
    }

    public float getPanturrilha() {
        return panturrilha;
    }

    public void setPanturrilha(float panturrilha) {
        this.panturrilha = panturrilha;
    }

    public float getIdadeMetabolica() {
        return idadeMetabolica;
    }

    public void setIdadeMetabolica(float idadeMetabolica) {
        this.idadeMetabolica = idadeMetabolica;
    }

    public float getMassaMagra() {
        return massaMagra;
    }

    public void setMassaMagra(float massaMagra) {
        this.massaMagra = massaMagra;
    }

    public float getMassaGorda() {
        return massaGorda;
    }

    public void setMassaGorda(float massaGorda) {
        this.massaGorda = massaGorda;
    }

    public float getMetabolismoBasal() {
        return metabolismoBasal;
    }

    public void setMetabolismoBasal(float metabolismoBasal) {
        this.metabolismoBasal = metabolismoBasal;
    }

    public float getGorduraVisceral() {
        return gorduraVisceral;
    }

    public void setGorduraVisceral(float gorduraVisceral) {
        this.gorduraVisceral = gorduraVisceral;
    }

    public String imprimeAN() {
        return "Peso:" + peso + "Altura: " + altura + "Ombro: " + ombro + "Pescoço: " + pescoco + "Tórax: " + torax
                + "Abdomen: " + abdomen + "Cintura: " + cintura + "Quadril: " + quadril + "Antebraço: " + antebraco
                + "Braço: " + braco + "Coxa: " + coxa + "Panturrilha: " + panturrilha + "Idade Metabólica: "
                + idadeMetabolica + "Massa Magra: " + massaMagra + "Massa Gorda: " + massaGorda + "Metablosimo Basal: "
                + metabolismoBasal + "Gordura Visceral: " + gorduraVisceral;
    }

    public String imprimePA(){
        float CalculoImc = peso / (altura * altura);  
        JOptionPane.showMessageDialog(null, "INFORMAÇÕES DO IMC\n\nPeso: " + peso + "\nAltura: " + altura + "\nIMC: " +CalculoImc+ "\n\n", "IMC", 1);

        return "";
    }

}
