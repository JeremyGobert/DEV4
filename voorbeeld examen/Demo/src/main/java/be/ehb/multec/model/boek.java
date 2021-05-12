package be.ehb.multec.model;

import java.time.LocalDate;
import be.ehb.multec.model.*;
import java.util.Objects;

public class boek {
    private int id;
    private String titel;
    private double prijs;
    private double paginas;
    private int auteur;
    private int isbn;
    
    private final Genre genre;

    public boek(String titel, double prijs, double paginas, int auteur, int isbn, Genre genre) {
        this(-1, titel, prijs, paginas, auteur, isbn, genre);
    }


    public boek(int id, String titel, double prijs, double paginas, int auteur, int isbn, Genre genre) {
        if (titel == null || titel.trim(). length() == 0) throw new IllegalArgumentException("titel kan niet null zijn");
        this.id = id;
        this.titel = titel.trim();
        this.prijs = prijs;
        this.paginas = paginas;
        this.auteur = auteur;
        this.isbn = isbn;
        this.genre = genre;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if (this.id == -1) this.id = id;
    }

    public String getTitel() {
        return titel;
    }

    public double getPrijs() {
        return prijs;
    }

    public double getPaginas() {
        return paginas;
    }

    public int getAuteur() {
        return auteur;
    }

    public int getIsbn() {
        return isbn;
    }

    public Genre getGenre() {
        return genre;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        boek boek = (boek) o;
        return id == boek.id &&
                Double.compare(boek.prijs, prijs) == 0 &&
                Double.compare(boek.paginas, paginas) == 0 &&
                auteur == boek.auteur &&
                isbn == boek.isbn &&
                Objects.equals(titel, boek.titel) &&
                genre == boek.genre;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, titel, prijs, paginas, auteur, isbn, genre);
    }

    @Override
    public String toString() {
        return "boek{" +
                "id=" + id +
                ", titel='" + titel + '\'' +
                ", prijs=" + prijs +
                ", paginas=" + paginas +
                ", auteur=" + auteur +
                ", isbn=" + isbn +
                ", genre=" + genre +
                '}';
    }
}
