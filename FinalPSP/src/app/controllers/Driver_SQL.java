package app.controllers;

import app.utils.User;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Driver_SQL {
    private static Connection conexion = null;
    private String rutaJSON;


    public Driver_SQL() {
        try {
            conectar();
        } catch (SQLException ex) {
            Logger.getLogger(Driver_SQL.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



    static void conectar() throws SQLException {
        conexion = DriverManager.getConnection("jdbc:mysql://localhost:3306/login", "root", "");
    }



    public boolean acceder(String user, String password) throws SQLException {
            String sql = "SELECT * FROM user WHERE user='" + user + "' && password = '" + password + "'";
            ResultSet rs = conexion.prepareStatement(sql).executeQuery();

        if (rs.next()) {
            rutaJSON = rs.getString("User");
            return true;
        }

            return false;
    }


    public void agregar(User u) throws SQLException {
        String sql = "INSERT INTO user (user, email, password, name, surname, favgenre) values (?,?,?,?,?,?)";
        PreparedStatement ps = (PreparedStatement) conexion.prepareStatement(sql);
        ps.setString(1, u.getUser());
        ps.setString(2, u.getEmail());
        ps.setString(3, u.getPassword());
        ps.setString(4, u.getName());
        ps.setString(5, u.getSurname());
        ps.setString(6, u.getFavgenre());

        ps.executeUpdate();
    }



    public void borrar(int user) throws SQLException {
        String sql = "DELETE FROM user WHERE user = '" + user + "';";

        PreparedStatement ps = (PreparedStatement) conexion.prepareStatement(sql);
        ps.executeUpdate();
    }

    /*
    public ArrayList listarTodo(String sql) throws SQLException {
        ArrayList lista = new ArrayList();

        PreparedStatement ps = (PreparedStatement) conexion.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            String user = rs.getString("username");

            lista.add(new User(user));
        }

        return lista;
    }
    */

    private void desconectar() throws SQLException {
        conexion.close();
    }

    public String getRutaJSON() {
        return rutaJSON;
    }


    public String SHA512(String passwordToHash, String salt) {
        String generatedPassword = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-512");
            md.update(salt.getBytes(StandardCharsets.UTF_8));
            byte[] bytes = md.digest(passwordToHash.getBytes(StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < bytes.length; i++) {
                sb.append(Integer.toString((bytes[i] & 0xff) + 0x100, 16).substring(1));
            }
            generatedPassword = sb.toString();
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        return generatedPassword;
    }

}
