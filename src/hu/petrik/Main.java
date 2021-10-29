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

        MegtakaritasiSzamla mtSz1 = new MegtakaritasiSzamla(t1, 15.4);

        Kartya k1 = new Kartya(t1, sz1, "1234");

        List<Szamla> szamlaLista = new ArrayList<>();
        Bank b1 = new Bank(szamlaLista, 10);

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

        szamlaLista.add(sz1);
        szamlaLista.add(sz2);
        szamlaLista.add(sz3);
        szamlaLista.add(hSz1);
        szamlaLista.add(hSz2);
        szamlaLista.add(mtSz1);

        for (Szamla elem: szamlaLista) {
            System.out.println(elem);
        }

        System.out.println("\n" + k1);

        System.out.println(sz2.ujKartya(t2, sz2, "4567"));





     }
}