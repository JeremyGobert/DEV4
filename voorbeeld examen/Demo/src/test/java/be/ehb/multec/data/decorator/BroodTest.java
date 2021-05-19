package be.ehb.multec.data.decorator;

import org.junit.jupiter.api.Test;

public class BroodTest {
    @Test
    void createBroodje() {
        Brood brood = new KipCoery();
        /*beverage = new Mocha(beverage);
        beverage = new Mocha(beverage);
        beverage = new Whip(beverage);*/
        System.out.println(brood.getDescription()+ " " + brood.cost()+ "$");
    }
}
