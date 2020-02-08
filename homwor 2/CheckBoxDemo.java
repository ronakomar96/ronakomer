
package guimarketing;





import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
  
    
    
    public class CheckBoxDemo extends JPanel implements ActionListener {
        
    JButton chooseButton = new JButton("choose the productes ");
JCheckBox milkButton;
JCheckBox fruitButton;
JCheckBox meatsButton;
JCheckBox vegetableButton;
JButton goButton = new JButton("Go!");
 
public CheckBoxDemo() {
    
    chooseButton.addActionListener(this);
 milkButton= new JCheckBox("milk");
milkButton.setSelected(true);
   fruitButton= new JCheckBox("furit");
 fruitButton.setSelected(true);
  meatsButton= new JCheckBox("meats");
meatsButton.setSelected(true);
  vegetableButton= new JCheckBox("vegetable");
vegetableButton.setSelected(true);
goButton.addActionListener(this);


setLayout(new GridLayout(0, 1));

add(  chooseButton);
add( milkButton);
add( fruitButton);
add( meatsButton);
add(vegetableButton);
add(goButton);

}
    public static void main(String[] args) {
       
    JFrame frame = new JFrame("CheckBoxDemo");
frame.setDefaultCloseOperation(
JFrame.EXIT_ON_CLOSE);
frame.getContentPane().add(new CheckBoxDemo());
frame.pack();
frame.setVisible(true);
}
public void actionPerformed(ActionEvent e) {
if (fruitButton.isSelected()) {
System.out.println(" fruit = true");
   
    }

else {
System.out.println("fruit = false");
   
}

 if  (milkButton .isSelected()) {
   System.out.println(" milk =true");
}

        else{
        System.out.println("milk false");
        }
System.exit(0);

}







}

