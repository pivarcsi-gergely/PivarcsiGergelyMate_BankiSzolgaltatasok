package hu.petrik;

public class BankiSzolgaltatas {

    private Tulajdonos tulajdonos;

    public BankiSzolgaltatas(Tulajdonos tulajdonos) {
        this.tulajdonos = tulajdonos;
    }

    public Tulajdonos getTulajdonos() {
        return tulajdonos;
    }

    @Override
    public String toString() {
        return String.format("Tulajdonos: %s", getTulajdonos().getNev());
    }
}
