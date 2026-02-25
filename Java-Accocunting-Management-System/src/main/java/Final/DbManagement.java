package Final;

import java.util.List;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class DbManagement {

    private final String connectionString = "jdbc:mysql://localhost:3306/accounting_system?serverTimezone=Europe/Istanbul";
    Connection connection = null;
    public User user = null;

    public DbManagement() {
        connection = getConnection();
    }

    public Connection getConnection() {
        try {

            Connection conn = DriverManager.getConnection(connectionString, "root", "yunus12345");
            System.out.println("MySQL baglantisi basarili!");
            return conn;

        } catch (SQLException e) {
            System.err.println("SQL Hatası: " + e.getMessage());
            return null;
        }
    }

    public boolean add(String username, String password, String type) throws SQLException {
        String sql = "INSERT INTO users (username, password, type) VALUES (?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, type);
            int rows = ps.executeUpdate();
            return rows > 0;
        }
    }

    public boolean update(int userId, String newname, String newPassword, String newType) throws SQLException {
        String sql = "UPDATE users SET username = ?, password = ?, type = ? WHERE user_id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, newname);
            ps.setString(2, newPassword);
            ps.setString(3, newType);
            ps.setInt(4, userId);
            int rows = ps.executeUpdate();
            return rows > 0;
        }
    }

    public boolean deleteUser(int userId) throws SQLException {
        String sql = "DELETE FROM users WHERE user_id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, userId);
            int rows = ps.executeUpdate();
            return rows > 0;
        }
    }

    public boolean checkLogin(String username, String password) throws SQLException {
        String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
        try (Connection conn = DriverManager.getConnection(connectionString, "root", "yunus12345"); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, username);
            ps.setString(2, password);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        }
    }

    public boolean isUserOfType(String username, String type) {
        String sql = "SELECT 1 FROM users WHERE username = ? AND type = ?";
        try (Connection conn = DriverManager.getConnection(connectionString, "root", "yunus12345"); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, username.trim());
            ps.setString(2, type);
            try (ResultSet rs = ps.executeQuery()) {
                return rs.next();
            }
        } catch (SQLException e) {
            e.getMessage();
            return false;
        }
    }

    public List<User> getAllUsers() throws SQLException {
        List<User> userList = new ArrayList<>();
        String sql = "SELECT * FROM users";
        try (PreparedStatement ps = connection.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int id = rs.getInt("user_id");
                String name = rs.getString("username");
                String pass = rs.getString("password");
                String type = rs.getString("type");
                User user = new User(id, name, pass, type);
                userList.add(user);
            }
        }
        return userList;
    }

    public boolean updateUser(int userId, String username, String password, String type) throws SQLException {
        String sql = "UPDATE users SET username = ?, password = ?, type = ? WHERE user_id = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, username);
            ps.setString(2, password);
            ps.setString(3, type);
            ps.setInt(4, userId);
            int rows = ps.executeUpdate();
            return rows > 0;
        }
    }

    public List<User> searchUsers(String keyword) throws SQLException {
        List<User> userList = new ArrayList<>();
        String sql = "SELECT * FROM users WHERE username LIKE ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, "%" + keyword + "%");
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("user_id");
                    String username = rs.getString("username");
                    String password = rs.getString("password");
                    String type = rs.getString("type");
                    userList.add(new User(id, username, password, type));
                }
            }
        }
        return userList;
    }

    public boolean add(String type, String category, float amount, String description, String currency, String username) throws SQLException {
        String sql = "INSERT INTO transactions (type, category, amount, description, currency, username) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(connectionString, "root", "yunus12345"); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, type);
            ps.setString(2, category);
            ps.setFloat(3, amount);
            ps.setString(4, description);
            ps.setString(5, currency);
            ps.setString(6, username);
            return ps.executeUpdate() > 0;
        }
    }

    public boolean update(int id, String type, String category, float amount, String description, String currency) throws SQLException {
        String sql = "UPDATE transactions SET  type = ?, category = ?, amount = ?, description = ?, currency = ? WHERE transaction_id = ?";
        try (Connection conn = DriverManager.getConnection(connectionString, "root", "yunus12345"); PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, type);
            ps.setString(2, category);
            ps.setFloat(3, amount);
            ps.setString(4, description);
            ps.setString(5, currency);
            ps.setInt(6, id);
            return ps.executeUpdate() > 0;
        }
    }

    public boolean delete(int id) throws SQLException {
        String sql = "DELETE FROM transactions WHERE transaction_id = ?";
        try (Connection conn = DriverManager.getConnection(connectionString, "root", "yunus12345"); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            return ps.executeUpdate() > 0;
        }
    }

    public List<Transaction> getAllTransactions() throws SQLException {
        List<Transaction> list = new ArrayList<>();
        String sql = "SELECT * FROM transactions";
        try (PreparedStatement ps = connection.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                Transaction t = new Transaction(
                        rs.getInt("transaction_id"),
                        rs.getDate("transaction_date").toString(), // date sütununu alıyoruz
                        rs.getString("type"),
                        rs.getString("category"),
                        rs.getFloat("amount"),
                        rs.getString("description"),
                        rs.getString("currency"),
                        rs.getString("username")
                );
                list.add(t);
            }
        }
        return list;
    }

    public List<Transaction> getTransactionsByCategory(String categoryFilter) throws SQLException {
        List<Transaction> list = new ArrayList<>();
        String sql = "SELECT * FROM transactions WHERE category = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setString(1, categoryFilter);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Transaction t = new Transaction(
                            rs.getInt("transaction_id"),
                            rs.getDate("transaction_date").toString(),
                            rs.getString("type"),
                            rs.getString("category"),
                            rs.getFloat("amount"),
                            rs.getString("description"),
                            rs.getString("currency"),
                            rs.getString("username")
                    );
                    list.add(t);
                }
            }
        }
        return list;
    }

    public List<Transaction> getTransactionsByTypeAndMonth(int month) throws SQLException {
        List<Transaction> list = new ArrayList<>();
        String sql = "SELECT * FROM transactions WHERE  MONTH(transaction_date) = ?";
        try (PreparedStatement ps = connection.prepareStatement(sql)) {
            ps.setInt(1, month);
            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    Transaction t = new Transaction(
                            rs.getInt("transaction_id"),
                            rs.getTimestamp("transaction_date").toString(),
                            rs.getString("type"),
                            rs.getString("category"),
                            rs.getFloat("amount"),
                            rs.getString("description"),
                            rs.getString("currency"),
                            rs.getString("username")
                    );
                    list.add(t);
                }
            }
        }
        return list;
    }

}
