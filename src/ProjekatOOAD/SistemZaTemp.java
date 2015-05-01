package ProjekatOOAD;


public class SistemZaTemp extends Izvrsni_sistem {

    float trenutna_temp;
    float donja_granica;
    float gornja_granica;
    boolean auto_regulacija = false;

    public SistemZaTemp(String tipsis, float trenutna, float donja, float gornja){

        super(tipsis);
        this.trenutna_temp = trenutna;
        this.donja_granica = donja;
        this.gornja_granica = gornja;

    }

    public void UkljuciAutoRegulaciju(){

        this.auto_regulacija = true;
    }
}
