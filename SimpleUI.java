
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleUI {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Simple GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250,300);

        JPanel panel= new JPanel();
        JLabel label = new JLabel("Username");
        JTextField textField = new JTextField(20);
        JLabel passwordLabel = new JLabel("Password");
        JTextField passwordField = new JTextField(20);
        JButton button = new JButton("Login");
        button.addActionListener(e -> {
            String username = textField.getText();
            String password = passwordField.getText();
            if (username.equals("admi") && password.equals("Pass")) {
                JOptionPane.showMessageDialog(frame, "Hello, " + username);
            } else {
                JOptionPane.showMessageDialog(frame, "Incorrect password.");
            }
        });
        panel.add(label);
        panel.add(textField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}
