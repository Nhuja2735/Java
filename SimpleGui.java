
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class SimpleGui {
	public static void main(String[] args){
        JFrame frame=new JFrame("Simple GUI");
        frame.setDefaultCloseOperation((JFrame.EXIT_ON_CLOSE));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,200);
        JPanel panel=new JPanel();
        JLabel label= new JLabel("Enter your Name:");
        JTextField textField= new JTextField(20);
        JButton button=new JButton("Submit");
        button.addActionListener(e->{
            String name= textField.getText();
            JOptionPane.showMessageDialog(frame, "Hello," + name);
        });
        panel.add(label);
        panel.add(textField);
        panel.add(button);
        frame.add(panel);
        frame.setVisible(true);
    }
}
