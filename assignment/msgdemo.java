import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class msgdemo<User> 
{
private Connection connection;
    
    public void UserDAO(Connection connection) {
        this.connection = connection;
    }
    
    public void addUser(User user) throws SQLException {
        String sql = "INSERT INTO user (fname, lname, email, mobile) VALUES";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, user.getFname());
            statement.setString(2, user.getLname());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getMobile());
            statement.executeUpdate();
        }
    }
    
    public void updateUser(User user) throws SQLException {
        String sql = "UPDATE user SET fname = ?, lname = ?, email = ?, mobile = ? WHERE uid = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, user.getFname());
            statement.setString(2, user.getLname());
            statement.setString(3, user.getEmail());
            statement.setString(4, user.getMobile());
            statement.setInt(5, user.getUid());
            statement.executeUpdate();
        }
    }
    
    public void deleteUser(int uid) throws SQLException {
        String sql = "DELETE FROM user WHERE uid = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, uid);
            statement.executeUpdate();
        }
    }
    
    public User getUserById(int uid) throws SQLException {
        String sql = "SELECT * FROM user WHERE uid = ?";
        try (PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, uid);
            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    return new User(
                        resultSet.getInt("uid"),
                        resultSet.getString("fname"),
                        resultSet.getString("lname"),
                        resultSet.getString("email"),
                        resultSet.getString("mobile"));
                }
            }
        }