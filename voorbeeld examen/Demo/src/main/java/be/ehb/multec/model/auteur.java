package be.ehb.multec.model;

import java.time.LocalDate;
import java.util.Objects;

public class auteur {
    private int id;
    private String naam;
    private String voornaam;
    private LocalDate geboortedatum;

    public auteur(String naam, String voornaam, LocalDate geboortedatum) {
        this(-1, naam, voornaam, geboortedatum);
    }

    public auteur(int id, String naam, String voornaam, LocalDate geboortedatum) {
        if (voornaam == null || voornaam.trim(). length() == 0) throw new IllegalArgumentException("Naam kan niet null zijn");
        this.id = id;
        this.naam = naam.trim();
        this.voornaam = voornaam.trim();
        this.geboortedatum = geboortedatum;
    }

  


    public String getNaam() {
        return naam;
    }

    public String getVoornaam() {
        return voornaam;
    }

    public LocalDate getGeboortedatum() {
        return geboortedatum;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (this.id == -1) this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof auteur)) return false;
        auteur auteur = (auteur) o;
        return id == auteur.id &&
                getNaam().equals(auteur.getNaam()) &&
                getVoornaam().equals(auteur.getVoornaam()) &&
                getGeboortedatum().equals(auteur.getGeboortedatum());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNaam(), getVoornaam(), getGeboortedatum());
    }

    @Override
    public String toString() {
        return "Auteur:" +
                "id=" + id +
                ", Naam='" + naam + '\'' +
                ", Voornaam='" + voornaam + '\'' +
                ", Geboortedatum=" + geboortedatum +
                '.';
    }
}
