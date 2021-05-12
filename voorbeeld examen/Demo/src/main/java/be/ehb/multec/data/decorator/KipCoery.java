package be.ehb.multec.data.decorator;

public class KipCoery extends Brood {
    public KipCoery() {
        setDescription("Broodje KipCoery");
    }

    @Override
    protected double cost() {
        return 184.12;
    }
}
