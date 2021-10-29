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
        if (aktualisEgyenleg < osszeg){
            System.out.println("Kisebb az aktuális egyenleg, mint az összeg, ami kivevésre kerülne, ezért a kivétel sikertelen lett.");
            return false;
        }
        else{
            aktualisEgyenleg -= osszeg;
            return true;
        }
    }

    public void kamatJovairas(){
        aktualisEgyenleg += (aktualisEgyenleg*(kamat/100));
    }

    @Override
    public String toString() {
        return String.format("Megtakarítási számla { " + super.toString() + "; kamat: %.2f }", kamat);
    }
}
