 package hu.petrik;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Szamla> szamlaLista;
    private int listaMeret;
    private int osszHitelKeret;


    public Bank() {
        this.szamlaLista = new ArrayList<>(listaMeret);
    }

    public Szamla szamlanyitas(int hitelKeret, Tulajdonos tulajdonos){
        Szamla szamlaHelyettesito;

        if (hitelKeret == 0){
            szamlaHelyettesito = new MegtakaritasiSzamla(tulajdonos);
        }
        else{
            szamlaHelyettesito = new HitelSzamla(tulajdonos, hitelKeret);
            osszHitelKeret += hitelKeret;
        }

        szamlaLista.add(szamlaHelyettesito);
        return szamlaHelyettesito;
    }

    public int getListaMeret() {
        return listaMeret;
    }

    public void setListaMeret(int listaMeret) {
        this.listaMeret = listaMeret;
    }

    public int getOsszegyenleg(Tulajdonos tulajdonos) {
        int osszEgyenleg = 0;
        for (int i = 0; i < szamlaLista.size(); i++) {
            if (szamlaLista.get(i).getTulajdonos() == tulajdonos){
                osszEgyenleg += szamlaLista.get(i).getAktualisEgyenleg();
            }
        }
        return osszEgyenleg;
    }

    public Szamla getLegnagyobbEgyenleguSzamla(Tulajdonos tulajdonos){
        Szamla maxSzamla = new Szamla(tulajdonos);
        for (int i = 0; i < szamlaLista.size(); i++) {
            if (maxSzamla.getAktualisEgyenleg() < szamlaLista.get(i).getAktualisEgyenleg()){
                maxSzamla.aktualisEgyenleg = szamlaLista.get(i).getAktualisEgyenleg();
            }
        }
        return maxSzamla;
    }

    public long getOsszhitelkeret(){
        return osszHitelKeret;
    }

    @Override
    public String toString() {
        String egeszListaSzoveg = "";
        for (Szamla elem : szamlaLista) {
            egeszListaSzoveg += elem + "\n";
        }
        return egeszListaSzoveg;
    }
}
