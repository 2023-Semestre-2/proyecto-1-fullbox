/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Classes;

import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import main.MainMenu;
import main.Login;
/**
 *
 * @author saimo
 */
public class VerifyUsers {
    private String username;
    private String password;
    private boolean remember;
    public boolean pass = false;
    
    public VerifyUsers(String username, String password, boolean remember) {
        this.username = username;
        this.password = password;
        this.remember = remember;
        String rutabd = Paths.get("src", "DataBase", "usuarios.accdb").toString();
        String url = "jdbc:ucanaccess://" + rutabd;
        try (Connection connection = DriverManager.getConnection(url)) {
            String requestSQL = "SELECT * FROM BaseDeDatos WHERE USERNAME=?";
            try (PreparedStatement UserStatement = connection.prepareStatement(requestSQL)) {
                UserStatement.setString(1, username);
                try (ResultSet resultSet = UserStatement.executeQuery()) {
                    if (resultSet.next()) {
                        if ((resultSet.getBoolean("rememberMe"))) {
                            this.pass = true;
                            MainMenu open = new MainMenu();
                            open.setUsernameText(username);
                            open.setVisible(true);
                        }else{
                            String storedPassword = resultSet.getString("Password"); 
                            if (password.equals(storedPassword)) {
                                if (remember && !resultSet.getBoolean("rememberMe")) {
                                    updateRememberMeFlag(connection, true);
                                }
                                    this.pass = true;
                                    MainMenu open = new MainMenu();
                                    open.setUsernameText(username);
                                    open.setVisible(true);
                                  
                            } else {
                                JOptionPane.showMessageDialog(null, "Username/Password not found");
                            }
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Username/Password not found");
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Username/Password not found");
        }
    }
    private void updateRememberMeFlag(Connection connection, boolean value) throws SQLException {
        String updateRememberMeSQL = "UPDATE BaseDeDatos SET rememberMe=? WHERE Username=?";
        try (PreparedStatement updateStatement = connection.prepareStatement(updateRememberMeSQL)) {
            updateStatement.setBoolean(1, value);
            updateStatement.setString(2, username);
            updateStatement.executeUpdate();
        }
    }
    
}
