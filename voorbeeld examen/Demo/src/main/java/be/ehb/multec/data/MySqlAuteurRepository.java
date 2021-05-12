package be.ehb.multec.data;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import be.ehb.multec.data.util.*;
import be.ehb.multec.model.*;



public class MySqlAuteurRepository implements AuteurRepository {
   @Override
    public List<auteur> getauteurs(String nameFilter, boolean caseSensitive) {
        if(nameFilter == null) nameFilter = "";
        nameFilter = nameFilter.trim(); 
        List<auteur> auteurs = new ArrayList<>();
        String SQL_SELECT_AUTEUR = "select * from auteur where concat(naam, ' ', voornaam) like concat('%',?,'%')";
        if(caseSensitive) SQL_SELECT_AUTEUR = "select * from auteur where concat(naam, ' ', voornaam) like binary concat('%',?,'%')";
        try(Connection con = MySqlConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_SELECT_AUTEUR)) {

            stmt.setString(1, nameFilter);
            try(ResultSet rs = stmt.executeQuery()) {
                while (rs.next())
                    auteurs.add(resultsSet2Student(rs));
            }
            
        } catch(SQLException e) {
            System.err.println(e);
        }
        return auteurs;
    }

    @Override
    public auteur getauteur(int id) {
        auteur auteur = null;
        final String SQL_SELECT_AUTEUR = "select * from auteur where id = ?";
        try(Connection con = MySqlConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_SELECT_AUTEUR)) {

            stmt.setInt(1, id);

            try(ResultSet rs = stmt.executeQuery()) {
                if (rs.next())
                    auteur = resultsSet2Student(rs);
            }

        } catch(SQLException e) {
            System.err.println(e);
        }
        return auteur;
    }

    @Override
    public void removeauteur(auteur auteur) {
        final String SQL_DELETE_AUTEUR = "delete from auteur where id = ?";
        try(Connection con = MySqlConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_DELETE_AUTEUR)) {

            stmt.setInt(1, auteur.getId());
            int affectedRows = stmt.executeUpdate();
            //System.out.println(affectedRows);

        } catch(SQLException e) {
            System.err.println(e);
        }
    }

    @Override
    public void updateauteur(int id, String nameFilter) {
        if(nameFilter == null) nameFilter = "";
        nameFilter = nameFilter.trim();
        final String SQL_SELECT_AUTEUR = "update werkstuk_db.auteur set naam = ? where id = ?";
        try(Connection con = MySqlConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_SELECT_AUTEUR)) {

            stmt.setString(1, nameFilter);
            stmt.setInt(2, id);

            stmt.execute();

        } catch(SQLException e) {
            System.err.println(e);
        }
    }

    @Override
    public void addauteur(auteur auteur) {
            final String SQL_INSERT_AUTEUR = "insert into auteur(naam, voornaam, geboortedatum) values(?, ?, ?)";
        try(Connection con = MySqlConnection.getConnection();
            //PreparedStatement stmt = con.prepareStatement(SQL_INSERT_STUDENT, new String[] {"id", "created"})) {
            PreparedStatement stmt = con.prepareStatement(SQL_INSERT_AUTEUR, PreparedStatement.RETURN_GENERATED_KEYS)) {

            student2PreparedStatement(auteur, stmt);


            int affectedRows = stmt.executeUpdate();
            //System.out.println(affectedRows);
            try(ResultSet rsKey = stmt.getGeneratedKeys()) {
                if (rsKey.next()) auteur.setId(rsKey.getInt(1));
            }

        } catch (SQLException e) {
            System.err.println(e);
        }
    }

 /*   @Override
    public List<boeks> zoekauteur(int id){
        List<boeks> boek = new ArrayList<>();
        String SQL_SELECT_AUTEUR = "select * from boek where (auteur) = (?)";
        try(Connection con = MySqlConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_SELECT_AUTEUR)) {
            stmt.setInt(1, id);
            try(ResultSet rs = stmt.executeQuery()) {
                while (rs.next())
                    boek.add(resultsSetBoeken(rs));
            }
        } catch(SQLException e) {
            System.err.println(e);
        }
        return boek;
    }*/

    private void student2PreparedStatement(auteur auteur, PreparedStatement stmt) throws SQLException {
        stmt.setString(1, auteur.getNaam());
        stmt.setString(2, auteur.getVoornaam());
        stmt.setDate(3, Date.valueOf(auteur.getGeboortedatum()));
    }

    private auteur resultsSet2Student(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String naam = rs.getString("naam");
        String voornaam = rs.getString("voornaam");
        LocalDate geboortedatum = rs.getDate("geboortedatum").toLocalDate();
        auteur auteur = new auteur(id, naam, voornaam, geboortedatum);
        return auteur;
    }

    private boek resultsSetBoeken(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String titel = rs.getString("titel");
        Genre genre = Genre.valueOf(rs.getString("genre"));
        double prijs = rs.getDouble("prijs");
        double paginas = rs.getDouble("paginas");
        int auteur = rs.getInt("auteur");
        int isbn = rs.getInt("isbn");
        boek boek = new boek(id, titel, prijs, paginas, auteur, isbn, genre);
        return boek;
    }

}