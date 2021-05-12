package be.ehb.multec.data.decorator;

import org.junit.jupiter.api.Test;

public class BeverageTest {
    @Test
    void createBeverage() {
        Brood beverage = new KipCoery();
        /*beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);*/
        System.out.println(beverage.getDescription()+ " " + beverage.cost()+ "$");
    }
}
