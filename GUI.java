
package gui;

import javax.swing.JOptionPane;


public class GUI {

    public static void main(String[] args) {
       
        String m=JOptionPane.showInputDialog(null, "Enter an integer ","Input ",JOptionPane.QUESTION_MESSAGE);
        System.out.println(m);
    int i = Integer.parseInt(m);
    
        if (i%2==0){
                        JOptionPane.showMessageDialog(null, "This number is Even");
        }
        else 
JOptionPane.showMessageDialog(null, "This number is Odd");        int n;
        n = JOptionPane.showConfirmDialog(null, "Do another ",
                
                "Select an option ",JOptionPane.YES_NO_CANCEL_OPTION);
        if (n==JOptionPane.YES_OPTION){
JOptionPane.showInputDialog(null, "Enter an integer ","Input ",JOptionPane.QUESTION_MESSAGE);
        System.out.println(m);
    Integer.parseInt(m);
    
        if (i%2==0){
                        JOptionPane.showMessageDialog(null, "This number is Even");
        }
        else 
JOptionPane.showMessageDialog(null, "This number is Odd"); }
        if (n==JOptionPane.NO_OPTION)
            JOptionPane.showMessageDialog(null, "lier");
        else {
            n=JOptionPane.showConfirmDialog(null, "Do another", "Select an option",JOptionPane.NO_OPTION);
            
        }
}
}