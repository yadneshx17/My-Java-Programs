package SwingGui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login implements ActionListener {

    private static JPanel panel;
    private static JFrame frame;
    private static JLabel userLabel;
    private static JTextField userText;
    private static JLabel passwordText;
    private static JPasswordField userPass;
    private static JLabel success;


    public static void main(String[] args) {

        panel = new JPanel();

        frame = new JFrame();
        frame.setSize(350, 350);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);

        panel.setLayout(null);

        userLabel = new JLabel("User");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        userText = new JTextField();
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        passwordText = new JLabel("Password");
        passwordText.setBounds(10, 50, 80, 25);
        panel.add(passwordText);

        userPass = new JPasswordField();
        userPass.setBounds(100, 50, 165, 25);
        panel.add(userPass);

        JButton button = new JButton("Login");
        button.setBounds(10, 80, 80, 25);
        button.addActionListener(new Login());
        panel.add(button);

        success = new JLabel();
        success.setBounds(10, 110, 300, 25);
        panel.add(success);


        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String user = userText.getText();
        String password = passwordText.getText();
        System.out.println(user + ", " + passwordText);

        if(user.equals("Hawk") && password.equals("password123")) {
            success.setText("Login successful!");
        }
    }
}