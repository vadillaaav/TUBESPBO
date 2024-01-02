package tubes;

class AdminController {
    private Admin model;
    private AdminView view;

    public AdminController(Admin model, AdminView view) {
        this.model = model;
        this.view = view;
    }

    public void login(String username, String password) {
        model.login(username, password);
    }

    public void logout() {
        model.logout();
    }

    public void aturJadwalKuis() {
        model.aturJadwalKuis();
    }

    public void tambahSoal() {
        model.tambahSoal();
    }

    public void lihatNilai() {
        model.lihatNilai();
    }

    public void showProfil() {
        model.showProfil();
    }

    public void showMatkul(String mataKuliah) {
        model.showMatkul(mataKuliah);
    }

    public void setUsername(String username) {
        model.setUsername(username);
    }

    public void setPassword(String password) {
        model.setPassword(password);
    }

    public String getUsername() {
        return model.getUsername();
    }

    public String getPassword() {
        return model.getPassword();
    }
}