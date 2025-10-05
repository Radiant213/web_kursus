

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Koneksi {
    private static final String URL = "jdbc:mysql://localhost:3306/dbperpus"; 
    private static final String USER = "root"; // ganti sesuai user MySQL
    private static final String PASSWORD = ""; // ganti password MySQL kamu

    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); 
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException e) {
            throw new SQLException("Driver tidak ditemukan: " + e.getMessage());
        }
    }

    // Buat test koneksi langsung dari sini
    public static void main(String[] args) {
        try (Connection c = getConnection()) {
            if (c != null) {
                System.out.println("✅ Koneksi berhasil!");
            } else {
                System.out.println("❌ Koneksi gagal!");
            }
        } catch (SQLException e) {
            System.out.println("❌ Error: " + e.getMessage());
        }
    }
}
