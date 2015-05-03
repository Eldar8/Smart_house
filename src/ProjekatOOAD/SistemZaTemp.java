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

    public void DajPodatkeOSistemu(){

        System.out.println("Trenutna temperatura je " + trenutna_temp + " stepena Celzijusa.");
        System.out.println("Donja granicna temperatura je " + donja_granica + " stepena Celzijusa.");
        System.out.println("Gornja granicna temperatura je " + gornja_granica + " stepena Celzijusa.");

        if(auto_regulacija)
            System.out.println("Autoregulacija temperature je ukljucena.");
        else
            System.out.println("Autoregulacija temperature nije ukljucena.");

    }
}
