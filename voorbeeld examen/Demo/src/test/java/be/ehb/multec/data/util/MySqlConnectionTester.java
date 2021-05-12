package be.ehb.multec.data.util;

import java.sql.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MySqlConnectionTester {
    @Test
    public void connectToMySql() {
        try {
            assertNotNull(MySqlConnection.getConnection());
        } catch (SQLException e) {
            fail(e);
            System.err.println("TIS KAPOT");
        }
    }
}
