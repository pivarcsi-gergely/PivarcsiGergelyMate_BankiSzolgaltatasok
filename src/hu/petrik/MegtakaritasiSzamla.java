package hu.petrik;

public class MegtakaritasiSzamla extends Szamla{

    private double kamat;
    public static double alapKamat;

    public MegtakaritasiSzamla(Tulajdonos tulajdonos, double kamat) {
        super(tulajdonos);
        this.kamat = kamat;
    }

    public double getKamat() {
        return kamat;
    }

    public void setKamat(double kamat) {
        this.kamat = kamat;
    }

    public boolean kivesz(int osszeg){
        if (getAktualisEgyenleg() < osszeg){
            return false;
        }
        else{
            return true;
        }
    }

    public void kamatJovairas(){
        aktualisEgyenleg += (aktualisEgyenleg*kamat);
    }

    @Override
    public String toString() {
        return String.format("Megtakarítási számla { " + super.toString() + "; kamat: %.1f }", kamat);
    }
}
