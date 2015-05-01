package ProjekatOOAD;


public class Internet_Korisnik extends Korisnik{

    String online_pass;

    public Internet_Korisnik(String ime, String sifra, String newValue){

        super(ime,sifra);
        this.online_pass = newValue;
    }

    @Override
    public void UnesiNovuSifru(String nova_sifra){

        super.UnesiNovuSifru(nova_sifra);
    }

    public void UnesiNovuOnlineSifru(String nova_sifra){

        this.online_pass = nova_sifra;
    }
}