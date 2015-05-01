package ProjekatOOAD;

public class SistemZaOsvjetljenje {

    boolean upaljeno = false;

    public SistemZaOsvjetljenje(String tip){
        super(tip);
    }

    public void UkljuciSistem(){
        
        this.upaljeno = true;
    }
}
