package be.ehb.multec.data.decorator;

public class Kip extends Brood {
    public Kip() {
        setDescription("Broodje kip");
    }

    @Override
    protected double cost() {
        return 45.88;
    }
}
