package hu.petrik;

public class Kartya extends BankiSzolgaltatas{

    private Szamla szamla;
    private String kartyaSzam;

    public Kartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaSzam) {
        super(tulajdonos);
        this.szamla = szamla;
        this.kartyaSzam = kartyaSzam;
    }

    public String getKartyaSzam() {
        return kartyaSzam;
    }

    public boolean vasarlas(int osszeg){
        return true;
    }

    @Override
    public String toString() {
        return String.format("Kártya { %s; aktuális egyenleg: %d; kártya szám: %s}", super.toString(), szamla.getAktualisEgyenleg(), getKartyaSzam());
    }
}
