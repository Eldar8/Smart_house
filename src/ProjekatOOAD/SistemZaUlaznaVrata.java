package ProjekatOOAD;


public class SistemZaUlaznaVrata extends Izvrsni_sistem {

    boolean auto_regulacija = false;
    boolean manual_regulacija = false;

    public SistemZaUlaznaVrata(String tipsis){

        super(tipsis);
    }

    public void UkljuciAutoRegulaciju(){

        this.auto_regulacija = true;
    }

    public void UkljuciManualRegulaciju(){

        this.manual_regulacija = true;
    }
    public boolean AktivnaAutoRegulacija(){

        return this.auto_regulacija;
    }

    public boolean AktivnaManualRegulacija(){

        return this.manual_regulacija;
    }

    public void DajPodatkeOSistemu(){

        if(AktivnaAutoRegulacija())
            System.out.println("Autoregulacija sistema je ukljucena.");
        else
            System.out.println("Autoregulacija sistema nije ukljucena.");

        if(AktivnaManualRegulacija())
            System.out.println("Manualregulacija sistema je ukljucena.");
        else
            System.out.println("Manualregulacija sistema nije ukljucena.");
    }

}
