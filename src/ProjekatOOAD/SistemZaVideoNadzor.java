package ProjekatOOAD;


public class SistemZaVideoNadzor extends Izvrsni_sistem {

    boolean ukljucensenzor = false;
    float pozicijakamere;

    public SistemZaVideoNadzor(String tipsis, float pos){

        super(tipsis);
        this.pozicijakamere = pos;
    }

    public void UkljuciNadzor(){

        this.ukljucensenzor = true;

    }

    public void PostaviPozicijuKamere(float pos){

        this.pozicijakamere = pos;

    }

}
