/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.nio.file.Paths;
import javax.swing.JOptionPane;
import main.MainMenu;
/**
 *
 * @author saymon
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
        String csvFilePath = Paths.get("src", "DataBase", "usuarios.csv").toString();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                if (data[0].equals(username) && data[1].equals(password)) {
                    if (Boolean.parseBoolean(data[2])) {
                        this.pass = true;
                        MainMenu open = new MainMenu();
                        open.setUsernameText(username);
                        open.setVisible(true);
                    } else {
                        String storedPassword = data[1];
                        if (password.equals(storedPassword)) {
                            if (remember) {
                                updateRememberMeFlag(data, true);
                            }
                            this.pass = true;
                            MainMenu open = new MainMenu();
                            open.setUsernameText(username);
                            open.setVisible(true);
                        } else {
                            JOptionPane.showMessageDialog(null, "Username/Password not found Pass");
                            break;
                        }
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Username/Password not found  User");
                    break;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Username/Password not found Exc");
        }
    }

    private void updateRememberMeFlag(String[] data, boolean value) {
        List<String> lines = new ArrayList<>();
        String csvFilePath = Paths.get("src", "DataBase", "usuarios.csv").toString();
        try (BufferedReader br = new BufferedReader(new FileReader(csvFilePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                if (line.startsWith(username)) {
                    line = String.join(",", data[0], data[1], String.valueOf(value));
                }
                lines.add(line);
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error updating remember me flag");
        }
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(csvFilePath))) {
            for (String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error updating remember me flag");
        }
    }
}
