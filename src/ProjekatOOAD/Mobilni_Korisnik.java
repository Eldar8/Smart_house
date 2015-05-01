package ProjekatOOAD;

public class Mobilni_Korisnik extends Korisnik{

      int broj_uredjaja;

    public Mobilni_Korisnik(String ime, String sifra, int newValue){

        super(ime,sifra);
        this.broj_uredjaja = newValue;
    }

    @Override
    public void UnesiNovuSifru(String nova_sifra){

        super.UnesiNovuSifru(nova_sifra);
    }

    public void UnesiNoviBrojUredjaja(int novi_br){

        this.broj_uredjaja = novi_br;
    }
}
