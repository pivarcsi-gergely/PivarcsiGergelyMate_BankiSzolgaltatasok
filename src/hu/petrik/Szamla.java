package hu.petrik;

public class Szamla extends BankiSzolgaltatas{

    protected int aktualisEgyenleg;


    public Szamla(Tulajdonos tulajdonos) {
        super(tulajdonos);
    }

    public int getAktualisEgyenleg() {
        return aktualisEgyenleg;
    }

    public void befizet(int osszeg){
        aktualisEgyenleg += osszeg;
    }

    public boolean kivesz(int osszeg){
        aktualisEgyenleg -= osszeg;
        return true;
    }

    public Kartya ujKartya(String kartyaszam){
        return ujKartya(kartyaszam); // visszamegyek erre mert nem értem mit kell itt csinálni
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "; aktuális egyenleg: %d", getAktualisEgyenleg());
    }
}
