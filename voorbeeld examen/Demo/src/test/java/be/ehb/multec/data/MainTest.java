package be.ehb.multec.data;

import be.ehb.multec.data.decorator.Brood;
import be.ehb.multec.data.decorator.KipCoery;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {
    }

    @Test
    void getKipCoery() {
        System.out.println("******Get kipcoery******");
        Brood kipCoery = new KipCoery();
        System.out.println(kipCoery.getDescription()+ " " + ((KipCoery) kipCoery).cost()+ "$");
        System.out.println("************************");
    }
}