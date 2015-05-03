package ProjekatOOAD;


import com.sun.media.jfxmedia.control.VideoDataBuffer;

public class Main {

    public static void main(String [] args){

        Centralni_Sistem c = new Centralni_Sistem("kuca");
       // Korisnik k = new Korisnik("Eldar", "12345");

        //System.out.println(c.naziv_sistema);

       // c.DodajKorisnika(k);
        //System.out.println(c.korisnici.size());
        //c.IspisiKorisnike();
        //c.ProvjeraKorisnika(k);
        //SistemZaOsvjetljenje sis = new SistemZaOsvjetljenje("Osvjetljenje");
        //c.IspisiIzvjestajZaSistem(sis);
        //sis.Aktiviraj();
        //c.IspisiIzvjestajZaSistem(sis);

        OdabirKomande ok = new OdabirKomande(Komanda.Video_nadzor);
        ok.ObradaKomande();
        OdabirKomande ok2 = new OdabirKomande(Komanda.Protivprovalni_alarm);
        ok2.ObradaKomande();

    }

}
