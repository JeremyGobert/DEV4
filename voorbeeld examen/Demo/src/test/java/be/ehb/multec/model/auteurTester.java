package be.ehb.multec.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class auteurTester {
    @Test
        public void maakauteur() {
        auteur a1 = new auteur("vic", "kwanten", LocalDate.of(2001, 4, 18));
        System.out.println(a1);
        auteur a2 = new auteur("vic", "kwanten", null);
        System.out.println(a2);
    }

    @Test
    public void maakauteurWithIllegalArguments() {
        assertThrows(IllegalArgumentException.class, () -> {
            new auteur("vic", "\t\r\n", LocalDate.of(2001, 4, 18));
        });
    }
}