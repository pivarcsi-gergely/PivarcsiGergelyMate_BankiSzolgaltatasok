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
        if (hitelKeret < osszeg){
            return false;
        }
        else{
            return true;
        }
    }
}
