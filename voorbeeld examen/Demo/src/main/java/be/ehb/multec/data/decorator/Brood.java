package be.ehb.multec.data.decorator;


public abstract class Brood {
    protected String description;

    protected void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    protected abstract double cost();
}
