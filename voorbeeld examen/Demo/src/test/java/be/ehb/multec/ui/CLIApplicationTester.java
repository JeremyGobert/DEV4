/*package be.ehb.multec.ui;
import be.ehb.multec.model.*;
import org.junit.jupiter.api.Test;


import java.time.LocalDate;


import java.util.List;

import static be.ehb.multec.data.Repositories.getAuteurRepository;
import static be.ehb.multec.data.Repositories.getBoekRepository;

class CLIApplicationTester {
    @Test
    public void testSearch() {
        System.out.println("*****Search Auteur By Id");
        System.out.println(getAuteurRepository().getauteur(2));
    }

    @Test
    public void removeAuteur() {
        System.out.println("*****Remove auteur");
        getAuteurRepository().removeauteur(new auteur(3, "N/A", "N/A", null));
        System.out.println(getAuteurRepository().getauteur(4));
    }

    @Test
    public void searchAuteur() {
        System.out.println("*****Search auteur ");
        List<auteur> auteurs = getAuteurRepository().getauteurs("wis", false);
        System.out.println(auteurs);
    }

    @Test
    public void allAuteur() {
        System.out.println("*****All auteur");
        List<auteur> auteurs = getAuteurRepository().getauteurs(null, false);
        System.out.println(auteurs);
    }

    @Test
    public void addAuteur() {
        System.out.println("*****ADD auteur");
        auteur auteur = new auteur( "Adams", "Richard", LocalDate.of(2005, 5, 4));
        getAuteurRepository().addauteur(auteur);
        System.out.println(getAuteurRepository().getauteur(6));
        System.out.println(auteur);
    }

    @Test
    public void updateauteur() {
        System.out.println("*****update auteur");
        System.out.println(getAuteurRepository().getauteur(2));
        getAuteurRepository().updateauteur(2, "Bruno");
        System.out.println(getAuteurRepository().getauteur(2));
    }



    //BOEK

    @Test
    public void SearchBoekId() {
        System.out.println("*****boek WITH id");
        System.out.println(getBoekRepository().getboek(5));
    }

    @Test
    public void removeBoek() {
        System.out.println("*****Remove boek");
        getBoekRepository().removeboek(new boek(2, "N/A", 0, 0, 0, 0, Genre.THRILLER));
        System.out.println(getBoekRepository().getboek(2));
    }

    @Test
    public void updateBoek() {
        System.out.println("*****update boek");
        System.out.println(getBoekRepository().getboek(3));
        getBoekRepository().updateBoek(3, "Het diner");
        System.out.println(getBoekRepository().getboek(3));
    }

    @Test
    public void addBoek() {
        System.out.println("*****ADD boek ");
        boek boek = new boek("Watership Down", 54, 154, 3, 9, Genre.ROMAN);
        getBoekRepository().addboek(boek);
        System.out.println(getBoekRepository().getboek(6));
        System.out.println(boek);
    }

    @Test
    public void testZoekFunctie (){
        try{
            System.out.println("*****search ");
            System.out.println(Repositories.getBoekRepository().getboeks("Lolita"));
        } catch (Exception e){
            System.err.println(e);
        }
    }

    @Test
    public void allBoek() {
        System.out.println("*****All boek ");
        List<boek> boeks = getBoekRepository().getboeks(null);
        System.out.println(boeks);
    }

}*/