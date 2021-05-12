package be.ehb.multec.data;


import be.ehb.multec.model.*;
import java.sql.SQLException;
import java.util.List;


import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public interface AuteurRepository {
    auteur getauteur(int id);
    void removeauteur(auteur auteur);
    void addauteur(auteur auteur);
    List<auteur> getauteurs(String nameFilter, boolean caseSensitive);
    void updateauteur(int id, String nameFilter);
}
