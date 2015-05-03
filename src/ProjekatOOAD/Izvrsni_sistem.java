package ProjekatOOAD;


public class Izvrsni_sistem {

    String TipSistema;
    //dodati za komandu!
    Izvjestaj report;
    boolean aktivan;

    public Izvrsni_sistem(String tipsis){

        aktivan = false;
        this.TipSistema = tipsis;
        this.report = new Izvjestaj();
    }

    public void Aktiviraj(){
        this.aktivan = true;
    }

    public void Deaktiviraj(){
        this.aktivan = false;
    }

    public void DajIzvjestaj(){

        if(this.aktivan) {
            System.out.println(this.TipSistema + " sistem je aktivan!");
            System.out.println(report.datum.toString());
        }
        else
            System.out.println(this.TipSistema + " sistem nije aktivan!");
    }

}
