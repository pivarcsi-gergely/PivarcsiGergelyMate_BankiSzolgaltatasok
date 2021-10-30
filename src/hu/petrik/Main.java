package hu.petrik;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        Tulajdonos t1 = new Tulajdonos("Erős Pista");
        Tulajdonos t2 = new Tulajdonos("Pokróc Máté");
        Tulajdonos t3 = new Tulajdonos("Ötös Ferenc");

        Szamla sz1 = new Szamla(t1);
        Szamla sz2 = new Szamla(t2);
        Szamla sz3 = new Szamla(t3);

        HitelSzamla hSz1 = new HitelSzamla(t2, 200000);
        HitelSzamla hSz2 = new HitelSzamla(t3, 1000000);

        MegtakaritasiSzamla mtSz1 = new MegtakaritasiSzamla(t1);

        Kartya k1 = new Kartya(t1, sz1, "1234");


        Bank b1 = new Bank();
        b1.setListaMeret(15);

        sz1.befizet(100000);
        sz2.befizet(10000);
        sz3.befizet(1000000);
        sz3.kivesz(750000);

        hSz1.befizet(10000);
        hSz2.befizet(43200);

        mtSz1.befizet(15000);

        hSz1.kivesz(10001);
        mtSz1.kivesz(15001);
        mtSz1.setKamat(16);
        mtSz1.kamatJovairas();

        b1.szamlanyitas(0, t1).befizet(70000);
        b1.szamlanyitas(50000, t2).befizet(40000);
        b1.szamlanyitas(50000, t1).befizet(50000);



        System.out.println(b1);


        System.out.println("\n" + k1);
        System.out.println(sz2.ujKartya("4567"));



        System.out.println("Összegyenlege " + t1.getNev() + " tulajdonosnak: " + b1.getOsszegyenleg(t1) + " Ft");
        System.out.println("Legnagyobb egyenlegű számlája " + t1.getNev() + " nevű tulajdonosnak: " + b1.getLegnagyobbEgyenleguSzamla(t1) + " Ft");
        System.out.println(b1.getOsszhitelkeret());
     }
}