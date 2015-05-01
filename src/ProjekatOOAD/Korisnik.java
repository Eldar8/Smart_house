package ProjekatOOAD;


public class Korisnik {

    public String username;
    public String pass;
    // dodati jos i komandu, tip varijable Komanda

    public Korisnik(String ime, String sifra){

        this.username = ime;
        this.pass = sifra;
    }

    public void UnesiNovuSifru(String newValue){

        this.pass = newValue;
    }
/*
    public void UnesiKomandu(komanda){


    }

    public komanda DajKomandu(){

        return
    }*/
}
