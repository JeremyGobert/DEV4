package be.ehb.multec.data.iterator;

public class MenuItem {
    private String name;
    /*private double price;*/

    /*public MenuItem(String name, double price)*/
    public MenuItem(String name) {
        this.name = name;
        /*this.price = price;*/
    }

    @Override
    public String toString() {
        return name;
        /*return name + " €" + price;*/
    }

    /*public double getPrice() {
        return price;
    }*/
}
