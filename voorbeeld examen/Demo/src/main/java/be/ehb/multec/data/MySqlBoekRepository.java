package be.ehb.multec.data;

import java.sql.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import be.ehb.multec.data.util.*;
import be.ehb.multec.model.*;
import com.mysql.cj.util.StringUtils;


public class MySqlBoekRepository implements BoekRepository {
    @Override
    public List<boek> getboeks(String nameFilter) {
        if(nameFilter == null) nameFilter = "";
        nameFilter = nameFilter.trim();
        List<boek> boeks = new ArrayList<>();
        if(StringUtils.isStrictlyNumeric(nameFilter)) {
            String SQL_SELECT_BOEKEN = "select * from boek where id = ? OR isbn=?";
            try (Connection con = MySqlConnection.getConnection();
                 PreparedStatement stmt = con.prepareStatement(SQL_SELECT_BOEKEN)) {
                stmt.setString(1, nameFilter);
                stmt.setString(2, nameFilter);

                try (ResultSet rb = stmt.executeQuery()) {
                    if (rb.next()) {
                        boeks.add(resultsSet2Student(rb));
                    }
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
            return boeks;
        }else {
            String SQL_SELECT_BOEKEN = "select * from boek where titel =?";
            try (Connection con = MySqlConnection.getConnection();
                 PreparedStatement stmt = con.prepareStatement(SQL_SELECT_BOEKEN)) {
                stmt.setString(1, nameFilter);
                try (ResultSet rb = stmt.executeQuery()) {

                    while (rb.next()) {
                        boeks.add(resultsSet2Student(rb));
                    }
                }
            } catch (SQLException e) {
                System.err.println(e);
            }
            return boeks;
        }
     }

    public void updateBoek(int id, String nameFilter) {
        if(nameFilter == null) nameFilter = "";
        nameFilter = nameFilter.trim();
        final String SQL_SELECT_BOEK = "update werkstuk_db.boek set titel = ? where id = ?";
        try(Connection con = MySqlConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_SELECT_BOEK)) {

            stmt.setString(1, nameFilter);
            stmt.setInt(2, id);

            stmt.execute();

        } catch(SQLException e) {
            System.err.println(e);
        }
    }

    @Override
    public boek getboek(int id) {
        boek boek = null;
        final String SQL_SELECT_BOEK = "select * from boek where id = ?";
        try(Connection con = MySqlConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_SELECT_BOEK)) {

            stmt.setInt(1, id);

            try(ResultSet rs = stmt.executeQuery()) {
                if (rs.next())
                    boek = resultsSet2Student(rs);
            }

        } catch(SQLException e) {
            System.err.println(e);
        }
        return boek;
    }

    @Override
    public void removeboek(boek boek) {
        final String SQL_DELETE_BOEK = "delete from boek where id = ?";
        try(Connection con = MySqlConnection.getConnection();
            PreparedStatement stmt = con.prepareStatement(SQL_DELETE_BOEK)) {

            stmt.setInt(1, boek.getId());
            int affectedRows = stmt.executeUpdate();
            //System.out.println(affectedRows);

        } catch(SQLException e) {
            System.err.println(e);
        }
    }

    @Override
    public void addboek(boek boek) {
        final String SQL_INSERT_BOEK = "insert into boek(titel, prijs, paginas, auteur, isbn, genre) values(?, ?, ?, ?, ?, ?)";
        try(Connection con = MySqlConnection.getConnection();
            //PreparedStatement stmt = con.prepareStatement(SQL_INSERT_STUDENT, new String[] {"id", "created"})) {
            PreparedStatement stmt = con.prepareStatement(SQL_INSERT_BOEK, PreparedStatement.RETURN_GENERATED_KEYS)) {

            student2PreparedStudent(boek, stmt);


            int affectedRows = stmt.executeUpdate();
            //System.out.println(affectedRows);
            try(ResultSet rsKey = stmt.getGeneratedKeys()) {
                if (rsKey.next()) boek.setId(rsKey.getInt(1));
            }

        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    private void student2PreparedStudent(boek boek, PreparedStatement stmt) throws SQLException {
        stmt.setString(1, boek.getTitel());
        stmt.setDouble(2, boek.getPrijs());
        stmt.setDouble(3, boek.getPaginas());
        stmt.setInt(4, boek.getAuteur());
        stmt.setInt(5, boek.getIsbn());
        stmt.setString(6, boek.getGenre().toString());
    }

    private boek resultsSet2Student(ResultSet rs) throws SQLException {
        int id = rs.getInt("id");
        String titel = rs.getString("titel");
        double prijs = rs.getDouble("prijs");
        double paginas = rs.getDouble("paginas");
        int auteur = rs.getInt("auteur");
        int isbn = rs.getInt("isbn");
        Genre genre = Genre.valueOf(rs.getString("genre"));
        boek boek = new boek(id, titel, prijs, paginas, auteur, isbn, genre);
        return boek;
    }
}
