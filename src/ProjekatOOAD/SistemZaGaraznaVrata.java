package ProjekatOOAD;


public class SistemZaGaraznaVrata  extends Izvrsni_sistem{

    boolean auto_regulacija = false;
    boolean manual_regulacija = false;

    public SistemZaGaraznaVrata(String tipsis){

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
}


