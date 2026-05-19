package jdbc.service;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import jdbc.model.Mahasiswa;

public class MysqlMahasiswaService {
    Connection koneksi = null;

    // Constructor
    public MysqlMahasiswaService() {
        try {
            String url = "jdbc:mysql://localhost:3306/jdbc_mhs"; 
            String user = "mahasiswa";
            String password = "12345678";
            
            koneksi = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            System.out.println("Gagal terhubung ke database: " + e.getMessage());
        }
    }

    /** Membuat objek mahasiswa */
    public Mahasiswa makeMhsObject() {
        return new Mahasiswa();
    }

    /** Menambahkan data mahasiswa */
    public void add(Mahasiswa mhs) {
        // id tidak diisi karena di database sudah AUTO_INCREMENT
        String sql = "INSERT INTO mahasiswa (nama) VALUES (?)";
        try {
            PreparedStatement pstmt = koneksi.prepareStatement(sql);
            pstmt.setString(1, mhs.getNama());
            pstmt.executeUpdate();
            System.out.println("Data mahasiswa berhasil ditambahkan.");
        } catch (SQLException e) {
            System.out.println("Gagal menambah data: " + e.getMessage());
        }
    }

    /** Update data mahasiswa */
    public void update(Mahasiswa mhs) {
        String sql = "UPDATE mahasiswa SET nama = ? WHERE id = ?";
        try {
            PreparedStatement pstmt = koneksi.prepareStatement(sql);
            pstmt.setString(1, mhs.getNama());
            pstmt.setInt(2, mhs.getId());
            pstmt.executeUpdate();
            System.out.println("Data mahasiswa berhasil diupdate.");
        } catch (SQLException e) {
            System.out.println("Gagal mengupdate data: " + e.getMessage());
        }
    }

    /** Delete data mahasiswa sesuai id */
    public void delete(int id) {
        String sql = "DELETE FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement pstmt = koneksi.prepareStatement(sql);
            pstmt.setInt(1, id);
            pstmt.executeUpdate();
            System.out.println("Data mahasiswa berhasil dihapus.");
        } catch (SQLException e) {
            System.out.println("Gagal menghapus data: " + e.getMessage());
        }
    }

    /** Ambil mahasiswa sesuai id */
    public Mahasiswa getById(int id) {
        Mahasiswa mhs = null;
        String sql = "SELECT * FROM mahasiswa WHERE id = ?";
        try {
            PreparedStatement pstmt = koneksi.prepareStatement(sql);
            pstmt.setInt(1, id);
            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()) {
                mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
            }
        } catch (SQLException e) {
            System.out.println("Gagal mengambil data: " + e.getMessage());
        }
        return mhs;
    }

    /** Ambil semua isi tabel mahasiswa */
    public List<Mahasiswa> getAll() {
        List<Mahasiswa> list = new ArrayList<>();
        String sql = "SELECT * FROM mahasiswa";
        try {
            Statement stmt = koneksi.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            
            while (rs.next()) {
                Mahasiswa mhs = new Mahasiswa();
                mhs.setId(rs.getInt("id"));
                mhs.setNama(rs.getString("nama"));
                list.add(mhs);
            }
        } catch (SQLException e) {
            System.out.println("Gagal mengambil semua data: " + e.getMessage());
        }
        return list;
    }
}