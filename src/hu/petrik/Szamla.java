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

    public Kartya ujKartya(Tulajdonos tulajdonos, Szamla szamla, String kartyaszam){
        Kartya k = new Kartya(tulajdonos, szamla, kartyaszam);

        return k;
    }

    @Override
    public String toString() {
        return String.format(super.toString() + "; aktuális egyenleg: %d", getAktualisEgyenleg());
    }
}
