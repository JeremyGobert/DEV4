package be.ehb.multec.data.decorator;

public class Prepare extends Brood {
    public Prepare() {
        setDescription("Broodje Prepare");
    }

    @Override
    protected double cost() {
        return 0.05;
    }
}
