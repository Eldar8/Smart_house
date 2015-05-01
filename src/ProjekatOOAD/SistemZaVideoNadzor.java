package ProjekatOOAD;


public class SistemZaVideoNadzor extends Izvrsni_sistem {

    boolean ukljucensenzor = false;
    int pozicijakamere;

    public SistemZaVideoNadzor(String tipsis, int poo){

        super(tipsis);
    }

    public void UkljuciNadzor(){

        this.ukljucensenzor = true;

    }

    public void PostaviPozicijuKamere(int pos){

        this.pozicijakamere = pos;

    }
}
