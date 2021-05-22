package be.ehb.multec.data.decorator;

import org.junit.jupiter.api.Test;

public class BroodTest {
    @Test
    void createBroodje() {
        Brood brood = new KipCoery();
        System.out.println(brood.getDescription()+ " " + brood.cost()+ "$");
    }
}
