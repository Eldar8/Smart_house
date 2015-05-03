package ProjekatOOAD;


public class ProtivprovalniAlarmniSistem extends Izvrsni_sistem {

    boolean detekcija_kretanja = false;

    public ProtivprovalniAlarmniSistem(String tipsis){

        super(tipsis);
    }

    public void UkljuciDetekcijuKretanja(){

        this.detekcija_kretanja = true;
    }
    public void DajPodatkeOSistemu(){

        if(detekcija_kretanja)
            System.out.println("Detektor kretanja je ukljucen.");
        else
            System.out.println("Detektor kretanja nije ukljucen.");
    }
}
