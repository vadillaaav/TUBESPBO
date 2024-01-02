package tubes;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class AdminView {
    private JFrame frame;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private AdminController controller;

    public AdminView(AdminController controller) {
        this.controller = controller;

        frame = new JFrame("Admin Login");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 150);
        frame.setLayout(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        JLabel passwordLabel = new JLabel("Password:");
        usernameField = new JTextField();
        passwordField = new JPasswordField();
        JButton loginButton = new JButton("Login");

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                controller.login(username, password);
            }
        });

        frame.add(usernameLabel);
        frame.add(usernameField);
        frame.add(passwordLabel);
        frame.add(passwordField);
        frame.add(loginButton);

        frame.setVisible(true);
    }
    public void setController(AdminController controller) {
        this.controller = controller;
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }
    
    public void show() {
        frame.setVisible(true);
    }
}
