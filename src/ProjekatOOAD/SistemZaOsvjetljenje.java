package ProjekatOOAD;

public class SistemZaOsvjetljenje extends Izvrsni_sistem {

    boolean upaljeno = false;

    public SistemZaOsvjetljenje(String tip){

        super(tip);
    }

    public void UkljuciSistem(){

        this.upaljeno = true;
    }
}
