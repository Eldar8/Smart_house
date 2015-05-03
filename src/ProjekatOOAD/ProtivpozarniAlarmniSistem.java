package ProjekatOOAD;


public class ProtivpozarniAlarmniSistem extends Izvrsni_sistem {

    boolean mjerenje_temp = false;
    float gornja_granica_temp;
    float gornja_granica_dim;
    boolean prskalice = false;

    public ProtivpozarniAlarmniSistem(String tipsis, float ggtemp, float ggdim){

        super(tipsis);
        this.gornja_granica_temp = ggtemp;
        this.gornja_granica_dim = ggdim;
        this.mjerenje_temp = true;

    }

    public void IskljuciMjerenjeTemp(){

        this.mjerenje_temp = false;
    }

    public void UkljuciPrskalice(){

        this.prskalice = true;
    }

    public void DajPodatkeOSistemu(){

        System.out.println("Gornja granicna temp je " + this.gornja_granica_temp);
        System.out.println("Gornja granicna dima je " + this.gornja_granica_dim);
        if(this.prskalice)
            System.out.println("Prskalice su ukljucene.");
        else
            System.out.println("Prskalice nisu ukljucene.");
        if(this.mjerenje_temp)
            System.out.println("Mjerac temperature je ukljucen.");
        else
            System.out.println("Mjerac temperature nije ukljucen.");

    }

}
