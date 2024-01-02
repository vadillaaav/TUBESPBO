package tubes;

import javax.swing.*;
import java.time.LocalDateTime;

class Admin {
    private int idAdmin;
    private String username;
    private String email;
    private String password;
    private LocalDateTime waktu;
    
    public Admin(String username, String email, String password, int idAdmin) {
        this.idAdmin = idAdmin;
        this.username = username;
        this.email = email;
        setPassword(password);
        this.waktu = LocalDateTime.now();
    }
    
    public void login(String enteredUsername, String enteredPassword) {
        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            JOptionPane.showMessageDialog(null, "Login successful. Welcome, " + username + "!");
        } else {
            JOptionPane.showMessageDialog(null, "Login failed. Invalid username or password.");
        }
    }
    
    public void logout() {
        JOptionPane.showMessageDialog(null, "Logging out. Goodbye, " + username + "!");
    }
    
    public void aturJadwalKuis() {
        JOptionPane.showMessageDialog(null, "Jadwal kuis diatur.");
    }
    
    public void tambahSoal() {
        JOptionPane.showMessageDialog(null, "Soal ditambahkan.");
    }
    
    public void lihatNilai() {
        JOptionPane.showMessageDialog(null, "Menampilkan nilai.");
    }
    
    public void showProfil() {
        JOptionPane.showMessageDialog(null,
                "ID Admin: " + idAdmin + "\nUsername: " + username + "\nEmail: " + email + "\nWaktu: " + waktu);
    }
    
    public void showMatkul(String mataKuliah) {
        JOptionPane.showMessageDialog(null,
                "Mata Kuliah: " + mataKuliah + "\nDosen Pengampu: " + "Contoh Dosen Pengampu");
    }

    public void setUsername(String newUsername) {
        this.username = newUsername;
    }
    
    public void setPassword(String newPassword) {
        
        this.password = hashPassword(newPassword);
    }
    
    public String getUsername() {
        return username;
    }
    
    public String getPassword() {
        return password;
    }
    
    private String hashPassword(String password) {
        
        return String.valueOf(password.hashCode());
    }
}