import guimarketing.CheckBoxDemo;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class newframe extends JFrame {

public static void main(String[] args) {
newframe frameTabel = new newframe();
}

JButton welcome = new JButton("take me to products ");
JButton panel = new JButton();

newframe(){
super("Welcome");
setSize(300,200);
setLocation(500,280);
panel.setLayout (null);

welcome.setBounds(70,50,150,60);

panel.add(welcome);

getContentPane().add(panel);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setVisible(true);
welcome.addActionListener(new ActionListener() {
    @Override
    public void actionPerformed(ActionEvent ae) {
      MyGridLayout checkFace =new MyGridLayout();
checkFace.setVisible(true);
dispose();
    }
});
}




}