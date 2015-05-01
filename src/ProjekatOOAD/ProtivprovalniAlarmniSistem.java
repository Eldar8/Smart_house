package ProjekatOOAD;


public class ProtivprovalniAlarmniSistem extends Izvrsni_sistem {

    boolean detekcija_kretanja = false;

    public ProtivprovalniAlarmniSistem(String tipsis){

        super(tipsis);
    }

    public void UkljuciDetekcijuKretanja(){

        this.detekcija_kretanja = true;
    }
}
