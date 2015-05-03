package ProjekatOOAD;


public class SistemZaVideoNadzor extends Izvrsni_sistem {

    boolean ukljucensenzor;
    float pozicijakamere;

    public SistemZaVideoNadzor(String tipsis, float pos){

        super(tipsis);
        this.pozicijakamere = pos;
        ukljucensenzor = false;
    }

    public void UkljuciNadzor(){
        this.ukljucensenzor = true;
    }

    public void PostaviPozicijuKamere(float pos){
        this.pozicijakamere = pos;
    }

    public float DajPoziciju(){
        return this.pozicijakamere;
    }

    public void DajPodatkeOSistemu(){
        System.out.println("Kamera za nadzor se nalazi na poziciji " + this.DajPoziciju());
        if(this.ukljucensenzor)
            System.out.println("Video nadzor je ukljucen.");
        else
            System.out.println("Video nadzor nije ukljucen.");
    }

}
