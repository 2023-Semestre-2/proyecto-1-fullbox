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
import java.sql.Statement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import main.MainMenu;

/**
 *
 * @author saimo
 */
public class VerifyUsers {
    private String username;
    private String password;

    public VerifyUsers(String Username, String Password) {
        this.username = Username;
        this.password = Password;
        String rutabd = Paths.get("src", "DataBase", "usuarios.accdb").toString();
        String url = "jdbc:ucanaccess://" + rutabd;

        try (Connection conexion = DriverManager.getConnection(url, username, password)) {
            
            String requestSQL = "SELECT * FROM BaseDeDatos WHERE Username";
            
            try (PreparedStatement statement = conexion.prepareStatement(requestSQL)) {
                statement.setString(1, username);

                try (ResultSet result = statement.executeQuery()) {
                    if (result.next()) {
                        String dbPassword = result.getString("");

                        // Verificar la contraseña
                        if (password.equals(dbPassword)) {
                            System.out.println("Contraseña correcta. Acceso concedido.");
                            MainMenu abrir = new MainMenu();
                            abrir.setVisible(true);
                        } else {
                            System.out.println("Contraseña incorrecta. Acceso denegado.");
                            JOptionPane.showMessageDialog(null, "Contraseña incorrecta, inténtelo nuevamente2.");
                        }
                    } else {
                        System.out.println("El usuario: '" + username + "' no existe.");
                        JOptionPane.showMessageDialog(null, "El usuario no existe.");
                    }
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }
}
