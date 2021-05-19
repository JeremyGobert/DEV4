package be.ehb.multec.data.decorator;

public class Kip extends Brood {
    public Kip() {
        setDescription("Broodje kip");
    }

    @Override
    public double cost() {
        return 45.88;
    }
}
