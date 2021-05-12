package be.ehb.multec.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class boekTester {
    @Test
    public void maakboek() {
        boek b1 = new boek("titel", 155, 15, 1,15, Genre.DETECTIVE );
        System.out.println(b1);
    }
 
}