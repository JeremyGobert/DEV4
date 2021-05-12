package be.ehb.multec.data.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public final class MySqlConnection {

    private static final String URL = "jdbc:mysql://localhost/werkstuk_db?serverTimezone=UTC";
    private static final String USER = "root";
    private static final String PWD = "Development123.";
    private static final String SQL_FILE = "werkstuk_db.sql";

    private MySqlConnection() {
    }

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PWD);
    }

    public static void resetDatabase() {
        try (Scanner s = new Scanner(new File(SQL_FILE));
             Connection con = getConnection();
             Statement stmt = con.createStatement();) {

            StringBuffer content = new StringBuffer();
            while (s.hasNext())
                content.append(s.nextLine());
            String[] sqlStatements = content.toString().split(";");

            for (String sqlStatement : sqlStatements)
                stmt.addBatch(sqlStatement);
            stmt.executeBatch();

        } catch (FileNotFoundException | SQLException e) {
            System.err.println(e);
        }
    }
}