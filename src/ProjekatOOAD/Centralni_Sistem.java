package ProjekatOOAD;

import java.util.*;
import java.io.*;

public class Centralni_Sistem {

    List<Korisnik> korisnici = new ArrayList<Korisnik>();
    String naziv_sistema;
    List<Izvrsni_sistem> sistemi = new ArrayList<Izvrsni_sistem>();
    // dodati komande !!!

    public Centralni_Sistem(String ime){

        this.naziv_sistema = ime;

    }

    public void DodajKorisnika(Korisnik k){

        this.korisnici.add(k);
    }

    public void IspisiKorisnike(){

        for(int i = 0; i < korisnici.size(); i++) {
            System.out.println((i+1) + ". korisnik: " + korisnici.get(i).username);
        }
    }

    public void ProvjeraKorisnika(Korisnik k){

        if(k.pass.length() < 5)
            System.out.println("Pogresan korisnik!");
        else
            System.out.println("Ispravan korisnik!");
    }

    //Dodati provjeru komande

    public void IspisiIzvjestajZaSistem(Izvrsni_sistem s){

        s.DajIzvjestaj();
    }


}
