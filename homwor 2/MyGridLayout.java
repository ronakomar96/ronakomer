
package guimarketing;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;


public class MyGridLayout {

 
JFrame f;  
MyGridLayout(){  
    f=new JFrame();  
      
    JButton  button1=new JButton("milk ");  
    JButton  button2=new JButton(" meats");  
    JButton  button3=new JButton("fruits");  
    JButton  button4=new JButton("vegatables");  
    JButton  button5=new JButton(" others");  
        
          
    f.add( button1);f.add(button2);f.add(button3);f.add(button4);f.add(button5);  
     
  
    f.setLayout(new GridLayout(3,3));  
 
  
    f.setSize(300,300);  
    f.setVisible(true);  
}  
public static void main(String[] args) {  
    new MyGridLayout();  
    
} 

} 

