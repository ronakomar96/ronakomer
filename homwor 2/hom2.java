import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Log extends JFrame {

public static void main(String[] args) {
Log frameTabel = new Log();


}


JButton blogin = new JButton("Login");
JPanel panel = new JPanel();

    
JTextField txuser = new JTextField(15);
JPasswordField pass = new JPasswordField(15);
JLabel op = new JLabel ("username");

Log(){
super("Market ");
setSize(300,200);
setLocation(500,280);
panel.setLayout (null);


txuser.setBounds(70,30,150,20);
pass.setBounds(70,65,150,20);
blogin.setBounds(110,100,80,20);

panel.add(blogin);

panel.add(txuser);

panel.add(pass);

panel.add(op);
getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
actionlogin();
}

public void actionlogin(){
blogin.addActionListener(new ActionListener() {
public void actionPerformed(ActionEvent ae) {
String puname = txuser.getText();
String ppaswd = pass.getText();
String o = op.getText();
if(puname.equals("Ronak") && ppaswd.equals("1234")) {
newframe regFace =new newframe();
regFace.setVisible(true);
dispose();
} else {

JOptionPane.showMessageDialog(null,"Wrong Password / Username");
txuser.setText(" ");
pass.setText("");
txuser.requestFocus();
op.setText("  username");
op.setVisible(true);

}

}
});
}
}
