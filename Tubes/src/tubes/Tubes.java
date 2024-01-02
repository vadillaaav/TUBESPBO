
package tubes;


public class Tubes {
    public static void main(String[] args) {
        Admin model = new Admin("admin", "admin.com", "admin123", 1);
        AdminView view = new AdminView(new AdminController(model, null));
       
        view.show();
    }
}
