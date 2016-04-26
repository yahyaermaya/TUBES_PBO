package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import tubes_pbo.Pelamar;

public class Database {
    private String server = "jdbc:mysql://localhost:3306/tubes_pbo", dbuser = "root", dbpass = "";
    private Statement st;
    private Connection con;

    public void connect() {
        try {
            con = DriverManager.getConnection(server, dbuser, dbpass);
            st = con.createStatement();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
    }
    
    public void savePelamar (String namaPelamar) throws SQLException{
        String query = "INSERT INTO 'pelamar'('namaPelamar') VALUES ('" + namaPelamar + "')";
        st.executeQuery(query);
    }
    
    public void savePerusahaan (String namaPerusahaan) throws SQLException {
        String query = "INSERT INTO 'perusahaan'('namaPerusahaan') VALUES ('" + namaPerusahaan + "')";
        st.executeQuery(query);
    }
    
    public void saveLowongan (String namaLowongan) throws SQLException {
        String query = "INSERT INTO 'lowongan'('namaLowongan') VALUES ('" + namaLowongan + "')";
        st.executeQuery(query);
    }
    
    public void saveBerkas (String namaBerkas) throws SQLException {
        String query = "INSERT INTO 'berkaslamaran'('namaBerkas') VALUES ('" + namaBerkas + "')";
        st.executeQuery(query);
    }
}
