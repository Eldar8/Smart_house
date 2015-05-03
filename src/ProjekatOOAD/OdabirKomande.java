package ProjekatOOAD;

import java.util.Scanner;

public class OdabirKomande {

    Komanda x;

    public OdabirKomande(Komanda k){
        this.x = k;
    }

    public void ObradaKomande(){

        switch(x) {

            case Ukljuci_grijanje:
                Scanner gg0 = new Scanner(System.in);
                String ime0;
                System.out.println("Unesi tip sistema: ");
                ime0 = gg0.nextLine();
                float tren0, donja0, gornja0;
                System.out.println("Unesi trenutnu temp: ");
                tren0 = gg0.nextFloat();
                System.out.println("Unesi donju temp ");
                donja0 = gg0.nextFloat();
                System.out.println("Unesi gornju temp: ");
                gornja0 = gg0.nextFloat();

                SistemZaTemp sistem0 = new SistemZaTemp(ime0,tren0,donja0,gornja0);
                sistem0.Aktiviraj();
                sistem0.DajIzvjestaj();
                sistem0.DajPodatkeOSistemu();
                break;

            case Iskljuci_grijanje:
                //sistem.Deaktiviraj();
                //sistem.DajIzvjestaj();
               System.out.println("Nisam jos skontao sta treba raditi xD") ;
                break;

            case Ukljuci_klimu:
                Scanner gg1 = new Scanner(System.in);
                String ime1;
                System.out.println("Unesi tip sistema: ");
                ime1 = gg1.nextLine();
                float tren1, donja1, gornja1;
                System.out.println("Unesi trenutnu temp: ");
                tren1 = gg1.nextFloat();
                System.out.println("Unesi donju temp ");
                donja1 = gg1.nextFloat();
                System.out.println("Unesi gornju temp: ");
                gornja1 = gg1.nextFloat();

                SistemZaTemp sistem1 = new SistemZaTemp(ime1,tren1,donja1,gornja1);
                sistem1.Aktiviraj();
                sistem1.DajIzvjestaj();
                sistem1.DajPodatkeOSistemu();
                break;

            case Iskljuci_klimu:
                System.out.println("Nisam jos skontao sta treba raditi xD") ;
                break;

            case Ulazna_vrata:
                Scanner gg2 = new Scanner(System.in);
                int odluka2;
                String ime2;
                System.out.println("Unesi tip sistema: ");
                ime2 = gg2.nextLine();
                SistemZaUlaznaVrata sistem2 = new SistemZaUlaznaVrata(ime2);
                System.out.println("Unesi 1 za autoregulaciju ili 0 za manualnu regulaciju sistema: ");
                odluka2 = gg2.nextInt();
                if(odluka2 == 1)
                    sistem2.UkljuciAutoRegulaciju();
                else
                    sistem2.UkljuciManualRegulaciju();
                sistem2.Aktiviraj();
                sistem2.DajIzvjestaj();
                sistem2.DajPodatkeOSistemu();
                break;

            case Garazna_vrata:
                Scanner gg3 = new Scanner(System.in);
                int odluka3;
                String ime3;
                System.out.println("Unesi tip sistema: ");
                ime3 = gg3.nextLine();
                SistemZaUlaznaVrata sistem3 = new SistemZaUlaznaVrata(ime3);
                System.out.println("Unesi 1 za autoregulaciju ili 0 za manualnu regulaciju sistema: ");
                odluka3 = gg3.nextInt();
                if(odluka3 == 1)
                    sistem3.UkljuciAutoRegulaciju();
                else
                    sistem3.UkljuciManualRegulaciju();
                sistem3.Aktiviraj();
                sistem3.DajIzvjestaj();
                sistem3.DajPodatkeOSistemu();
                break;

            case Protivpozarni_alarm:
                Scanner gg4 = new Scanner(System.in);
                String ime4;
                System.out.println("Unesi tip sistema: ");
                ime4 = gg4.nextLine();
                float gornja4,gornja4dim;
                System.out.println("Unesi gornju granicnu temp ");
                gornja4 = gg4.nextFloat();
                System.out.println("Unesi gornju granicnu dima: ");
                gornja4dim = gg4.nextFloat();
                ProtivpozarniAlarmniSistem sistem4 = new ProtivpozarniAlarmniSistem(ime4,gornja4,gornja4dim);
                int odluka4;
                System.out.println("Unesi 1 za deaktiviranje mjeraca temp ili 0 za aktiviranje prskalica: ");
                odluka4 = gg4.nextInt();
                if(odluka4 == 1)
                    sistem4.IskljuciMjerenjeTemp();
                else
                    sistem4.UkljuciPrskalice();
                sistem4.Aktiviraj();
                sistem4.DajIzvjestaj();
                sistem4.DajPodatkeOSistemu();
                break;

                case Protivprovalni_alarm:
                    Scanner gg5 = new Scanner(System.in);
                    String ime5;
                    System.out.println("Unesi tip sistema: ");
                    ime5 = gg5.nextLine();
                    int odluka5;
                    System.out.println("Unesi 1 za aktiviranje detektora kretanja ili 0 za iskljucenje: ");
                    odluka5 = gg5.nextInt();
                    ProtivprovalniAlarmniSistem sistem5 = new ProtivprovalniAlarmniSistem(ime5);
                    if(odluka5 == 1)
                        sistem5.UkljuciDetekcijuKretanja();
                    sistem5.Aktiviraj();
                    sistem5.DajIzvjestaj();
                    sistem5.DajPodatkeOSistemu();
                    break;

                case Video_nadzor:
                    Scanner gg6 = new Scanner(System.in);
                    String ime6;
                    System.out.println("Unesi tip sistema: ");
                    ime6 = gg6.nextLine();
                    float pozicija;
                    System.out.println("Unesi zeljenu poziciju kamere: ");
                    pozicija = gg6.nextFloat();
                    int odluka6;
                    System.out.println("Unesi 1 za aktiviranje nadzora ili 0 za deaktiviranje: ");
                    odluka6 = gg6.nextInt();

                    SistemZaVideoNadzor sistem6 = new SistemZaVideoNadzor(ime6,pozicija);
                    if(odluka6 == 1)
                        sistem6.UkljuciNadzor();
                    sistem6.Aktiviraj();
                    sistem6.DajIzvjestaj();
                    sistem6.DajPodatkeOSistemu();
                    break;

                case DeVideo_nadzor:
                    System.out.println("Ubaciti nesto !");


        }
    }
}

