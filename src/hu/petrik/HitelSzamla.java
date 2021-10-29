package hu.petrik;

public class HitelSzamla extends Szamla {

    private int hitelKeret;

    public HitelSzamla(Tulajdonos tulajdonos, int hitelKeret) {
        super(tulajdonos);
        this.hitelKeret = hitelKeret;
    }

    public int getHitelKeret() {
        return hitelKeret;
    }

    public boolean kivesz(int osszeg) {
        if (aktualisEgyenleg < osszeg){
            System.out.println("Kisebb az aktuális egyenleg, mint az összeg, ami kivevésre kerülne, ezért a kivétel sikertelen lett.");
            return false;
        }
        else{
            aktualisEgyenleg -= osszeg;
            return true;
        }
    }

    @Override
    public String toString() {
        return String.format("Hitel számla { " + super.toString() + "; hitelkeret: %d }", getHitelKeret());
    }
}
